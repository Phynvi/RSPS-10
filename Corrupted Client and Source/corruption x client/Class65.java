/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class65
{
    public int anInt819;
    public boolean aBoolean820 = false;
    public int anInt821;
    public int anInt822;
    public boolean aBoolean823;
    public int anInt824;
    public int anInt825;
    public Class130_Sub1 aClass130_Sub1_826;
    public boolean aBoolean827;
    public int[] anIntArray828;
    public int[] anIntArray829;
    public boolean aBoolean830;
    public int anInt831;
    
    public void method675(int[] arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	if (aBoolean820) {
	    if (arg5 > anInt825)
		arg5 = anInt825;
	    if (arg4 < 0)
		arg4 = 0;
	}
	if (arg4 < arg5) {
	    arg1 += arg4;
	    arg3 = arg5 - arg4 >> 2;
	    if (anInt819 == 0) {
		while (--arg3 >= 0) {
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		}
		arg3 = arg5 - arg4 & 0x3;
		while (--arg3 >= 0)
		    arg0[arg1++] = arg2;
	    } else if (anInt819 == 254) {
		if (arg5 <= anInt825 - 1) {
		    while (--arg3 >= 0) {
			arg0[arg1++] = arg0[arg1];
			arg0[arg1++] = arg0[arg1];
			arg0[arg1++] = arg0[arg1];
			arg0[arg1++] = arg0[arg1];
		    }
		    arg3 = arg5 - arg4 & 0x3;
		    while (--arg3 >= 0)
			arg0[arg1++] = arg0[arg1];
		}
	    } else {
		int i = anInt819;
		int i_0_ = 256 - anInt819;
		arg2 = (((arg2 & 0xff00ff) * i_0_ >> 8 & 0xff00ff)
			+ ((arg2 & 0xff00) * i_0_ >> 8 & 0xff00));
		while (--arg3 >= 0) {
		    int i_1_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_1_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_1_ & 0xff00) * i >> 8 & 0xff00));
		    i_1_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_1_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_1_ & 0xff00) * i >> 8 & 0xff00));
		    i_1_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_1_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_1_ & 0xff00) * i >> 8 & 0xff00));
		    i_1_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_1_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_1_ & 0xff00) * i >> 8 & 0xff00));
		}
		arg3 = arg5 - arg4 & 0x3;
		while (--arg3 >= 0) {
		    int i_2_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_2_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_2_ & 0xff00) * i >> 8 & 0xff00));
		}
	    }
	}
    }
    
    public int method676() {
	return anIntArray829[0] % anInt831;
    }
    
    public int method677() {
	return anIntArray829[0] / anInt831;
    }
    
    public void method678(int[] arg0, int[] arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7, int arg8, float arg9,
			  float arg10, float arg11, float arg12, float arg13,
			  float arg14) {
	if (aBoolean820) {
	    if (arg6 > anInt825)
		arg6 = anInt825;
	    if (arg5 < 0)
		arg5 = 0;
	}
	if (arg5 < arg6) {
	    arg4 += arg5;
	    arg7 += arg8 * arg5;
	    int i = arg6 - arg5;
	while_14_:
	    do {
		if (anInt819 == 0) {
		    do {
			if (aBoolean827) {
			    int i_3_ = arg5 - anInt822;
			    arg9 += arg12 * (float) i_3_;
			    arg10 += arg13 * (float) i_3_;
			    arg11 += arg14 * (float) i_3_;
			    int i_4_;
			    int i_5_;
			    if (arg11 != 0.0F) {
				i_4_ = (int) (arg9 * 4096.0F / arg11);
				i_5_ = (int) (arg10 * 4096.0F / arg11);
			    } else {
				i_4_ = 0;
				i_5_ = 0;
			    }
			    arg9 += arg12 * (float) i;
			    arg10 += arg13 * (float) i;
			    arg11 += arg14 * (float) i;
			    int i_6_;
			    int i_7_;
			    if (arg11 != 0.0F) {
				i_6_ = (int) (arg9 * 4096.0F / arg11);
				i_7_ = (int) (arg10 * 4096.0F / arg11);
			    } else {
				i_6_ = 0;
				i_7_ = 0;
			    }
			    arg2 = (i_4_ << 20) + i_5_;
			    int i_8_ = (((i_6_ - i_4_) / i << 20)
					+ (i_7_ - i_5_) / i);
			    i >>= 3;
			    arg8 <<= 3;
			    int i_9_ = arg7 >> 8;
			    if (aBoolean830) {
				if (i > 0) {
				    do {
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_9_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_9_
						  & 0xff0000)) >> 8;
					arg2 += i_8_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_9_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_9_
						  & 0xff0000)) >> 8;
					arg2 += i_8_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_9_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_9_
						  & 0xff0000)) >> 8;
					arg2 += i_8_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_9_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_9_
						  & 0xff0000)) >> 8;
					arg2 += i_8_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_9_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_9_
						  & 0xff0000)) >> 8;
					arg2 += i_8_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_9_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_9_
						  & 0xff0000)) >> 8;
					arg2 += i_8_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_9_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_9_
						  & 0xff0000)) >> 8;
					arg2 += i_8_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_9_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_9_
						  & 0xff0000)) >> 8;
					arg2 += i_8_;
					arg7 += arg8;
					i_9_ = arg7 >> 8;
				    } while (--i > 0);
				}
				i = arg6 - arg5 & 0x7;
				if (i > 0) {
				    do {
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_9_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_9_
						  & 0xff0000)) >> 8;
					arg2 += i_8_;
				    } while (--i > 0);
				}
			    } else {
				if (i > 0) {
				    do {
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_9_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_9_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_8_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_9_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_9_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_8_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_9_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_9_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_8_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_9_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_9_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_8_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_9_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_9_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_8_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_9_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_9_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_8_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_9_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_9_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_8_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_9_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_9_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_8_;
					arg7 += arg8;
					i_9_ = arg7 >> 8;
				    } while (--i > 0);
				}
				i = arg6 - arg5 & 0x7;
				if (i <= 0)
				    break;
				do {
				    if ((arg3
					 = arg1[(arg2 & 0xfc0) + (arg2
								  >>> 26)])
					!= 0)
					arg0[arg4] = (((arg3 & 0xff00ff) * i_9_
						       & ~0xff00ff)
						      + ((arg3 & 0xff00) * i_9_
							 & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_8_;
				} while (--i > 0);
			    }
			    break;
			}
			int i_10_ = arg5 - anInt822;
			arg9 += arg12 * (float) i_10_;
			arg10 += arg13 * (float) i_10_;
			arg11 += arg14 * (float) i_10_;
			int i_11_;
			int i_12_;
			if (arg11 != 0.0F) {
			    i_11_ = (int) (arg9 * 16384.0F / arg11);
			    i_12_ = (int) (arg10 * 16384.0F / arg11);
			} else {
			    i_11_ = 0;
			    i_12_ = 0;
			}
			arg9 += arg12 * (float) i;
			arg10 += arg13 * (float) i;
			arg11 += arg14 * (float) i;
			int i_13_;
			int i_14_;
			if (arg11 != 0.0F) {
			    i_13_ = (int) (arg9 * 16384.0F / arg11);
			    i_14_ = (int) (arg10 * 16384.0F / arg11);
			} else {
			    i_13_ = 0;
			    i_14_ = 0;
			}
			arg2 = (i_11_ << 18) + i_12_;
			int i_15_ = (((i_13_ - i_11_) / i << 18)
				     + (i_14_ - i_12_) / i);
			i >>= 3;
			arg8 <<= 3;
			int i_16_ = arg7 >> 8;
			if (aBoolean830) {
			    if (i > 0) {
				do {
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_16_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_16_
						       & 0xff0000)) >> 8;
				    arg2 += i_15_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_16_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_16_
						       & 0xff0000)) >> 8;
				    arg2 += i_15_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_16_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_16_
						       & 0xff0000)) >> 8;
				    arg2 += i_15_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_16_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_16_
						       & 0xff0000)) >> 8;
				    arg2 += i_15_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_16_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_16_
						       & 0xff0000)) >> 8;
				    arg2 += i_15_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_16_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_16_
						       & 0xff0000)) >> 8;
				    arg2 += i_15_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_16_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_16_
						       & 0xff0000)) >> 8;
				    arg2 += i_15_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_16_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_16_
						       & 0xff0000)) >> 8;
				    arg2 += i_15_;
				    arg7 += arg8;
				    i_16_ = arg7 >> 8;
				} while (--i > 0);
			    }
			    i = arg6 - arg5 & 0x7;
			    if (i > 0) {
				do {
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_16_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_16_
						       & 0xff0000)) >> 8;
				    arg2 += i_15_;
				} while (--i > 0);
				break;
			    }
			} else {
			    if (i > 0) {
				do {
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_16_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_16_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_15_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_16_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_16_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_15_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_16_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_16_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_15_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_16_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_16_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_15_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_16_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_16_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_15_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_16_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_16_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_15_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_16_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_16_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_15_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_16_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_16_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_15_;
				    arg7 += arg8;
				    i_16_ = arg7 >> 8;
				} while (--i > 0);
			    }
			    i = arg6 - arg5 & 0x7;
			    if (i <= 0)
				break while_14_;
			    do {
				if ((arg3
				     = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_16_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_16_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_15_;
			    } while (--i > 0);
			}
		    } while (false);
		    break;
		}
		int i_17_ = anInt819;
		int i_18_ = 256 - anInt819;
		if (aBoolean827) {
		    int i_19_ = arg5 - anInt822;
		    arg9 += arg12 * (float) i_19_;
		    arg10 += arg13 * (float) i_19_;
		    arg11 += arg14 * (float) i_19_;
		    int i_20_;
		    int i_21_;
		    if (arg11 != 0.0F) {
			i_20_ = (int) (arg9 * 4096.0F / arg11);
			i_21_ = (int) (arg10 * 4096.0F / arg11);
		    } else {
			i_20_ = 0;
			i_21_ = 0;
		    }
		    arg9 += arg12 * (float) i;
		    arg10 += arg13 * (float) i;
		    arg11 += arg14 * (float) i;
		    int i_22_;
		    int i_23_;
		    if (arg11 != 0.0F) {
			i_22_ = (int) (arg9 * 4096.0F / arg11);
			i_23_ = (int) (arg10 * 4096.0F / arg11);
		    } else {
			i_22_ = 0;
			i_23_ = 0;
		    }
		    arg2 = (i_20_ << 20) + i_21_;
		    int i_24_
			= ((i_22_ - i_20_) / i << 20) + (i_23_ - i_21_) / i;
		    i >>= 3;
		    arg8 <<= 3;
		    int i_25_ = arg7 >> 8;
		    if (aBoolean830) {
			if (i > 0) {
			    do {
				int i_26_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_25_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_25_
					   & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_26_ & 0xff00ff) * i_17_
						  + (arg3 & 0xff00ff) * i_18_)
						 & ~0xff00ff)
						+ (((i_26_ & 0xff00) * i_17_
						    + (arg3 & 0xff00) * i_18_)
						   & 0xff0000)) >> 8;
				arg2 += i_24_;
				i_26_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_25_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_25_
					   & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_26_ & 0xff00ff) * i_17_
						  + (arg3 & 0xff00ff) * i_18_)
						 & ~0xff00ff)
						+ (((i_26_ & 0xff00) * i_17_
						    + (arg3 & 0xff00) * i_18_)
						   & 0xff0000)) >> 8;
				arg2 += i_24_;
				i_26_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_25_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_25_
					   & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_26_ & 0xff00ff) * i_17_
						  + (arg3 & 0xff00ff) * i_18_)
						 & ~0xff00ff)
						+ (((i_26_ & 0xff00) * i_17_
						    + (arg3 & 0xff00) * i_18_)
						   & 0xff0000)) >> 8;
				arg2 += i_24_;
				i_26_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_25_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_25_
					   & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_26_ & 0xff00ff) * i_17_
						  + (arg3 & 0xff00ff) * i_18_)
						 & ~0xff00ff)
						+ (((i_26_ & 0xff00) * i_17_
						    + (arg3 & 0xff00) * i_18_)
						   & 0xff0000)) >> 8;
				arg2 += i_24_;
				i_26_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_25_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_25_
					   & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_26_ & 0xff00ff) * i_17_
						  + (arg3 & 0xff00ff) * i_18_)
						 & ~0xff00ff)
						+ (((i_26_ & 0xff00) * i_17_
						    + (arg3 & 0xff00) * i_18_)
						   & 0xff0000)) >> 8;
				arg2 += i_24_;
				i_26_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_25_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_25_
					   & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_26_ & 0xff00ff) * i_17_
						  + (arg3 & 0xff00ff) * i_18_)
						 & ~0xff00ff)
						+ (((i_26_ & 0xff00) * i_17_
						    + (arg3 & 0xff00) * i_18_)
						   & 0xff0000)) >> 8;
				arg2 += i_24_;
				i_26_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_25_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_25_
					   & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_26_ & 0xff00ff) * i_17_
						  + (arg3 & 0xff00ff) * i_18_)
						 & ~0xff00ff)
						+ (((i_26_ & 0xff00) * i_17_
						    + (arg3 & 0xff00) * i_18_)
						   & 0xff0000)) >> 8;
				arg2 += i_24_;
				i_26_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_25_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_25_
					   & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_26_ & 0xff00ff) * i_17_
						  + (arg3 & 0xff00ff) * i_18_)
						 & ~0xff00ff)
						+ (((i_26_ & 0xff00) * i_17_
						    + (arg3 & 0xff00) * i_18_)
						   & 0xff0000)) >> 8;
				arg2 += i_24_;
				arg7 += arg8;
				i_25_ = arg7 >> 8;
			    } while (--i > 0);
			}
			i = arg6 - arg5 & 0x7;
			if (i > 0) {
			    do {
				int i_27_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_25_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_25_
					   & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_27_ & 0xff00ff) * i_17_
						  + (arg3 & 0xff00ff) * i_18_)
						 & ~0xff00ff)
						+ (((i_27_ & 0xff00) * i_17_
						    + (arg3 & 0xff00) * i_18_)
						   & 0xff0000)) >> 8;
				arg2 += i_24_;
			    } while (--i > 0);
			}
		    } else {
			if (i > 0) {
			    do {
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_28_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_25_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_25_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_28_ & 0xff00ff) * i_17_
					     + (arg3 & 0xff00ff) * i_18_)
					    & ~0xff00ff)
					   + (((i_28_ & 0xff00) * i_17_
					       + (arg3 & 0xff00) * i_18_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_24_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_29_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_25_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_25_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_29_ & 0xff00ff) * i_17_
					     + (arg3 & 0xff00ff) * i_18_)
					    & ~0xff00ff)
					   + (((i_29_ & 0xff00) * i_17_
					       + (arg3 & 0xff00) * i_18_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_24_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_30_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_25_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_25_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_30_ & 0xff00ff) * i_17_
					     + (arg3 & 0xff00ff) * i_18_)
					    & ~0xff00ff)
					   + (((i_30_ & 0xff00) * i_17_
					       + (arg3 & 0xff00) * i_18_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_24_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_31_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_25_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_25_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_31_ & 0xff00ff) * i_17_
					     + (arg3 & 0xff00ff) * i_18_)
					    & ~0xff00ff)
					   + (((i_31_ & 0xff00) * i_17_
					       + (arg3 & 0xff00) * i_18_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_24_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_32_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_25_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_25_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_32_ & 0xff00ff) * i_17_
					     + (arg3 & 0xff00ff) * i_18_)
					    & ~0xff00ff)
					   + (((i_32_ & 0xff00) * i_17_
					       + (arg3 & 0xff00) * i_18_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_24_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_33_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_25_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_25_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_33_ & 0xff00ff) * i_17_
					     + (arg3 & 0xff00ff) * i_18_)
					    & ~0xff00ff)
					   + (((i_33_ & 0xff00) * i_17_
					       + (arg3 & 0xff00) * i_18_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_24_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_34_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_25_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_25_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_34_ & 0xff00ff) * i_17_
					     + (arg3 & 0xff00ff) * i_18_)
					    & ~0xff00ff)
					   + (((i_34_ & 0xff00) * i_17_
					       + (arg3 & 0xff00) * i_18_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_24_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_35_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_25_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_25_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_35_ & 0xff00ff) * i_17_
					     + (arg3 & 0xff00ff) * i_18_)
					    & ~0xff00ff)
					   + (((i_35_ & 0xff00) * i_17_
					       + (arg3 & 0xff00) * i_18_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_24_;
				arg7 += arg8;
				i_25_ = arg7 >> 8;
			    } while (--i > 0);
			}
			i = arg6 - arg5 & 0x7;
			if (i <= 0)
			    break;
			do {
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0) {
				int i_36_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_25_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_25_
					   & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_36_ & 0xff00ff) * i_17_
						+ (arg3 & 0xff00ff) * i_18_)
					       & ~0xff00ff)
					      + (((i_36_ & 0xff00) * i_17_
						  + (arg3 & 0xff00) * i_18_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_24_;
			} while (--i > 0);
		    }
		    break;
		}
		int i_37_ = arg5 - anInt822;
		arg9 += arg12 * (float) i_37_;
		arg10 += arg13 * (float) i_37_;
		arg11 += arg14 * (float) i_37_;
		int i_38_;
		int i_39_;
		if (arg11 != 0.0F) {
		    i_38_ = (int) (arg9 * 16384.0F / arg11);
		    i_39_ = (int) (arg10 * 16384.0F / arg11);
		} else {
		    i_38_ = 0;
		    i_39_ = 0;
		}
		arg9 += arg12 * (float) i;
		arg10 += arg13 * (float) i;
		arg11 += arg14 * (float) i;
		int i_40_;
		int i_41_;
		if (arg11 != 0.0F) {
		    i_40_ = (int) (arg9 * 16384.0F / arg11);
		    i_41_ = (int) (arg10 * 16384.0F / arg11);
		} else {
		    i_40_ = 0;
		    i_41_ = 0;
		}
		arg2 = (i_38_ << 18) + i_39_;
		int i_42_ = ((i_40_ - i_38_) / i << 18) + (i_41_ - i_39_) / i;
		i >>= 3;
		arg8 <<= 3;
		int i_43_ = arg7 >> 8;
		if (aBoolean830) {
		    if (i > 0) {
			do {
			    int i_44_ = arg0[arg4];
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg3 = ((((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_43_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_44_ & 0xff00ff) * i_17_
					      + (arg3 & 0xff00ff) * i_18_)
					     & ~0xff00ff)
					    + (((i_44_ & 0xff00) * i_17_
						+ (arg3 & 0xff00) * i_18_)
					       & 0xff0000)) >> 8;
			    arg2 += i_42_;
			    i_44_ = arg0[arg4];
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg3 = ((((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_43_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_44_ & 0xff00ff) * i_17_
					      + (arg3 & 0xff00ff) * i_18_)
					     & ~0xff00ff)
					    + (((i_44_ & 0xff00) * i_17_
						+ (arg3 & 0xff00) * i_18_)
					       & 0xff0000)) >> 8;
			    arg2 += i_42_;
			    i_44_ = arg0[arg4];
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg3 = ((((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_43_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_44_ & 0xff00ff) * i_17_
					      + (arg3 & 0xff00ff) * i_18_)
					     & ~0xff00ff)
					    + (((i_44_ & 0xff00) * i_17_
						+ (arg3 & 0xff00) * i_18_)
					       & 0xff0000)) >> 8;
			    arg2 += i_42_;
			    i_44_ = arg0[arg4];
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg3 = ((((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_43_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_44_ & 0xff00ff) * i_17_
					      + (arg3 & 0xff00ff) * i_18_)
					     & ~0xff00ff)
					    + (((i_44_ & 0xff00) * i_17_
						+ (arg3 & 0xff00) * i_18_)
					       & 0xff0000)) >> 8;
			    arg2 += i_42_;
			    i_44_ = arg0[arg4];
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg3 = ((((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_43_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_44_ & 0xff00ff) * i_17_
					      + (arg3 & 0xff00ff) * i_18_)
					     & ~0xff00ff)
					    + (((i_44_ & 0xff00) * i_17_
						+ (arg3 & 0xff00) * i_18_)
					       & 0xff0000)) >> 8;
			    arg2 += i_42_;
			    i_44_ = arg0[arg4];
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg3 = ((((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_43_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_44_ & 0xff00ff) * i_17_
					      + (arg3 & 0xff00ff) * i_18_)
					     & ~0xff00ff)
					    + (((i_44_ & 0xff00) * i_17_
						+ (arg3 & 0xff00) * i_18_)
					       & 0xff0000)) >> 8;
			    arg2 += i_42_;
			    i_44_ = arg0[arg4];
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg3 = ((((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_43_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_44_ & 0xff00ff) * i_17_
					      + (arg3 & 0xff00ff) * i_18_)
					     & ~0xff00ff)
					    + (((i_44_ & 0xff00) * i_17_
						+ (arg3 & 0xff00) * i_18_)
					       & 0xff0000)) >> 8;
			    arg2 += i_42_;
			    i_44_ = arg0[arg4];
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg3 = ((((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_43_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_44_ & 0xff00ff) * i_17_
					      + (arg3 & 0xff00ff) * i_18_)
					     & ~0xff00ff)
					    + (((i_44_ & 0xff00) * i_17_
						+ (arg3 & 0xff00) * i_18_)
					       & 0xff0000)) >> 8;
			    arg2 += i_42_;
			    arg7 += arg8;
			    i_43_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    int i_45_ = arg0[arg4];
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg3 = ((((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_43_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_45_ & 0xff00ff) * i_17_
					      + (arg3 & 0xff00ff) * i_18_)
					     & ~0xff00ff)
					    + (((i_45_ & 0xff00) * i_17_
						+ (arg3 & 0xff00) * i_18_)
					       & 0xff0000)) >> 8;
			    arg2 += i_42_;
			} while (--i > 0);
			break;
		    }
		} else {
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_46_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_43_
					   & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_46_ & 0xff00ff) * i_17_
						+ (arg3 & 0xff00ff) * i_18_)
					       & ~0xff00ff)
					      + (((i_46_ & 0xff00) * i_17_
						  + (arg3 & 0xff00) * i_18_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_42_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_47_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_43_
					   & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_47_ & 0xff00ff) * i_17_
						+ (arg3 & 0xff00ff) * i_18_)
					       & ~0xff00ff)
					      + (((i_47_ & 0xff00) * i_17_
						  + (arg3 & 0xff00) * i_18_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_42_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_48_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_43_
					   & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_48_ & 0xff00ff) * i_17_
						+ (arg3 & 0xff00ff) * i_18_)
					       & ~0xff00ff)
					      + (((i_48_ & 0xff00) * i_17_
						  + (arg3 & 0xff00) * i_18_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_42_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_49_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_43_
					   & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_49_ & 0xff00ff) * i_17_
						+ (arg3 & 0xff00ff) * i_18_)
					       & ~0xff00ff)
					      + (((i_49_ & 0xff00) * i_17_
						  + (arg3 & 0xff00) * i_18_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_42_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_50_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_43_
					   & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_50_ & 0xff00ff) * i_17_
						+ (arg3 & 0xff00ff) * i_18_)
					       & ~0xff00ff)
					      + (((i_50_ & 0xff00) * i_17_
						  + (arg3 & 0xff00) * i_18_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_42_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_51_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_43_
					   & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_51_ & 0xff00ff) * i_17_
						+ (arg3 & 0xff00ff) * i_18_)
					       & ~0xff00ff)
					      + (((i_51_ & 0xff00) * i_17_
						  + (arg3 & 0xff00) * i_18_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_42_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_52_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_43_
					   & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_52_ & 0xff00ff) * i_17_
						+ (arg3 & 0xff00ff) * i_18_)
					       & ~0xff00ff)
					      + (((i_52_ & 0xff00) * i_17_
						  + (arg3 & 0xff00) * i_18_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_42_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_53_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_43_
					   & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_53_ & 0xff00ff) * i_17_
						+ (arg3 & 0xff00ff) * i_18_)
					       & ~0xff00ff)
					      + (((i_53_ & 0xff00) * i_17_
						  + (arg3 & 0xff00) * i_18_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_42_;
			    arg7 += arg8;
			    i_43_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_54_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_43_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_43_
					   & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_54_ & 0xff00ff) * i_17_
						+ (arg3 & 0xff00ff) * i_18_)
					       & ~0xff00ff)
					      + (((i_54_ & 0xff00) * i_17_
						  + (arg3 & 0xff00) * i_18_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_42_;
			} while (--i > 0);
		    }
		}
	    } while (false);
	}
    }
    
    public void method679(int[] arg0, int[] arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7, int arg8, int arg9,
			  int arg10, int arg11, float arg12, float arg13,
			  float arg14, float arg15, float arg16, float arg17) {
	if (aBoolean820) {
	    if (arg6 > anInt825)
		arg6 = anInt825;
	    if (arg5 < 0)
		arg5 = 0;
	}
	if (arg5 < arg6) {
	    arg4 += arg5;
	    arg7 += arg8 * arg5;
	    arg10 += arg11 * arg5;
	    int i = arg6 - arg5;
	    arg8 <<= 3;
	    int i_55_ = arg7 >> 16;
	    int i_56_ = 255 - i_55_;
	    int i_57_ = (((arg9 & 0xff00ff) * i_55_ & ~0xff00ff
			  | (arg9 & 0xff00) * i_55_ & 0xff0000)
			 >>> 8);
	while_15_:
	    do {
		if (anInt819 == 0) {
		    do {
			if (aBoolean827) {
			    int i_58_ = arg5 - anInt822;
			    arg12 += arg15 / 8.0F * (float) i_58_;
			    arg13 += arg16 / 8.0F * (float) i_58_;
			    arg14 += arg17 / 8.0F * (float) i_58_;
			    int i_59_;
			    int i_60_;
			    if (arg14 != 0.0F) {
				i_59_ = (int) (arg12 * 4096.0F / arg14);
				i_60_ = (int) (arg13 * 4096.0F / arg14);
			    } else {
				i_59_ = 0;
				i_60_ = 0;
			    }
			    arg12 += arg15;
			    arg13 += arg16;
			    arg14 += arg17;
			    int i_61_;
			    int i_62_;
			    if (arg14 != 0.0F) {
				i_61_ = (int) (arg12 * 4096.0F / arg14);
				i_62_ = (int) (arg13 * 4096.0F / arg14);
			    } else {
				i_61_ = 0;
				i_62_ = 0;
			    }
			    arg2 = (i_59_ << 20) + i_60_;
			    int i_63_ = ((i_61_ - i_59_ >> 3 << 20)
					 + (i_62_ - i_60_ >> 3));
			    i >>= 3;
			    arg11 <<= 3;
			    int i_64_ = arg10 >> 8;
			    if (aBoolean830) {
				if (i > 0) {
				    do {
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg3 = (((arg3 & 0xff00ff) * i_64_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_64_
						   & 0xff0000)) >> 8;
					arg0[arg4++]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
					arg2 += i_63_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg3 = (((arg3 & 0xff00ff) * i_64_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_64_
						   & 0xff0000)) >> 8;
					arg0[arg4++]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
					arg2 += i_63_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg3 = (((arg3 & 0xff00ff) * i_64_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_64_
						   & 0xff0000)) >> 8;
					arg0[arg4++]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
					arg2 += i_63_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg3 = (((arg3 & 0xff00ff) * i_64_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_64_
						   & 0xff0000)) >> 8;
					arg0[arg4++]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
					arg2 += i_63_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg3 = (((arg3 & 0xff00ff) * i_64_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_64_
						   & 0xff0000)) >> 8;
					arg0[arg4++]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
					arg2 += i_63_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg3 = (((arg3 & 0xff00ff) * i_64_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_64_
						   & 0xff0000)) >> 8;
					arg0[arg4++]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
					arg2 += i_63_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg3 = (((arg3 & 0xff00ff) * i_64_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_64_
						   & 0xff0000)) >> 8;
					arg0[arg4++]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
					arg2 += i_63_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg3 = (((arg3 & 0xff00ff) * i_64_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_64_
						   & 0xff0000)) >> 8;
					arg0[arg4++]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
					arg2 += i_63_;
					i_59_ = i_61_;
					i_60_ = i_62_;
					arg12 += arg15;
					arg13 += arg16;
					arg14 += arg17;
					if (arg14 != 0.0F) {
					    i_61_ = (int) (arg12 * 4096.0F
							   / arg14);
					    i_62_ = (int) (arg13 * 4096.0F
							   / arg14);
					} else {
					    i_61_ = 0;
					    i_62_ = 0;
					}
					arg2 = (i_59_ << 20) + i_60_;
					i_63_ = ((i_61_ - i_59_ >> 3 << 20)
						 + (i_62_ - i_60_ >> 3));
					arg10 += arg11;
					i_64_ = arg10 >> 8;
					arg7 += arg8;
					i_55_ = arg7 >> 16;
					i_56_ = 255 - i_55_;
					i_57_ = (((arg9 & 0xff00ff) * i_55_
						  & ~0xff00ff)
						 | ((arg9 & 0xff00) * i_55_
						    & 0xff0000)) >>> 8;
				    } while (--i > 0);
				}
				i = arg6 - arg5 & 0x7;
				if (i > 0) {
				    do {
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg3 = (((arg3 & 0xff00ff) * i_64_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_64_
						   & 0xff0000)) >> 8;
					arg0[arg4++]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
					arg2 += i_63_;
				    } while (--i > 0);
				}
			    } else {
				if (i > 0) {
				    do {
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0) {
					    arg3 = (((arg3 & 0xff00ff) * i_64_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_64_
						       & 0xff0000)) >> 8;
					    arg0[arg4]
						= ((((arg3 & 0xff00ff) * i_56_
						     & ~0xff00ff)
						    | ((arg3 & 0xff00) * i_56_
						       & 0xff0000))
						   >>> 8) + i_57_;
					}
					arg4++;
					arg2 += i_63_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0) {
					    arg3 = (((arg3 & 0xff00ff) * i_64_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_64_
						       & 0xff0000)) >> 8;
					    arg0[arg4]
						= ((((arg3 & 0xff00ff) * i_56_
						     & ~0xff00ff)
						    | ((arg3 & 0xff00) * i_56_
						       & 0xff0000))
						   >>> 8) + i_57_;
					}
					arg4++;
					arg2 += i_63_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0) {
					    arg3 = (((arg3 & 0xff00ff) * i_64_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_64_
						       & 0xff0000)) >> 8;
					    arg0[arg4]
						= ((((arg3 & 0xff00ff) * i_56_
						     & ~0xff00ff)
						    | ((arg3 & 0xff00) * i_56_
						       & 0xff0000))
						   >>> 8) + i_57_;
					}
					arg4++;
					arg2 += i_63_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0) {
					    arg3 = (((arg3 & 0xff00ff) * i_64_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_64_
						       & 0xff0000)) >> 8;
					    arg0[arg4]
						= ((((arg3 & 0xff00ff) * i_56_
						     & ~0xff00ff)
						    | ((arg3 & 0xff00) * i_56_
						       & 0xff0000))
						   >>> 8) + i_57_;
					}
					arg4++;
					arg2 += i_63_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0) {
					    arg3 = (((arg3 & 0xff00ff) * i_64_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_64_
						       & 0xff0000)) >> 8;
					    arg0[arg4]
						= ((((arg3 & 0xff00ff) * i_56_
						     & ~0xff00ff)
						    | ((arg3 & 0xff00) * i_56_
						       & 0xff0000))
						   >>> 8) + i_57_;
					}
					arg4++;
					arg2 += i_63_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0) {
					    arg3 = (((arg3 & 0xff00ff) * i_64_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_64_
						       & 0xff0000)) >> 8;
					    arg0[arg4]
						= ((((arg3 & 0xff00ff) * i_56_
						     & ~0xff00ff)
						    | ((arg3 & 0xff00) * i_56_
						       & 0xff0000))
						   >>> 8) + i_57_;
					}
					arg4++;
					arg2 += i_63_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0) {
					    arg3 = (((arg3 & 0xff00ff) * i_64_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_64_
						       & 0xff0000)) >> 8;
					    arg0[arg4]
						= ((((arg3 & 0xff00ff) * i_56_
						     & ~0xff00ff)
						    | ((arg3 & 0xff00) * i_56_
						       & 0xff0000))
						   >>> 8) + i_57_;
					}
					arg4++;
					arg2 += i_63_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0) {
					    arg3 = (((arg3 & 0xff00ff) * i_64_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_64_
						       & 0xff0000)) >> 8;
					    arg0[arg4]
						= ((((arg3 & 0xff00ff) * i_56_
						     & ~0xff00ff)
						    | ((arg3 & 0xff00) * i_56_
						       & 0xff0000))
						   >>> 8) + i_57_;
					}
					arg4++;
					arg2 += i_63_;
					i_59_ = i_61_;
					i_60_ = i_62_;
					arg12 += arg15;
					arg13 += arg16;
					arg14 += arg17;
					if (arg14 != 0.0F) {
					    i_61_ = (int) (arg12 * 4096.0F
							   / arg14);
					    i_62_ = (int) (arg13 * 4096.0F
							   / arg14);
					} else {
					    i_61_ = 0;
					    i_62_ = 0;
					}
					arg2 = (i_59_ << 20) + i_60_;
					i_63_ = ((i_61_ - i_59_ >> 3 << 20)
						 + (i_62_ - i_60_ >> 3));
					arg10 += arg11;
					i_64_ = arg10 >> 8;
					arg7 += arg8;
					i_55_ = arg7 >> 16;
					i_56_ = 255 - i_55_;
					i_57_ = (((arg9 & 0xff00ff) * i_55_
						  & ~0xff00ff)
						 | ((arg9 & 0xff00) * i_55_
						    & 0xff0000)) >>> 8;
				    } while (--i > 0);
				}
				i = arg6 - arg5 & 0x7;
				if (i <= 0)
				    break;
				do {
				    if ((arg3
					 = arg1[(arg2 & 0xfc0) + (arg2
								  >>> 26)])
					!= 0) {
					arg3 = (((arg3 & 0xff00ff) * i_64_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_64_
						   & 0xff0000)) >> 8;
					arg0[arg4]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
				    }
				    arg4++;
				    arg2 += i_63_;
				} while (--i > 0);
			    }
			    break;
			}
			int i_65_ = arg5 - anInt822;
			arg12 += arg15 / 8.0F * (float) i_65_;
			arg13 += arg16 / 8.0F * (float) i_65_;
			arg14 += arg17 / 8.0F * (float) i_65_;
			int i_66_;
			int i_67_;
			if (arg14 != 0.0F) {
			    i_66_ = (int) (arg12 * 16384.0F / arg14);
			    i_67_ = (int) (arg13 * 16384.0F / arg14);
			} else {
			    i_66_ = 0;
			    i_67_ = 0;
			}
			arg12 += arg15;
			arg13 += arg16;
			arg14 += arg17;
			int i_68_;
			int i_69_;
			if (arg14 != 0.0F) {
			    i_68_ = (int) (arg12 * 16384.0F / arg14);
			    i_69_ = (int) (arg13 * 16384.0F / arg14);
			} else {
			    i_68_ = 0;
			    i_69_ = 0;
			}
			arg2 = (i_66_ << 18) + i_67_;
			int i_70_ = ((i_68_ - i_66_ >> 3 << 18)
				     + (i_69_ - i_67_ >> 3));
			i >>= 3;
			arg11 <<= 3;
			int i_71_ = arg10 >> 8;
			if (aBoolean830) {
			    if (i > 0) {
				do {
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg3 = (((arg3 & 0xff00ff) * i_71_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_71_
					       & 0xff0000)) >> 8;
				    arg0[arg4++] = ((((arg3 & 0xff00ff) * i_56_
						      & ~0xff00ff)
						     | ((arg3 & 0xff00) * i_56_
							& 0xff0000))
						    >>> 8) + i_57_;
				    arg2 += i_70_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg3 = (((arg3 & 0xff00ff) * i_71_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_71_
					       & 0xff0000)) >> 8;
				    arg0[arg4++] = ((((arg3 & 0xff00ff) * i_56_
						      & ~0xff00ff)
						     | ((arg3 & 0xff00) * i_56_
							& 0xff0000))
						    >>> 8) + i_57_;
				    arg2 += i_70_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg3 = (((arg3 & 0xff00ff) * i_71_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_71_
					       & 0xff0000)) >> 8;
				    arg0[arg4++] = ((((arg3 & 0xff00ff) * i_56_
						      & ~0xff00ff)
						     | ((arg3 & 0xff00) * i_56_
							& 0xff0000))
						    >>> 8) + i_57_;
				    arg2 += i_70_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg3 = (((arg3 & 0xff00ff) * i_71_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_71_
					       & 0xff0000)) >> 8;
				    arg0[arg4++] = ((((arg3 & 0xff00ff) * i_56_
						      & ~0xff00ff)
						     | ((arg3 & 0xff00) * i_56_
							& 0xff0000))
						    >>> 8) + i_57_;
				    arg2 += i_70_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg3 = (((arg3 & 0xff00ff) * i_71_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_71_
					       & 0xff0000)) >> 8;
				    arg0[arg4++] = ((((arg3 & 0xff00ff) * i_56_
						      & ~0xff00ff)
						     | ((arg3 & 0xff00) * i_56_
							& 0xff0000))
						    >>> 8) + i_57_;
				    arg2 += i_70_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg3 = (((arg3 & 0xff00ff) * i_71_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_71_
					       & 0xff0000)) >> 8;
				    arg0[arg4++] = ((((arg3 & 0xff00ff) * i_56_
						      & ~0xff00ff)
						     | ((arg3 & 0xff00) * i_56_
							& 0xff0000))
						    >>> 8) + i_57_;
				    arg2 += i_70_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg3 = (((arg3 & 0xff00ff) * i_71_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_71_
					       & 0xff0000)) >> 8;
				    arg0[arg4++] = ((((arg3 & 0xff00ff) * i_56_
						      & ~0xff00ff)
						     | ((arg3 & 0xff00) * i_56_
							& 0xff0000))
						    >>> 8) + i_57_;
				    arg2 += i_70_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg3 = (((arg3 & 0xff00ff) * i_71_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_71_
					       & 0xff0000)) >> 8;
				    arg0[arg4++] = ((((arg3 & 0xff00ff) * i_56_
						      & ~0xff00ff)
						     | ((arg3 & 0xff00) * i_56_
							& 0xff0000))
						    >>> 8) + i_57_;
				    arg2 += i_70_;
				    i_66_ = i_68_;
				    i_67_ = i_69_;
				    arg12 += arg15;
				    arg13 += arg16;
				    arg14 += arg17;
				    if (arg14 != 0.0F) {
					i_68_
					    = (int) (arg12 * 16384.0F / arg14);
					i_69_
					    = (int) (arg13 * 16384.0F / arg14);
				    } else {
					i_68_ = 0;
					i_69_ = 0;
				    }
				    arg2 = (i_66_ << 18) + i_67_;
				    i_70_ = ((i_68_ - i_66_ >> 3 << 18)
					     + (i_69_ - i_67_ >> 3));
				    arg10 += arg11;
				    i_71_ = arg10 >> 8;
				    arg7 += arg8;
				    i_55_ = arg7 >> 16;
				    i_56_ = 255 - i_55_;
				    i_57_ = (((arg9 & 0xff00ff) * i_55_
					      & ~0xff00ff)
					     | ((arg9 & 0xff00) * i_55_
						& 0xff0000)) >>> 8;
				} while (--i > 0);
			    }
			    i = arg6 - arg5 & 0x7;
			    if (i > 0) {
				do {
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg3 = (((arg3 & 0xff00ff) * i_71_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_71_
					       & 0xff0000)) >> 8;
				    arg0[arg4++] = ((((arg3 & 0xff00ff) * i_56_
						      & ~0xff00ff)
						     | ((arg3 & 0xff00) * i_56_
							& 0xff0000))
						    >>> 8) + i_57_;
				    arg2 += i_70_;
				} while (--i > 0);
				break;
			    }
			} else {
			    if (i > 0) {
				do {
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0) {
					arg3 = (((arg3 & 0xff00ff) * i_71_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_71_
						   & 0xff0000)) >> 8;
					arg0[arg4]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
				    }
				    arg4++;
				    arg2 += i_70_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0) {
					arg3 = (((arg3 & 0xff00ff) * i_71_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_71_
						   & 0xff0000)) >> 8;
					arg0[arg4]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
				    }
				    arg4++;
				    arg2 += i_70_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0) {
					arg3 = (((arg3 & 0xff00ff) * i_71_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_71_
						   & 0xff0000)) >> 8;
					arg0[arg4]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
				    }
				    arg4++;
				    arg2 += i_70_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0) {
					arg3 = (((arg3 & 0xff00ff) * i_71_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_71_
						   & 0xff0000)) >> 8;
					arg0[arg4]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
				    }
				    arg4++;
				    arg2 += i_70_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0) {
					arg3 = (((arg3 & 0xff00ff) * i_71_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_71_
						   & 0xff0000)) >> 8;
					arg0[arg4]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
				    }
				    arg4++;
				    arg2 += i_70_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0) {
					arg3 = (((arg3 & 0xff00ff) * i_71_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_71_
						   & 0xff0000)) >> 8;
					arg0[arg4]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
				    }
				    arg4++;
				    arg2 += i_70_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0) {
					arg3 = (((arg3 & 0xff00ff) * i_71_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_71_
						   & 0xff0000)) >> 8;
					arg0[arg4]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
				    }
				    arg4++;
				    arg2 += i_70_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0) {
					arg3 = (((arg3 & 0xff00ff) * i_71_
						 & ~0xff00ff)
						+ ((arg3 & 0xff00) * i_71_
						   & 0xff0000)) >> 8;
					arg0[arg4]
					    = ((((arg3 & 0xff00ff) * i_56_
						 & ~0xff00ff)
						| ((arg3 & 0xff00) * i_56_
						   & 0xff0000))
					       >>> 8) + i_57_;
				    }
				    arg4++;
				    arg2 += i_70_;
				    i_66_ = i_68_;
				    i_67_ = i_69_;
				    arg12 += arg15;
				    arg13 += arg16;
				    arg14 += arg17;
				    if (arg14 != 0.0F) {
					i_68_
					    = (int) (arg12 / arg14 * 16384.0F);
					i_69_
					    = (int) (arg13 / arg14 * 16384.0F);
				    } else {
					i_68_ = 0;
					i_69_ = 0;
				    }
				    arg2 = (i_66_ << 18) + i_67_;
				    i_70_ = ((i_68_ - i_66_ >> 3 << 18)
					     + (i_69_ - i_67_ >> 3));
				    arg10 += arg11;
				    i_71_ = arg10 >> 8;
				    arg7 += arg8;
				    i_55_ = arg7 >> 16;
				    i_56_ = 255 - i_55_;
				    i_57_ = (((arg9 & 0xff00ff) * i_55_
					      & ~0xff00ff)
					     | ((arg9 & 0xff00) * i_55_
						& 0xff0000)) >>> 8;
				} while (--i > 0);
			    }
			    i = arg6 - arg5 & 0x7;
			    if (i <= 0)
				break while_15_;
			    do {
				if ((arg3
				     = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				    != 0) {
				    arg3 = (((arg3 & 0xff00ff) * i_71_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_71_
					       & 0xff0000)) >> 8;
				    arg0[arg4] = ((((arg3 & 0xff00ff) * i_56_
						    & ~0xff00ff)
						   | ((arg3 & 0xff00) * i_56_
						      & 0xff0000))
						  >>> 8) + i_57_;
				}
				arg4++;
				arg2 += i_70_;
			    } while (--i > 0);
			}
		    } while (false);
		    break;
		}
		int i_72_ = anInt819;
		int i_73_ = 256 - anInt819;
		if (aBoolean827) {
		    int i_74_ = arg5 - anInt822;
		    arg12 += arg15 / 8.0F * (float) i_74_;
		    arg13 += arg16 / 8.0F * (float) i_74_;
		    arg14 += arg17 / 8.0F * (float) i_74_;
		    int i_75_;
		    int i_76_;
		    if (arg14 != 0.0F) {
			i_75_ = (int) (arg12 * 4096.0F / arg14);
			i_76_ = (int) (arg13 * 4096.0F / arg14);
		    } else {
			i_75_ = 0;
			i_76_ = 0;
		    }
		    arg12 += arg15;
		    arg13 += arg16;
		    arg14 += arg17;
		    int i_77_;
		    int i_78_;
		    if (arg14 != 0.0F) {
			i_77_ = (int) (arg12 * 4096.0F / arg14);
			i_78_ = (int) (arg13 * 4096.0F / arg14);
		    } else {
			i_77_ = 0;
			i_78_ = 0;
		    }
		    arg2 = (i_75_ << 20) + i_76_;
		    int i_79_
			= (i_77_ - i_75_ >> 3 << 20) + (i_78_ - i_76_ >> 3);
		    i >>= 3;
		    arg11 <<= 3;
		    int i_80_ = arg10 >> 8;
		    if (aBoolean830) {
			if (i > 0) {
			    do {
				int i_81_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_80_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_80_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_81_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_81_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4++]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
				arg2 += i_79_;
				i_81_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_80_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_80_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_81_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_81_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4++]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
				arg2 += i_79_;
				i_81_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_80_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_80_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_81_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_81_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4++]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
				arg2 += i_79_;
				i_81_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_80_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_80_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_81_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_81_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4++]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
				arg2 += i_79_;
				i_81_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_80_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_80_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_81_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_81_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4++]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
				arg2 += i_79_;
				i_81_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_80_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_80_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_81_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_81_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4++]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
				arg2 += i_79_;
				i_81_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_80_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_80_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_81_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_81_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4++]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
				arg2 += i_79_;
				i_81_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_80_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_80_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_81_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_81_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4++]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
				arg2 += i_79_;
				i_75_ = i_77_;
				i_76_ = i_78_;
				arg12 += arg15;
				arg13 += arg16;
				arg14 += arg17;
				if (arg14 != 0.0F) {
				    i_77_ = (int) (arg12 * 4096.0F / arg14);
				    i_78_ = (int) (arg13 * 4096.0F / arg14);
				} else {
				    i_77_ = 0;
				    i_78_ = 0;
				}
				arg2 = (i_75_ << 20) + i_76_;
				i_79_ = ((i_77_ - i_75_ >> 3 << 20)
					 + (i_78_ - i_76_ >> 3));
				arg10 += arg11;
				i_80_ = arg10 >> 8;
				arg7 += arg8;
				i_55_ = arg7 >> 16;
				i_56_ = 255 - i_55_;
				i_57_ = (((arg9 & 0xff00ff) * i_55_ & ~0xff00ff
					  | (arg9 & 0xff00) * i_55_ & 0xff0000)
					 >>> 8);
			    } while (--i > 0);
			}
			i = arg6 - arg5 & 0x7;
			if (i > 0) {
			    do {
				int i_82_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3 = (((arg3 & 0xff00ff) * i_80_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_80_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_82_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_82_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4++]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
				arg2 += i_79_;
			    } while (--i > 0);
			}
		    } else {
			if (i > 0) {
			    do {
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_83_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_80_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_80_
					       & 0xff0000)) >> 8;
				    arg3 = ((((i_83_ & 0xff00ff) * i_72_
					      + (arg3 & 0xff00ff) * i_73_)
					     & ~0xff00ff)
					    + (((i_83_ & 0xff00) * i_72_
						+ (arg3 & 0xff00) * i_73_)
					       & 0xff0000)) >> 8;
				    arg0[arg4] = ((((arg3 & 0xff00ff) * i_56_
						    & ~0xff00ff)
						   | ((arg3 & 0xff00) * i_56_
						      & 0xff0000))
						  >>> 8) + i_57_;
				}
				arg4++;
				arg2 += i_79_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_84_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_80_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_80_
					       & 0xff0000)) >> 8;
				    arg3 = ((((i_84_ & 0xff00ff) * i_72_
					      + (arg3 & 0xff00ff) * i_73_)
					     & ~0xff00ff)
					    + (((i_84_ & 0xff00) * i_72_
						+ (arg3 & 0xff00) * i_73_)
					       & 0xff0000)) >> 8;
				    arg0[arg4] = ((((arg3 & 0xff00ff) * i_56_
						    & ~0xff00ff)
						   | ((arg3 & 0xff00) * i_56_
						      & 0xff0000))
						  >>> 8) + i_57_;
				}
				arg4++;
				arg2 += i_79_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_85_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_80_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_80_
					       & 0xff0000)) >> 8;
				    arg3 = ((((i_85_ & 0xff00ff) * i_72_
					      + (arg3 & 0xff00ff) * i_73_)
					     & ~0xff00ff)
					    + (((i_85_ & 0xff00) * i_72_
						+ (arg3 & 0xff00) * i_73_)
					       & 0xff0000)) >> 8;
				    arg0[arg4] = ((((arg3 & 0xff00ff) * i_56_
						    & ~0xff00ff)
						   | ((arg3 & 0xff00) * i_56_
						      & 0xff0000))
						  >>> 8) + i_57_;
				}
				arg4++;
				arg2 += i_79_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_86_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_80_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_80_
					       & 0xff0000)) >> 8;
				    arg3 = ((((i_86_ & 0xff00ff) * i_72_
					      + (arg3 & 0xff00ff) * i_73_)
					     & ~0xff00ff)
					    + (((i_86_ & 0xff00) * i_72_
						+ (arg3 & 0xff00) * i_73_)
					       & 0xff0000)) >> 8;
				    arg0[arg4] = ((((arg3 & 0xff00ff) * i_56_
						    & ~0xff00ff)
						   | ((arg3 & 0xff00) * i_56_
						      & 0xff0000))
						  >>> 8) + i_57_;
				}
				arg4++;
				arg2 += i_79_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_87_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_80_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_80_
					       & 0xff0000)) >> 8;
				    arg3 = ((((i_87_ & 0xff00ff) * i_72_
					      + (arg3 & 0xff00ff) * i_73_)
					     & ~0xff00ff)
					    + (((i_87_ & 0xff00) * i_72_
						+ (arg3 & 0xff00) * i_73_)
					       & 0xff0000)) >> 8;
				    arg0[arg4] = ((((arg3 & 0xff00ff) * i_56_
						    & ~0xff00ff)
						   | ((arg3 & 0xff00) * i_56_
						      & 0xff0000))
						  >>> 8) + i_57_;
				}
				arg4++;
				arg2 += i_79_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_88_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_80_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_80_
					       & 0xff0000)) >> 8;
				    arg3 = ((((i_88_ & 0xff00ff) * i_72_
					      + (arg3 & 0xff00ff) * i_73_)
					     & ~0xff00ff)
					    + (((i_88_ & 0xff00) * i_72_
						+ (arg3 & 0xff00) * i_73_)
					       & 0xff0000)) >> 8;
				    arg0[arg4] = ((((arg3 & 0xff00ff) * i_56_
						    & ~0xff00ff)
						   | ((arg3 & 0xff00) * i_56_
						      & 0xff0000))
						  >>> 8) + i_57_;
				}
				arg4++;
				arg2 += i_79_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_89_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_80_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_80_
					       & 0xff0000)) >> 8;
				    arg3 = ((((i_89_ & 0xff00ff) * i_72_
					      + (arg3 & 0xff00ff) * i_73_)
					     & ~0xff00ff)
					    + (((i_89_ & 0xff00) * i_72_
						+ (arg3 & 0xff00) * i_73_)
					       & 0xff0000)) >> 8;
				    arg0[arg4] = ((((arg3 & 0xff00ff) * i_56_
						    & ~0xff00ff)
						   | ((arg3 & 0xff00) * i_56_
						      & 0xff0000))
						  >>> 8) + i_57_;
				}
				arg4++;
				arg2 += i_79_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_90_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_80_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_80_
					       & 0xff0000)) >> 8;
				    arg3 = ((((i_90_ & 0xff00ff) * i_72_
					      + (arg3 & 0xff00ff) * i_73_)
					     & ~0xff00ff)
					    + (((i_90_ & 0xff00) * i_72_
						+ (arg3 & 0xff00) * i_73_)
					       & 0xff0000)) >> 8;
				    arg0[arg4] = ((((arg3 & 0xff00ff) * i_56_
						    & ~0xff00ff)
						   | ((arg3 & 0xff00) * i_56_
						      & 0xff0000))
						  >>> 8) + i_57_;
				}
				arg4++;
				arg2 += i_79_;
				i_75_ = i_77_;
				i_76_ = i_78_;
				arg12 += arg15;
				arg13 += arg16;
				arg14 += arg17;
				if (arg14 != 0.0F) {
				    i_77_ = (int) (arg12 * 4096.0F / arg14);
				    i_78_ = (int) (arg13 * 4096.0F / arg14);
				} else {
				    i_77_ = 0;
				    i_78_ = 0;
				}
				arg2 = (i_75_ << 20) + i_76_;
				i_79_ = ((i_77_ - i_75_ >> 3 << 20)
					 + (i_78_ - i_76_ >> 3));
				arg10 += arg11;
				i_80_ = arg10 >> 8;
				arg7 += arg8;
				i_55_ = arg7 >> 16;
				i_56_ = 255 - i_55_;
				i_57_ = (((arg9 & 0xff00ff) * i_55_ & ~0xff00ff
					  | (arg9 & 0xff00) * i_55_ & 0xff0000)
					 >>> 8);
			    } while (--i > 0);
			}
			i = arg6 - arg5 & 0x7;
			if (i <= 0)
			    break;
			do {
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0) {
				int i_91_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_80_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_80_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_91_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_91_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
			    }
			    arg4++;
			    arg2 += i_79_;
			} while (--i > 0);
		    }
		    break;
		}
		int i_92_ = arg5 - anInt822;
		arg12 += arg15 / 8.0F * (float) i_92_;
		arg13 += arg16 / 8.0F * (float) i_92_;
		arg14 += arg17 / 8.0F * (float) i_92_;
		int i_93_;
		int i_94_;
		if (arg14 != 0.0F) {
		    i_93_ = (int) (arg12 * 16384.0F / arg14);
		    i_94_ = (int) (arg13 * 16384.0F / arg14);
		} else {
		    i_93_ = 0;
		    i_94_ = 0;
		}
		arg12 += arg15;
		arg13 += arg16;
		arg14 += arg17;
		int i_95_;
		int i_96_;
		if (arg14 != 0.0F) {
		    i_95_ = (int) (arg12 * 16384.0F / arg14);
		    i_96_ = (int) (arg13 * 16384.0F / arg14);
		} else {
		    i_95_ = 0;
		    i_96_ = 0;
		}
		arg2 = (i_93_ << 18) + i_94_;
		int i_97_ = (i_95_ - i_93_ >> 3 << 18) + (i_96_ - i_94_ >> 3);
		i >>= 3;
		arg11 <<= 3;
		int i_98_ = arg10 >> 8;
		if (aBoolean830) {
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    int i_99_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_98_ & 0xff0000))
				    >> 8);
			    arg3 = ((((i_99_ & 0xff00ff) * i_72_
				      + (arg3 & 0xff00ff) * i_73_)
				     & ~0xff00ff)
				    + (((i_99_ & 0xff00) * i_72_
					+ (arg3 & 0xff00) * i_73_)
				       & 0xff0000)) >> 8;
			    arg0[arg4++]
				= (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
				    | (arg3 & 0xff00) * i_56_ & 0xff0000)
				   >>> 8) + i_57_;
			    arg2 += i_97_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_99_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_98_ & 0xff0000))
				    >> 8);
			    arg3 = ((((i_99_ & 0xff00ff) * i_72_
				      + (arg3 & 0xff00ff) * i_73_)
				     & ~0xff00ff)
				    + (((i_99_ & 0xff00) * i_72_
					+ (arg3 & 0xff00) * i_73_)
				       & 0xff0000)) >> 8;
			    arg0[arg4++]
				= (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
				    | (arg3 & 0xff00) * i_56_ & 0xff0000)
				   >>> 8) + i_57_;
			    arg2 += i_97_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_99_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_98_ & 0xff0000))
				    >> 8);
			    arg3 = ((((i_99_ & 0xff00ff) * i_72_
				      + (arg3 & 0xff00ff) * i_73_)
				     & ~0xff00ff)
				    + (((i_99_ & 0xff00) * i_72_
					+ (arg3 & 0xff00) * i_73_)
				       & 0xff0000)) >> 8;
			    arg0[arg4++]
				= (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
				    | (arg3 & 0xff00) * i_56_ & 0xff0000)
				   >>> 8) + i_57_;
			    arg2 += i_97_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_99_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_98_ & 0xff0000))
				    >> 8);
			    arg3 = ((((i_99_ & 0xff00ff) * i_72_
				      + (arg3 & 0xff00ff) * i_73_)
				     & ~0xff00ff)
				    + (((i_99_ & 0xff00) * i_72_
					+ (arg3 & 0xff00) * i_73_)
				       & 0xff0000)) >> 8;
			    arg0[arg4++]
				= (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
				    | (arg3 & 0xff00) * i_56_ & 0xff0000)
				   >>> 8) + i_57_;
			    arg2 += i_97_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_99_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_98_ & 0xff0000))
				    >> 8);
			    arg3 = ((((i_99_ & 0xff00ff) * i_72_
				      + (arg3 & 0xff00ff) * i_73_)
				     & ~0xff00ff)
				    + (((i_99_ & 0xff00) * i_72_
					+ (arg3 & 0xff00) * i_73_)
				       & 0xff0000)) >> 8;
			    arg0[arg4++]
				= (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
				    | (arg3 & 0xff00) * i_56_ & 0xff0000)
				   >>> 8) + i_57_;
			    arg2 += i_97_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_99_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_98_ & 0xff0000))
				    >> 8);
			    arg3 = ((((i_99_ & 0xff00ff) * i_72_
				      + (arg3 & 0xff00ff) * i_73_)
				     & ~0xff00ff)
				    + (((i_99_ & 0xff00) * i_72_
					+ (arg3 & 0xff00) * i_73_)
				       & 0xff0000)) >> 8;
			    arg0[arg4++]
				= (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
				    | (arg3 & 0xff00) * i_56_ & 0xff0000)
				   >>> 8) + i_57_;
			    arg2 += i_97_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_99_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_98_ & 0xff0000))
				    >> 8);
			    arg3 = ((((i_99_ & 0xff00ff) * i_72_
				      + (arg3 & 0xff00ff) * i_73_)
				     & ~0xff00ff)
				    + (((i_99_ & 0xff00) * i_72_
					+ (arg3 & 0xff00) * i_73_)
				       & 0xff0000)) >> 8;
			    arg0[arg4++]
				= (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
				    | (arg3 & 0xff00) * i_56_ & 0xff0000)
				   >>> 8) + i_57_;
			    arg2 += i_97_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_99_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_98_ & 0xff0000))
				    >> 8);
			    arg3 = ((((i_99_ & 0xff00ff) * i_72_
				      + (arg3 & 0xff00ff) * i_73_)
				     & ~0xff00ff)
				    + (((i_99_ & 0xff00) * i_72_
					+ (arg3 & 0xff00) * i_73_)
				       & 0xff0000)) >> 8;
			    arg0[arg4++]
				= (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
				    | (arg3 & 0xff00) * i_56_ & 0xff0000)
				   >>> 8) + i_57_;
			    arg2 += i_97_;
			    i_93_ = i_95_;
			    i_94_ = i_96_;
			    arg12 += arg15;
			    arg13 += arg16;
			    arg14 += arg17;
			    if (arg14 != 0.0F) {
				i_95_ = (int) (arg12 * 16384.0F / arg14);
				i_96_ = (int) (arg13 * 16384.0F / arg14);
			    } else {
				i_95_ = 0;
				i_96_ = 0;
			    }
			    arg2 = (i_93_ << 18) + i_94_;
			    i_97_ = (i_95_ - i_93_ >> 3 << 18) + (i_96_ - i_94_
								  >> 3);
			    arg10 += arg11;
			    i_98_ = arg10 >> 8;
			    arg7 += arg8;
			    i_55_ = arg7 >> 16;
			    i_56_ = 255 - i_55_;
			    i_57_
				= ((arg9 & 0xff00ff) * i_55_ & ~0xff00ff
				   | (arg9 & 0xff00) * i_55_ & 0xff0000) >>> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    int i_100_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_98_ & 0xff0000))
				    >> 8);
			    arg3 = ((((i_100_ & 0xff00ff) * i_72_
				      + (arg3 & 0xff00ff) * i_73_)
				     & ~0xff00ff)
				    + (((i_100_ & 0xff00) * i_72_
					+ (arg3 & 0xff00) * i_73_)
				       & 0xff0000)) >> 8;
			    arg0[arg4++]
				= (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
				    | (arg3 & 0xff00) * i_56_ & 0xff0000)
				   >>> 8) + i_57_;
			    arg2 += i_97_;
			} while (--i > 0);
			break;
		    }
		} else {
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_101_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_98_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_101_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_101_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
			    }
			    arg4++;
			    arg2 += i_97_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_102_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_98_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_102_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_102_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
			    }
			    arg4++;
			    arg2 += i_97_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_103_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_98_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_103_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_103_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
			    }
			    arg4++;
			    arg2 += i_97_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_104_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_98_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_104_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_104_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
			    }
			    arg4++;
			    arg2 += i_97_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_105_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_98_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_105_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_105_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
			    }
			    arg4++;
			    arg2 += i_97_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_106_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_98_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_106_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_106_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
			    }
			    arg4++;
			    arg2 += i_97_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_107_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_98_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_107_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_107_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
			    }
			    arg4++;
			    arg2 += i_97_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_108_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_98_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_108_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_108_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
			    }
			    arg4++;
			    arg2 += i_97_;
			    i_93_ = i_95_;
			    i_94_ = i_96_;
			    arg12 += arg15;
			    arg13 += arg16;
			    arg14 += arg17;
			    if (arg14 != 0.0F) {
				i_95_ = (int) (arg12 * 16384.0F / arg14);
				i_96_ = (int) (arg13 * 16384.0F / arg14);
			    } else {
				i_95_ = 0;
				i_96_ = 0;
			    }
			    arg2 = (i_93_ << 18) + i_94_;
			    i_97_ = (i_95_ - i_93_ >> 3 << 18) + (i_96_ - i_94_
								  >> 3);
			    arg10 += arg11;
			    i_98_ = arg10 >> 8;
			    arg7 += arg8;
			    i_55_ = arg7 >> 16;
			    i_56_ = 255 - i_55_;
			    i_57_
				= ((arg9 & 0xff00ff) * i_55_ & ~0xff00ff
				   | (arg9 & 0xff00) * i_55_ & 0xff0000) >>> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_109_ = arg0[arg4];
				arg3 = (((arg3 & 0xff00ff) * i_98_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_98_
					   & 0xff0000)) >> 8;
				arg3 = ((((i_109_ & 0xff00ff) * i_72_
					  + (arg3 & 0xff00ff) * i_73_)
					 & ~0xff00ff)
					+ (((i_109_ & 0xff00) * i_72_
					    + (arg3 & 0xff00) * i_73_)
					   & 0xff0000)) >> 8;
				arg0[arg4]
				    = (((arg3 & 0xff00ff) * i_56_ & ~0xff00ff
					| (arg3 & 0xff00) * i_56_ & 0xff0000)
				       >>> 8) + i_57_;
			    }
			    arg4++;
			    arg2 += i_97_;
			} while (--i > 0);
		    }
		}
	    } while (false);
	}
    }
    
    public void method680
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 int arg7, int arg8, int arg9, int arg10, int arg11, int arg12,
	 int arg13, int arg14, int arg15, int arg16, int arg17, int arg18,
	 int arg19, int arg20, int arg21, int arg22) {
	int[] is = aClass130_Sub1_826.method1265(arg22);
	if (is == null) {
	    int i = aClass130_Sub1_826.method1271(arg22);
	    method689(arg0, arg1, arg2, arg3, arg4, arg5,
		      Class212.method2766(i, arg6 | arg7 << 24, (byte) 58),
		      Class212.method2766(i, arg6 | arg8 << 24, (byte) 58),
		      Class212.method2766(i, arg6 | arg9 << 24, (byte) 58));
	} else {
	    aBoolean827 = aClass130_Sub1_826.method1264(arg22);
	    aBoolean830 = aClass130_Sub1_826.method1274(arg22);
	    int i = arg4 - arg3;
	    int i_110_ = arg1 - arg0;
	    int i_111_ = arg5 - arg3;
	    int i_112_ = arg2 - arg0;
	    int i_113_ = 0;
	    if (arg1 != arg0)
		i_113_ = (arg4 - arg3 << 16) / (arg1 - arg0);
	    int i_114_ = 0;
	    if (arg2 != arg1)
		i_114_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	    int i_115_ = 0;
	    if (arg2 != arg0)
		i_115_ = (arg3 - arg5 << 16) / (arg0 - arg2);
	    int i_116_ = i * i_112_ - i_111_ * i_110_;
	    if (i_116_ != 0) {
		int i_117_ = arg8 - arg7;
		int i_118_ = arg9 - arg7;
		int i_119_
		    = (i_117_ * i_112_ - i_118_ * i_110_ << 16) / i_116_;
		int i_120_ = (i_118_ * i - i_117_ * i_111_ << 16) / i_116_;
		i_117_ = arg11 - arg10;
		i_118_ = arg12 - arg10;
		int i_121_ = (i_117_ * i_112_ - i_118_ * i_110_ << 9) / i_116_;
		int i_122_ = (i_118_ * i - i_117_ * i_111_ << 9) / i_116_;
		float f = 8.0F / (float) aClass130_Sub1_826.anInt4068;
		float f_123_ = (float) aClass130_Sub1_826.anInt4036;
		arg14 = arg13 - arg14;
		arg17 = arg16 - arg17;
		arg20 = arg19 - arg20;
		arg15 -= arg13;
		arg18 -= arg16;
		arg21 -= arg19;
		float f_124_ = (float) (arg15 * arg16 - arg18 * arg13);
		float f_125_ = (float) (arg18 * arg19 - arg21 * arg16) * f;
		float f_126_
		    = (float) (arg21 * arg13 - arg15 * arg19) / f_123_;
		float f_127_ = (float) (arg14 * arg16 - arg17 * arg13);
		float f_128_ = (float) (arg17 * arg19 - arg20 * arg16) * f;
		float f_129_
		    = (float) (arg20 * arg13 - arg14 * arg19) / f_123_;
		float f_130_ = (float) (arg17 * arg15 - arg14 * arg18);
		float f_131_ = (float) (arg20 * arg18 - arg17 * arg21) * f;
		float f_132_
		    = (float) (arg14 * arg21 - arg20 * arg15) / f_123_;
		if (arg0 <= arg1 && arg0 <= arg2) {
		    if (arg0 < anInt824) {
			if (arg1 > anInt824)
			    arg1 = anInt824;
			if (arg2 > anInt824)
			    arg2 = anInt824;
			arg7 = (arg7 << 16) - i_119_ * arg3 + i_119_;
			arg10 = (arg10 << 9) - i_121_ * arg3 + i_121_;
			if (arg1 < arg2) {
			    arg5 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg5 -= i_115_ * arg0;
				arg3 -= i_113_ * arg0;
				arg7 -= i_120_ * arg0;
				arg10 -= i_122_ * arg0;
				arg0 = 0;
			    }
			    arg4 <<= 16;
			    if (arg1 < 0) {
				arg4 -= i_114_ * arg1;
				arg1 = 0;
			    }
			    int i_133_ = arg0 - anInt821;
			    f_124_ += f_126_ * (float) i_133_;
			    f_127_ += f_129_ * (float) i_133_;
			    f_130_ += f_132_ * (float) i_133_;
			    if (arg0 != arg1 && i_115_ < i_113_
				|| arg0 == arg1 && i_115_ > i_114_) {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg1 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg0,
					      arg5 >> 16, arg3 >> 16, arg7,
					      i_119_, arg6, arg10, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg5 += i_115_;
				    arg3 += i_113_;
				    arg7 += i_120_;
				    arg10 += i_122_;
				    arg0 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
				while (--arg2 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg0,
					      arg5 >> 16, arg4 >> 16, arg7,
					      i_119_, arg6, arg10, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg5 += i_115_;
				    arg4 += i_114_;
				    arg7 += i_120_;
				    arg10 += i_122_;
				    arg0 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
			    } else {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg1 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg0,
					      arg3 >> 16, arg5 >> 16, arg7,
					      i_119_, arg6, arg10, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg5 += i_115_;
				    arg3 += i_113_;
				    arg7 += i_120_;
				    arg10 += i_122_;
				    arg0 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
				while (--arg2 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg0,
					      arg4 >> 16, arg5 >> 16, arg7,
					      i_119_, arg6, arg10, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg5 += i_115_;
				    arg4 += i_114_;
				    arg7 += i_120_;
				    arg10 += i_122_;
				    arg0 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
			    }
			} else {
			    arg4 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg4 -= i_115_ * arg0;
				arg3 -= i_113_ * arg0;
				arg7 -= i_120_ * arg0;
				arg10 -= i_122_ * arg0;
				arg0 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_114_ * arg2;
				arg2 = 0;
			    }
			    int i_134_ = arg0 - anInt821;
			    f_124_ += f_126_ * (float) i_134_;
			    f_127_ += f_129_ * (float) i_134_;
			    f_130_ += f_132_ * (float) i_134_;
			    if (arg0 != arg2 && i_115_ < i_113_
				|| arg0 == arg2 && i_114_ > i_113_) {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg2 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg0,
					      arg4 >> 16, arg3 >> 16, arg7,
					      i_119_, arg6, arg10, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg4 += i_115_;
				    arg3 += i_113_;
				    arg7 += i_120_;
				    arg10 += i_122_;
				    arg0 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
				while (--arg1 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg0,
					      arg5 >> 16, arg3 >> 16, arg7,
					      i_119_, arg6, arg10, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg5 += i_114_;
				    arg3 += i_113_;
				    arg7 += i_120_;
				    arg10 += i_122_;
				    arg0 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
			    } else {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg2 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg0,
					      arg3 >> 16, arg4 >> 16, arg7,
					      i_119_, arg6, arg10, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg4 += i_115_;
				    arg3 += i_113_;
				    arg7 += i_120_;
				    arg10 += i_122_;
				    arg0 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
				while (--arg1 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg0,
					      arg3 >> 16, arg5 >> 16, arg7,
					      i_119_, arg6, arg10, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg5 += i_114_;
				    arg3 += i_113_;
				    arg7 += i_120_;
				    arg10 += i_122_;
				    arg0 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
			    }
			}
		    }
		} else if (arg1 <= arg2) {
		    if (arg1 < anInt824) {
			if (arg2 > anInt824)
			    arg2 = anInt824;
			if (arg0 > anInt824)
			    arg0 = anInt824;
			arg8 = (arg8 << 16) - i_119_ * arg4 + i_119_;
			arg11 = (arg11 << 9) - i_121_ * arg4 + i_121_;
			if (arg2 < arg0) {
			    arg3 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg3 -= i_113_ * arg1;
				arg4 -= i_114_ * arg1;
				arg8 -= i_120_ * arg1;
				arg11 -= i_122_ * arg1;
				arg1 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_115_ * arg2;
				arg2 = 0;
			    }
			    int i_135_ = arg1 - anInt821;
			    f_124_ += f_126_ * (float) i_135_;
			    f_127_ += f_129_ * (float) i_135_;
			    f_130_ += f_132_ * (float) i_135_;
			    if (arg1 != arg2 && i_113_ < i_114_
				|| arg1 == arg2 && i_113_ > i_115_) {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg2 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg1,
					      arg3 >> 16, arg4 >> 16, arg8,
					      i_119_, arg6, arg11, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg3 += i_113_;
				    arg4 += i_114_;
				    arg8 += i_120_;
				    arg11 += i_122_;
				    arg1 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
				while (--arg0 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg1,
					      arg3 >> 16, arg5 >> 16, arg8,
					      i_119_, arg6, arg11, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg3 += i_113_;
				    arg5 += i_115_;
				    arg8 += i_120_;
				    arg11 += i_122_;
				    arg1 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
			    } else {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg2 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg1,
					      arg4 >> 16, arg3 >> 16, arg8,
					      i_119_, arg6, arg11, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg3 += i_113_;
				    arg4 += i_114_;
				    arg8 += i_120_;
				    arg11 += i_122_;
				    arg1 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
				while (--arg0 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg1,
					      arg5 >> 16, arg3 >> 16, arg8,
					      i_119_, arg6, arg11, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg3 += i_113_;
				    arg5 += i_115_;
				    arg8 += i_120_;
				    arg11 += i_122_;
				    arg1 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
			    }
			} else {
			    arg5 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg5 -= i_113_ * arg1;
				arg4 -= i_114_ * arg1;
				arg8 -= i_120_ * arg1;
				arg11 -= i_122_ * arg1;
				arg1 = 0;
			    }
			    arg3 <<= 16;
			    if (arg0 < 0) {
				arg3 -= i_115_ * arg0;
				arg0 = 0;
			    }
			    int i_136_ = arg1 - anInt821;
			    f_124_ += f_126_ * (float) i_136_;
			    f_127_ += f_129_ * (float) i_136_;
			    f_130_ += f_132_ * (float) i_136_;
			    if (i_113_ < i_114_) {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg0 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg1,
					      arg5 >> 16, arg4 >> 16, arg8,
					      i_119_, arg6, arg11, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg5 += i_113_;
				    arg4 += i_114_;
				    arg8 += i_120_;
				    arg11 += i_122_;
				    arg1 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
				while (--arg2 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg1,
					      arg3 >> 16, arg4 >> 16, arg8,
					      i_119_, arg6, arg11, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg3 += i_115_;
				    arg4 += i_114_;
				    arg8 += i_120_;
				    arg11 += i_122_;
				    arg1 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
			    } else {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg0 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg1,
					      arg4 >> 16, arg5 >> 16, arg8,
					      i_119_, arg6, arg11, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg5 += i_113_;
				    arg4 += i_114_;
				    arg8 += i_120_;
				    arg11 += i_122_;
				    arg1 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
				while (--arg2 >= 0) {
				    method679(anIntArray828, is, 0, 0, arg1,
					      arg4 >> 16, arg3 >> 16, arg8,
					      i_119_, arg6, arg11, i_121_,
					      f_124_, f_127_, f_130_, f_125_,
					      f_128_, f_131_);
				    arg3 += i_115_;
				    arg4 += i_114_;
				    arg8 += i_120_;
				    arg11 += i_122_;
				    arg1 += anInt831;
				    f_124_ += f_126_;
				    f_127_ += f_129_;
				    f_130_ += f_132_;
				}
			    }
			}
		    }
		} else if (arg2 < anInt824) {
		    if (arg0 > anInt824)
			arg0 = anInt824;
		    if (arg1 > anInt824)
			arg1 = anInt824;
		    arg9 = (arg9 << 16) - i_119_ * arg5 + i_119_;
		    arg12 = (arg12 << 9) - i_121_ * arg5 + i_121_;
		    if (arg0 < arg1) {
			arg4 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg4 -= i_114_ * arg2;
			    arg5 -= i_115_ * arg2;
			    arg9 -= i_120_ * arg2;
			    arg12 -= i_122_ * arg2;
			    arg2 = 0;
			}
			arg3 <<= 16;
			if (arg0 < 0) {
			    arg3 -= i_113_ * arg0;
			    arg0 = 0;
			}
			int i_137_ = arg2 - anInt821;
			f_124_ += f_126_ * (float) i_137_;
			f_127_ += f_129_ * (float) i_137_;
			f_130_ += f_132_ * (float) i_137_;
			if (i_114_ < i_115_) {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg0 >= 0) {
				method679(anIntArray828, is, 0, 0, arg2,
					  arg4 >> 16, arg5 >> 16, arg9, i_119_,
					  arg6, arg12, i_121_, f_124_, f_127_,
					  f_130_, f_125_, f_128_, f_131_);
				arg4 += i_114_;
				arg5 += i_115_;
				arg9 += i_120_;
				arg12 += i_122_;
				arg2 += anInt831;
				f_124_ += f_126_;
				f_127_ += f_129_;
				f_130_ += f_132_;
			    }
			    while (--arg1 >= 0) {
				method679(anIntArray828, is, 0, 0, arg2,
					  arg4 >> 16, arg3 >> 16, arg9, i_119_,
					  arg6, arg12, i_121_, f_124_, f_127_,
					  f_130_, f_125_, f_128_, f_131_);
				arg4 += i_114_;
				arg3 += i_113_;
				arg9 += i_120_;
				arg12 += i_122_;
				arg2 += anInt831;
				f_124_ += f_126_;
				f_127_ += f_129_;
				f_130_ += f_132_;
			    }
			} else {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg0 >= 0) {
				method679(anIntArray828, is, 0, 0, arg2,
					  arg5 >> 16, arg4 >> 16, arg9, i_119_,
					  arg6, arg12, i_121_, f_124_, f_127_,
					  f_130_, f_125_, f_128_, f_131_);
				arg4 += i_114_;
				arg5 += i_115_;
				arg9 += i_120_;
				arg12 += i_122_;
				arg2 += anInt831;
				f_124_ += f_126_;
				f_127_ += f_129_;
				f_130_ += f_132_;
			    }
			    while (--arg1 >= 0) {
				method679(anIntArray828, is, 0, 0, arg2,
					  arg3 >> 16, arg4 >> 16, arg9, i_119_,
					  arg6, arg12, i_121_, f_124_, f_127_,
					  f_130_, f_125_, f_128_, f_131_);
				arg4 += i_114_;
				arg3 += i_113_;
				arg9 += i_120_;
				arg12 += i_122_;
				arg2 += anInt831;
				f_124_ += f_126_;
				f_127_ += f_129_;
				f_130_ += f_132_;
			    }
			}
		    } else {
			arg3 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg3 -= i_114_ * arg2;
			    arg5 -= i_115_ * arg2;
			    arg9 -= i_120_ * arg2;
			    arg12 -= i_122_ * arg2;
			    arg2 = 0;
			}
			arg4 <<= 16;
			if (arg1 < 0) {
			    arg4 -= i_113_ * arg1;
			    arg1 = 0;
			}
			int i_138_ = arg2 - anInt821;
			f_124_ += f_126_ * (float) i_138_;
			f_127_ += f_129_ * (float) i_138_;
			f_130_ += f_132_ * (float) i_138_;
			if (i_114_ < i_115_) {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg1 >= 0) {
				method679(anIntArray828, is, 0, 0, arg2,
					  arg3 >> 16, arg5 >> 16, arg9, i_119_,
					  arg6, arg12, i_121_, f_124_, f_127_,
					  f_130_, f_125_, f_128_, f_131_);
				arg3 += i_114_;
				arg5 += i_115_;
				arg9 += i_120_;
				arg12 += i_122_;
				arg2 += anInt831;
				f_124_ += f_126_;
				f_127_ += f_129_;
				f_130_ += f_132_;
			    }
			    while (--arg0 >= 0) {
				method679(anIntArray828, is, 0, 0, arg2,
					  arg4 >> 16, arg5 >> 16, arg9, i_119_,
					  arg6, arg12, i_121_, f_124_, f_127_,
					  f_130_, f_125_, f_128_, f_131_);
				arg4 += i_113_;
				arg5 += i_115_;
				arg9 += i_120_;
				arg12 += i_122_;
				arg2 += anInt831;
				f_124_ += f_126_;
				f_127_ += f_129_;
				f_130_ += f_132_;
			    }
			} else {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg1 >= 0) {
				method679(anIntArray828, is, 0, 0, arg2,
					  arg5 >> 16, arg3 >> 16, arg9, i_119_,
					  arg6, arg12, i_121_, f_124_, f_127_,
					  f_130_, f_125_, f_128_, f_131_);
				arg3 += i_114_;
				arg5 += i_115_;
				arg9 += i_120_;
				arg12 += i_122_;
				arg2 += anInt831;
				f_124_ += f_126_;
				f_127_ += f_129_;
				f_130_ += f_132_;
			    }
			    while (--arg0 >= 0) {
				method679(anIntArray828, is, 0, 0, arg2,
					  arg5 >> 16, arg4 >> 16, arg9, i_119_,
					  arg6, arg12, i_121_, f_124_, f_127_,
					  f_130_, f_125_, f_128_, f_131_);
				arg4 += i_113_;
				arg5 += i_115_;
				arg9 += i_120_;
				arg12 += i_122_;
				arg2 += anInt831;
				f_124_ += f_126_;
				f_127_ += f_129_;
				f_130_ += f_132_;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static int method681(int arg0, int arg1) {
	arg1 = arg1 * (arg0 & 0x7f) >> 7;
	if (arg1 < 2)
	    arg1 = 2;
	else if (arg1 > 126)
	    arg1 = 126;
	return (arg0 & 0xff80) + arg1;
    }
    
    public void method682(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6) {
	int i = 0;
	if (arg1 != arg0)
	    i = (arg4 - arg3 << 16) / (arg1 - arg0);
	int i_139_ = 0;
	if (arg2 != arg1)
	    i_139_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	int i_140_ = 0;
	if (arg2 != arg0)
	    i_140_ = (arg3 - arg5 << 16) / (arg0 - arg2);
	if (arg0 <= arg1 && arg0 <= arg2) {
	    if (arg0 < anInt824) {
		if (arg1 > anInt824)
		    arg1 = anInt824;
		if (arg2 > anInt824)
		    arg2 = anInt824;
		if (arg1 < arg2) {
		    arg5 = arg3 <<= 16;
		    if (arg0 < 0) {
			arg5 -= i_140_ * arg0;
			arg3 -= i * arg0;
			arg0 = 0;
		    }
		    arg4 <<= 16;
		    if (arg1 < 0) {
			arg4 -= i_139_ * arg1;
			arg1 = 0;
		    }
		    if (arg0 != arg1 && i_140_ < i
			|| arg0 == arg1 && i_140_ > i_139_) {
			arg2 -= arg1;
			arg1 -= arg0;
			arg0 = anIntArray829[arg0];
			while (--arg1 >= 0) {
			    method675(anIntArray828, arg0, arg6, 0, arg5 >> 16,
				      arg3 >> 16);
			    arg5 += i_140_;
			    arg3 += i;
			    arg0 += anInt831;
			}
			while (--arg2 >= 0) {
			    method675(anIntArray828, arg0, arg6, 0, arg5 >> 16,
				      arg4 >> 16);
			    arg5 += i_140_;
			    arg4 += i_139_;
			    arg0 += anInt831;
			}
		    } else {
			arg2 -= arg1;
			arg1 -= arg0;
			arg0 = anIntArray829[arg0];
			while (--arg1 >= 0) {
			    method675(anIntArray828, arg0, arg6, 0, arg3 >> 16,
				      arg5 >> 16);
			    arg5 += i_140_;
			    arg3 += i;
			    arg0 += anInt831;
			}
			while (--arg2 >= 0) {
			    method675(anIntArray828, arg0, arg6, 0, arg4 >> 16,
				      arg5 >> 16);
			    arg5 += i_140_;
			    arg4 += i_139_;
			    arg0 += anInt831;
			}
		    }
		} else {
		    arg4 = arg3 <<= 16;
		    if (arg0 < 0) {
			arg4 -= i_140_ * arg0;
			arg3 -= i * arg0;
			arg0 = 0;
		    }
		    arg5 <<= 16;
		    if (arg2 < 0) {
			arg5 -= i_139_ * arg2;
			arg2 = 0;
		    }
		    if (arg0 != arg2 && i_140_ < i
			|| arg0 == arg2 && i_139_ > i) {
			arg1 -= arg2;
			arg2 -= arg0;
			arg0 = anIntArray829[arg0];
			while (--arg2 >= 0) {
			    method675(anIntArray828, arg0, arg6, 0, arg4 >> 16,
				      arg3 >> 16);
			    arg4 += i_140_;
			    arg3 += i;
			    arg0 += anInt831;
			}
			while (--arg1 >= 0) {
			    method675(anIntArray828, arg0, arg6, 0, arg5 >> 16,
				      arg3 >> 16);
			    arg5 += i_139_;
			    arg3 += i;
			    arg0 += anInt831;
			}
		    } else {
			arg1 -= arg2;
			arg2 -= arg0;
			arg0 = anIntArray829[arg0];
			while (--arg2 >= 0) {
			    method675(anIntArray828, arg0, arg6, 0, arg3 >> 16,
				      arg4 >> 16);
			    arg4 += i_140_;
			    arg3 += i;
			    arg0 += anInt831;
			}
			while (--arg1 >= 0) {
			    method675(anIntArray828, arg0, arg6, 0, arg3 >> 16,
				      arg5 >> 16);
			    arg5 += i_139_;
			    arg3 += i;
			    arg0 += anInt831;
			}
		    }
		}
	    }
	} else if (arg1 <= arg2) {
	    if (arg1 < anInt824) {
		if (arg2 > anInt824)
		    arg2 = anInt824;
		if (arg0 > anInt824)
		    arg0 = anInt824;
		if (arg2 < arg0) {
		    arg3 = arg4 <<= 16;
		    if (arg1 < 0) {
			arg3 -= i * arg1;
			arg4 -= i_139_ * arg1;
			arg1 = 0;
		    }
		    arg5 <<= 16;
		    if (arg2 < 0) {
			arg5 -= i_140_ * arg2;
			arg2 = 0;
		    }
		    if (arg1 != arg2 && i < i_139_
			|| arg1 == arg2 && i > i_140_) {
			arg0 -= arg2;
			arg2 -= arg1;
			arg1 = anIntArray829[arg1];
			while (--arg2 >= 0) {
			    method675(anIntArray828, arg1, arg6, 0, arg3 >> 16,
				      arg4 >> 16);
			    arg3 += i;
			    arg4 += i_139_;
			    arg1 += anInt831;
			}
			while (--arg0 >= 0) {
			    method675(anIntArray828, arg1, arg6, 0, arg3 >> 16,
				      arg5 >> 16);
			    arg3 += i;
			    arg5 += i_140_;
			    arg1 += anInt831;
			}
		    } else {
			arg0 -= arg2;
			arg2 -= arg1;
			arg1 = anIntArray829[arg1];
			while (--arg2 >= 0) {
			    method675(anIntArray828, arg1, arg6, 0, arg4 >> 16,
				      arg3 >> 16);
			    arg3 += i;
			    arg4 += i_139_;
			    arg1 += anInt831;
			}
			while (--arg0 >= 0) {
			    method675(anIntArray828, arg1, arg6, 0, arg5 >> 16,
				      arg3 >> 16);
			    arg3 += i;
			    arg5 += i_140_;
			    arg1 += anInt831;
			}
		    }
		} else {
		    arg5 = arg4 <<= 16;
		    if (arg1 < 0) {
			arg5 -= i * arg1;
			arg4 -= i_139_ * arg1;
			arg1 = 0;
		    }
		    arg3 <<= 16;
		    if (arg0 < 0) {
			arg3 -= i_140_ * arg0;
			arg0 = 0;
		    }
		    if (i < i_139_) {
			arg2 -= arg0;
			arg0 -= arg1;
			arg1 = anIntArray829[arg1];
			while (--arg0 >= 0) {
			    method675(anIntArray828, arg1, arg6, 0, arg5 >> 16,
				      arg4 >> 16);
			    arg5 += i;
			    arg4 += i_139_;
			    arg1 += anInt831;
			}
			while (--arg2 >= 0) {
			    method675(anIntArray828, arg1, arg6, 0, arg3 >> 16,
				      arg4 >> 16);
			    arg3 += i_140_;
			    arg4 += i_139_;
			    arg1 += anInt831;
			}
		    } else {
			arg2 -= arg0;
			arg0 -= arg1;
			arg1 = anIntArray829[arg1];
			while (--arg0 >= 0) {
			    method675(anIntArray828, arg1, arg6, 0, arg4 >> 16,
				      arg5 >> 16);
			    arg5 += i;
			    arg4 += i_139_;
			    arg1 += anInt831;
			}
			while (--arg2 >= 0) {
			    method675(anIntArray828, arg1, arg6, 0, arg4 >> 16,
				      arg3 >> 16);
			    arg3 += i_140_;
			    arg4 += i_139_;
			    arg1 += anInt831;
			}
		    }
		}
	    }
	} else if (arg2 < anInt824) {
	    if (arg0 > anInt824)
		arg0 = anInt824;
	    if (arg1 > anInt824)
		arg1 = anInt824;
	    if (arg0 < arg1) {
		arg4 = arg5 <<= 16;
		if (arg2 < 0) {
		    arg4 -= i_139_ * arg2;
		    arg5 -= i_140_ * arg2;
		    arg2 = 0;
		}
		arg3 <<= 16;
		if (arg0 < 0) {
		    arg3 -= i * arg0;
		    arg0 = 0;
		}
		if (i_139_ < i_140_) {
		    arg1 -= arg0;
		    arg0 -= arg2;
		    arg2 = anIntArray829[arg2];
		    while (--arg0 >= 0) {
			method675(anIntArray828, arg2, arg6, 0, arg4 >> 16,
				  arg5 >> 16);
			arg4 += i_139_;
			arg5 += i_140_;
			arg2 += anInt831;
		    }
		    while (--arg1 >= 0) {
			method675(anIntArray828, arg2, arg6, 0, arg4 >> 16,
				  arg3 >> 16);
			arg4 += i_139_;
			arg3 += i;
			arg2 += anInt831;
		    }
		} else {
		    arg1 -= arg0;
		    arg0 -= arg2;
		    arg2 = anIntArray829[arg2];
		    while (--arg0 >= 0) {
			method675(anIntArray828, arg2, arg6, 0, arg5 >> 16,
				  arg4 >> 16);
			arg4 += i_139_;
			arg5 += i_140_;
			arg2 += anInt831;
		    }
		    while (--arg1 >= 0) {
			method675(anIntArray828, arg2, arg6, 0, arg3 >> 16,
				  arg4 >> 16);
			arg4 += i_139_;
			arg3 += i;
			arg2 += anInt831;
		    }
		}
	    } else {
		arg3 = arg5 <<= 16;
		if (arg2 < 0) {
		    arg3 -= i_139_ * arg2;
		    arg5 -= i_140_ * arg2;
		    arg2 = 0;
		}
		arg4 <<= 16;
		if (arg1 < 0) {
		    arg4 -= i * arg1;
		    arg1 = 0;
		}
		if (i_139_ < i_140_) {
		    arg0 -= arg1;
		    arg1 -= arg2;
		    arg2 = anIntArray829[arg2];
		    while (--arg1 >= 0) {
			method675(anIntArray828, arg2, arg6, 0, arg3 >> 16,
				  arg5 >> 16);
			arg3 += i_139_;
			arg5 += i_140_;
			arg2 += anInt831;
		    }
		    while (--arg0 >= 0) {
			method675(anIntArray828, arg2, arg6, 0, arg4 >> 16,
				  arg5 >> 16);
			arg4 += i;
			arg5 += i_140_;
			arg2 += anInt831;
		    }
		} else {
		    arg0 -= arg1;
		    arg1 -= arg2;
		    arg2 = anIntArray829[arg2];
		    while (--arg1 >= 0) {
			method675(anIntArray828, arg2, arg6, 0, arg5 >> 16,
				  arg3 >> 16);
			arg3 += i_139_;
			arg5 += i_140_;
			arg2 += anInt831;
		    }
		    while (--arg0 >= 0) {
			method675(anIntArray828, arg2, arg6, 0, arg5 >> 16,
				  arg4 >> 16);
			arg4 += i;
			arg5 += i_140_;
			arg2 += anInt831;
		    }
		}
	    }
	}
    }
    
    public void method683
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 int arg7, int arg8, int arg9, int arg10, int arg11, int arg12,
	 int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
	int[] is = aClass130_Sub1_826.method1265(arg18);
	if (is == null) {
	    int i = aClass130_Sub1_826.method1271(arg18);
	    method688(arg0, arg1, arg2, arg3, arg4, arg5, method681(i, arg6),
		      method681(i, arg7), method681(i, arg8));
	} else {
	    aBoolean827 = aClass130_Sub1_826.method1264(arg18);
	    aBoolean830 = aClass130_Sub1_826.method1274(arg18);
	    int i = arg4 - arg3;
	    int i_141_ = arg1 - arg0;
	    int i_142_ = arg5 - arg3;
	    int i_143_ = arg2 - arg0;
	    int i_144_ = arg7 - arg6;
	    int i_145_ = arg8 - arg6;
	    int i_146_ = 0;
	    if (arg1 != arg0)
		i_146_ = (arg4 - arg3 << 16) / (arg1 - arg0);
	    int i_147_ = 0;
	    if (arg2 != arg1)
		i_147_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	    int i_148_ = 0;
	    if (arg2 != arg0)
		i_148_ = (arg3 - arg5 << 16) / (arg0 - arg2);
	    int i_149_ = i * i_143_ - i_142_ * i_141_;
	    if (i_149_ != 0) {
		int i_150_ = (i_144_ * i_143_ - i_145_ * i_141_ << 9) / i_149_;
		int i_151_ = (i_145_ * i - i_144_ * i_142_ << 9) / i_149_;
		float f = 1.0F / (float) aClass130_Sub1_826.anInt4068;
		float f_152_ = (float) aClass130_Sub1_826.anInt4036;
		arg10 = arg9 - arg10;
		arg13 = arg12 - arg13;
		arg16 = arg15 - arg16;
		arg11 -= arg9;
		arg14 -= arg12;
		arg17 -= arg15;
		float f_153_ = (float) (arg11 * arg12 - arg14 * arg9);
		float f_154_ = (float) (arg14 * arg15 - arg17 * arg12) * f;
		float f_155_ = (float) (arg17 * arg9 - arg11 * arg15) / f_152_;
		float f_156_ = (float) (arg10 * arg12 - arg13 * arg9);
		float f_157_ = (float) (arg13 * arg15 - arg16 * arg12) * f;
		float f_158_ = (float) (arg16 * arg9 - arg10 * arg15) / f_152_;
		float f_159_ = (float) (arg13 * arg11 - arg10 * arg14);
		float f_160_ = (float) (arg16 * arg14 - arg13 * arg17) * f;
		float f_161_
		    = (float) (arg10 * arg17 - arg16 * arg11) / f_152_;
		if (arg0 <= arg1 && arg0 <= arg2) {
		    if (arg0 < anInt824) {
			if (arg1 > anInt824)
			    arg1 = anInt824;
			if (arg2 > anInt824)
			    arg2 = anInt824;
			arg6 = (arg6 << 9) - i_150_ * arg3 + i_150_;
			if (arg1 < arg2) {
			    arg5 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg5 -= i_148_ * arg0;
				arg3 -= i_146_ * arg0;
				arg6 -= i_151_ * arg0;
				arg0 = 0;
			    }
			    arg4 <<= 16;
			    if (arg1 < 0) {
				arg4 -= i_147_ * arg1;
				arg1 = 0;
			    }
			    int i_162_ = arg0 - anInt821;
			    f_153_ += f_155_ * (float) i_162_;
			    f_156_ += f_158_ * (float) i_162_;
			    f_159_ += f_161_ * (float) i_162_;
			    if (arg0 != arg1 && i_148_ < i_146_
				|| arg0 == arg1 && i_148_ > i_147_) {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg1 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg0,
					      arg5 >> 16, arg3 >> 16, arg6,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg5 += i_148_;
				    arg3 += i_146_;
				    arg6 += i_151_;
				    arg0 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
				while (--arg2 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg0,
					      arg5 >> 16, arg4 >> 16, arg6,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg5 += i_148_;
				    arg4 += i_147_;
				    arg6 += i_151_;
				    arg0 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
			    } else {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg1 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg0,
					      arg3 >> 16, arg5 >> 16, arg6,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg5 += i_148_;
				    arg3 += i_146_;
				    arg6 += i_151_;
				    arg0 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
				while (--arg2 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg0,
					      arg4 >> 16, arg5 >> 16, arg6,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg5 += i_148_;
				    arg4 += i_147_;
				    arg6 += i_151_;
				    arg0 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
			    }
			} else {
			    arg4 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg4 -= i_148_ * arg0;
				arg3 -= i_146_ * arg0;
				arg6 -= i_151_ * arg0;
				arg0 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_147_ * arg2;
				arg2 = 0;
			    }
			    int i_163_ = arg0 - anInt821;
			    f_153_ += f_155_ * (float) i_163_;
			    f_156_ += f_158_ * (float) i_163_;
			    f_159_ += f_161_ * (float) i_163_;
			    if (arg0 != arg2 && i_148_ < i_146_
				|| arg0 == arg2 && i_147_ > i_146_) {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg2 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg0,
					      arg4 >> 16, arg3 >> 16, arg6,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg4 += i_148_;
				    arg3 += i_146_;
				    arg6 += i_151_;
				    arg0 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
				while (--arg1 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg0,
					      arg5 >> 16, arg3 >> 16, arg6,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg5 += i_147_;
				    arg3 += i_146_;
				    arg6 += i_151_;
				    arg0 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
			    } else {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg2 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg0,
					      arg3 >> 16, arg4 >> 16, arg6,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg4 += i_148_;
				    arg3 += i_146_;
				    arg6 += i_151_;
				    arg0 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
				while (--arg1 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg0,
					      arg3 >> 16, arg5 >> 16, arg6,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg5 += i_147_;
				    arg3 += i_146_;
				    arg6 += i_151_;
				    arg0 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
			    }
			}
		    }
		} else if (arg1 <= arg2) {
		    if (arg1 < anInt824) {
			if (arg2 > anInt824)
			    arg2 = anInt824;
			if (arg0 > anInt824)
			    arg0 = anInt824;
			arg7 = (arg7 << 9) - i_150_ * arg4 + i_150_;
			if (arg2 < arg0) {
			    arg3 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg3 -= i_146_ * arg1;
				arg4 -= i_147_ * arg1;
				arg7 -= i_151_ * arg1;
				arg1 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_148_ * arg2;
				arg2 = 0;
			    }
			    int i_164_ = arg1 - anInt821;
			    f_153_ += f_155_ * (float) i_164_;
			    f_156_ += f_158_ * (float) i_164_;
			    f_159_ += f_161_ * (float) i_164_;
			    if (arg1 != arg2 && i_146_ < i_147_
				|| arg1 == arg2 && i_146_ > i_148_) {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg2 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg1,
					      arg3 >> 16, arg4 >> 16, arg7,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg3 += i_146_;
				    arg4 += i_147_;
				    arg7 += i_151_;
				    arg1 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
				while (--arg0 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg1,
					      arg3 >> 16, arg5 >> 16, arg7,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg3 += i_146_;
				    arg5 += i_148_;
				    arg7 += i_151_;
				    arg1 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
			    } else {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg2 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg1,
					      arg4 >> 16, arg3 >> 16, arg7,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg3 += i_146_;
				    arg4 += i_147_;
				    arg7 += i_151_;
				    arg1 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
				while (--arg0 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg1,
					      arg5 >> 16, arg3 >> 16, arg7,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg3 += i_146_;
				    arg5 += i_148_;
				    arg7 += i_151_;
				    arg1 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
			    }
			} else {
			    arg5 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg5 -= i_146_ * arg1;
				arg4 -= i_147_ * arg1;
				arg7 -= i_151_ * arg1;
				arg1 = 0;
			    }
			    arg3 <<= 16;
			    if (arg0 < 0) {
				arg3 -= i_148_ * arg0;
				arg0 = 0;
			    }
			    int i_165_ = arg1 - anInt821;
			    f_153_ += f_155_ * (float) i_165_;
			    f_156_ += f_158_ * (float) i_165_;
			    f_159_ += f_161_ * (float) i_165_;
			    if (i_146_ < i_147_) {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg0 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg1,
					      arg5 >> 16, arg4 >> 16, arg7,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg5 += i_146_;
				    arg4 += i_147_;
				    arg7 += i_151_;
				    arg1 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
				while (--arg2 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg1,
					      arg3 >> 16, arg4 >> 16, arg7,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg3 += i_148_;
				    arg4 += i_147_;
				    arg7 += i_151_;
				    arg1 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
			    } else {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg0 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg1,
					      arg4 >> 16, arg5 >> 16, arg7,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg5 += i_146_;
				    arg4 += i_147_;
				    arg7 += i_151_;
				    arg1 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
				while (--arg2 >= 0) {
				    method678(anIntArray828, is, 0, 0, arg1,
					      arg4 >> 16, arg3 >> 16, arg7,
					      i_150_, f_153_, f_156_, f_159_,
					      f_154_, f_157_, f_160_);
				    arg3 += i_148_;
				    arg4 += i_147_;
				    arg7 += i_151_;
				    arg1 += anInt831;
				    f_153_ += f_155_;
				    f_156_ += f_158_;
				    f_159_ += f_161_;
				}
			    }
			}
		    }
		} else if (arg2 < anInt824) {
		    if (arg0 > anInt824)
			arg0 = anInt824;
		    if (arg1 > anInt824)
			arg1 = anInt824;
		    arg8 = (arg8 << 9) - i_150_ * arg5 + i_150_;
		    if (arg0 < arg1) {
			arg4 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg4 -= i_147_ * arg2;
			    arg5 -= i_148_ * arg2;
			    arg8 -= i_151_ * arg2;
			    arg2 = 0;
			}
			arg3 <<= 16;
			if (arg0 < 0) {
			    arg3 -= i_146_ * arg0;
			    arg0 = 0;
			}
			int i_166_ = arg2 - anInt821;
			f_153_ += f_155_ * (float) i_166_;
			f_156_ += f_158_ * (float) i_166_;
			f_159_ += f_161_ * (float) i_166_;
			if (i_147_ < i_148_) {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg0 >= 0) {
				method678(anIntArray828, is, 0, 0, arg2,
					  arg4 >> 16, arg5 >> 16, arg8, i_150_,
					  f_153_, f_156_, f_159_, f_154_,
					  f_157_, f_160_);
				arg4 += i_147_;
				arg5 += i_148_;
				arg8 += i_151_;
				arg2 += anInt831;
				f_153_ += f_155_;
				f_156_ += f_158_;
				f_159_ += f_161_;
			    }
			    while (--arg1 >= 0) {
				method678(anIntArray828, is, 0, 0, arg2,
					  arg4 >> 16, arg3 >> 16, arg8, i_150_,
					  f_153_, f_156_, f_159_, f_154_,
					  f_157_, f_160_);
				arg4 += i_147_;
				arg3 += i_146_;
				arg8 += i_151_;
				arg2 += anInt831;
				f_153_ += f_155_;
				f_156_ += f_158_;
				f_159_ += f_161_;
			    }
			} else {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg0 >= 0) {
				method678(anIntArray828, is, 0, 0, arg2,
					  arg5 >> 16, arg4 >> 16, arg8, i_150_,
					  f_153_, f_156_, f_159_, f_154_,
					  f_157_, f_160_);
				arg4 += i_147_;
				arg5 += i_148_;
				arg8 += i_151_;
				arg2 += anInt831;
				f_153_ += f_155_;
				f_156_ += f_158_;
				f_159_ += f_161_;
			    }
			    while (--arg1 >= 0) {
				method678(anIntArray828, is, 0, 0, arg2,
					  arg3 >> 16, arg4 >> 16, arg8, i_150_,
					  f_153_, f_156_, f_159_, f_154_,
					  f_157_, f_160_);
				arg4 += i_147_;
				arg3 += i_146_;
				arg8 += i_151_;
				arg2 += anInt831;
				f_153_ += f_155_;
				f_156_ += f_158_;
				f_159_ += f_161_;
			    }
			}
		    } else {
			arg3 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg3 -= i_147_ * arg2;
			    arg5 -= i_148_ * arg2;
			    arg8 -= i_151_ * arg2;
			    arg2 = 0;
			}
			arg4 <<= 16;
			if (arg1 < 0) {
			    arg4 -= i_146_ * arg1;
			    arg1 = 0;
			}
			int i_167_ = arg2 - anInt821;
			f_153_ += f_155_ * (float) i_167_;
			f_156_ += f_158_ * (float) i_167_;
			f_159_ += f_161_ * (float) i_167_;
			if (i_147_ < i_148_) {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg1 >= 0) {
				method678(anIntArray828, is, 0, 0, arg2,
					  arg3 >> 16, arg5 >> 16, arg8, i_150_,
					  f_153_, f_156_, f_159_, f_154_,
					  f_157_, f_160_);
				arg3 += i_147_;
				arg5 += i_148_;
				arg8 += i_151_;
				arg2 += anInt831;
				f_153_ += f_155_;
				f_156_ += f_158_;
				f_159_ += f_161_;
			    }
			    while (--arg0 >= 0) {
				method678(anIntArray828, is, 0, 0, arg2,
					  arg4 >> 16, arg5 >> 16, arg8, i_150_,
					  f_153_, f_156_, f_159_, f_154_,
					  f_157_, f_160_);
				arg4 += i_146_;
				arg5 += i_148_;
				arg8 += i_151_;
				arg2 += anInt831;
				f_153_ += f_155_;
				f_156_ += f_158_;
				f_159_ += f_161_;
			    }
			} else {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg1 >= 0) {
				method678(anIntArray828, is, 0, 0, arg2,
					  arg5 >> 16, arg3 >> 16, arg8, i_150_,
					  f_153_, f_156_, f_159_, f_154_,
					  f_157_, f_160_);
				arg3 += i_147_;
				arg5 += i_148_;
				arg8 += i_151_;
				arg2 += anInt831;
				f_153_ += f_155_;
				f_156_ += f_158_;
				f_159_ += f_161_;
			    }
			    while (--arg0 >= 0) {
				method678(anIntArray828, is, 0, 0, arg2,
					  arg5 >> 16, arg4 >> 16, arg8, i_150_,
					  f_153_, f_156_, f_159_, f_154_,
					  f_157_, f_160_);
				arg4 += i_146_;
				arg5 += i_148_;
				arg8 += i_151_;
				arg2 += anInt831;
				f_153_ += f_155_;
				f_156_ += f_158_;
				f_159_ += f_161_;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method684(int[] arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7) {
	if (aBoolean820) {
	    if (arg5 > anInt825)
		arg5 = anInt825;
	    if (arg4 < 0)
		arg4 = 0;
	}
	if (arg4 < arg5) {
	    arg1 += arg4 - 1;
	    arg6 += arg7 * arg4;
	    if (aBoolean823) {
		arg3 = arg5 - arg4 >> 2;
		arg7 <<= 2;
		if (anInt819 == 0) {
		    if (arg3 > 0) {
			do {
			    arg2 = Class88.anIntArray1171[arg6 >> 8];
			    arg6 += arg7;
			    arg0[++arg1] = arg2;
			    arg0[++arg1] = arg2;
			    arg0[++arg1] = arg2;
			    arg0[++arg1] = arg2;
			} while (--arg3 > 0);
		    }
		    arg3 = arg5 - arg4 & 0x3;
		    if (arg3 > 0) {
			arg2 = Class88.anIntArray1171[arg6 >> 8];
			do
			    arg0[++arg1] = arg2;
			while (--arg3 > 0);
		    }
		} else {
		    int i = anInt819;
		    int i_168_ = 256 - anInt819;
		    if (arg3 > 0) {
			do {
			    arg2 = Class88.anIntArray1171[arg6 >> 8];
			    arg6 += arg7;
			    arg2
				= (((arg2 & 0xff00ff) * i_168_ >> 8 & 0xff00ff)
				   + ((arg2 & 0xff00) * i_168_ >> 8 & 0xff00));
			    int i_169_ = arg0[++arg1];
			    arg0[arg1]
				= (arg2
				   + ((i_169_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_169_ & 0xff00) * i >> 8 & 0xff00));
			    i_169_ = arg0[++arg1];
			    arg0[arg1]
				= (arg2
				   + ((i_169_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_169_ & 0xff00) * i >> 8 & 0xff00));
			    i_169_ = arg0[++arg1];
			    arg0[arg1]
				= (arg2
				   + ((i_169_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_169_ & 0xff00) * i >> 8 & 0xff00));
			    i_169_ = arg0[++arg1];
			    arg0[arg1]
				= (arg2
				   + ((i_169_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_169_ & 0xff00) * i >> 8 & 0xff00));
			} while (--arg3 > 0);
		    }
		    arg3 = arg5 - arg4 & 0x3;
		    if (arg3 > 0) {
			arg2 = Class88.anIntArray1171[arg6 >> 8];
			arg2 = (((arg2 & 0xff00ff) * i_168_ >> 8 & 0xff00ff)
				+ ((arg2 & 0xff00) * i_168_ >> 8 & 0xff00));
			do {
			    int i_170_ = arg0[++arg1];
			    arg0[arg1]
				= (arg2
				   + ((i_170_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_170_ & 0xff00) * i >> 8 & 0xff00));
			} while (--arg3 > 0);
		    }
		}
	    } else {
		arg3 = arg5 - arg4;
		if (anInt819 == 0) {
		    do {
			arg0[++arg1] = Class88.anIntArray1171[arg6 >> 8];
			arg6 += arg7;
		    } while (--arg3 > 0);
		} else {
		    int i = anInt819;
		    int i_171_ = 256 - anInt819;
		    do {
			arg2 = Class88.anIntArray1171[arg6 >> 8];
			arg6 += arg7;
			arg2 = (((arg2 & 0xff00ff) * i_171_ >> 8 & 0xff00ff)
				+ ((arg2 & 0xff00) * i_171_ >> 8 & 0xff00));
			int i_172_ = arg0[++arg1];
			arg0[arg1]
			    = (arg2 + ((i_172_ & 0xff00ff) * i >> 8 & 0xff00ff)
			       + ((i_172_ & 0xff00) * i >> 8 & 0xff00));
		    } while (--arg3 > 0);
		}
	    }
	}
    }
    
    public void method685(int[] arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7, int arg8, int arg9,
			  int arg10, int arg11) {
	if (aBoolean820) {
	    if (arg5 > anInt825)
		arg5 = anInt825;
	    if (arg4 < 0)
		arg4 = 0;
	}
	if (arg4 < arg5) {
	    arg1 += arg4;
	    arg6 += arg7 * arg4;
	    arg8 += arg9 * arg4;
	    arg10 += arg11 * arg4;
	    if (aBoolean823) {
		arg3 = arg5 - arg4 >> 2;
		arg7 <<= 2;
		arg9 <<= 2;
		arg11 <<= 2;
		if (anInt819 == 0) {
		    if (arg3 > 0) {
			do {
			    arg2 = (~0xffffff | arg6 << 8 & 0xff0000
				    | arg8 & 0xff00 | arg10 >> 8 & 0xff);
			    arg6 += arg7;
			    arg8 += arg9;
			    arg10 += arg11;
			    arg0[arg1++] = arg2;
			    arg0[arg1++] = arg2;
			    arg0[arg1++] = arg2;
			    arg0[arg1++] = arg2;
			} while (--arg3 > 0);
		    }
		    arg3 = arg5 - arg4 & 0x3;
		    if (arg3 > 0) {
			arg2 = (~0xffffff | arg6 << 8 & 0xff0000
				| arg8 & 0xff00 | arg10 >> 8 & 0xff);
			do
			    arg0[arg1++] = arg2;
			while (--arg3 > 0);
		    }
		} else {
		    int i = anInt819;
		    int i_173_ = 256 - anInt819;
		    if (arg3 > 0) {
			do {
			    arg2 = (~0xffffff | arg6 << 8 & 0xff0000
				    | arg8 & 0xff00 | arg10 >> 8 & 0xff);
			    arg6 += arg7;
			    arg8 += arg9;
			    arg10 += arg11;
			    arg2
				= (((arg2 & 0xff00ff) * i_173_ >> 8 & 0xff00ff)
				   + ((arg2 & 0xff00) * i_173_ >> 8 & 0xff00));
			    int i_174_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_174_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_174_ & 0xff00) * i >> 8 & 0xff00));
			    i_174_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_174_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_174_ & 0xff00) * i >> 8 & 0xff00));
			    i_174_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_174_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_174_ & 0xff00) * i >> 8 & 0xff00));
			    i_174_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_174_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_174_ & 0xff00) * i >> 8 & 0xff00));
			} while (--arg3 > 0);
		    }
		    arg3 = arg5 - arg4 & 0x3;
		    if (arg3 > 0) {
			arg2 = (~0xffffff | arg6 << 8 & 0xff0000
				| arg8 & 0xff00 | arg10 >> 8 & 0xff);
			arg2 = (((arg2 & 0xff00ff) * i_173_ >> 8 & 0xff00ff)
				+ ((arg2 & 0xff00) * i_173_ >> 8 & 0xff00));
			do {
			    int i_175_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_175_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_175_ & 0xff00) * i >> 8 & 0xff00));
			} while (--arg3 > 0);
		    }
		}
	    } else {
		arg3 = arg5 - arg4;
		if (anInt819 == 0) {
		    do {
			arg0[arg1++] = (~0xffffff | arg6 << 8 & 0xff0000
					| arg8 & 0xff00 | arg10 >> 8 & 0xff);
			arg6 += arg7;
			arg8 += arg9;
			arg10 += arg11;
		    } while (--arg3 > 0);
		} else {
		    int i = anInt819;
		    int i_176_ = 256 - anInt819;
		    do {
			arg2 = (~0xffffff | arg6 << 8 & 0xff0000
				| arg8 & 0xff00 | arg10 >> 8 & 0xff);
			arg6 += arg7;
			arg8 += arg9;
			arg10 += arg11;
			arg2 = (((arg2 & 0xff00ff) * i_176_ >> 8 & 0xff00ff)
				+ ((arg2 & 0xff00) * i_176_ >> 8 & 0xff00));
			int i_177_ = arg0[arg1];
			arg0[arg1++]
			    = (arg2 + ((i_177_ & 0xff00ff) * i >> 8 & 0xff00ff)
			       + ((i_177_ & 0xff00) * i >> 8 & 0xff00));
		    } while (--arg3 > 0);
		}
	    }
	}
    }
    
    public void method686(int[] arg0, int[] arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7, int arg8, float arg9,
			  float arg10, float arg11, float arg12, float arg13,
			  float arg14) {
	if (aBoolean820) {
	    if (arg6 > anInt825)
		arg6 = anInt825;
	    if (arg5 < 0)
		arg5 = 0;
	}
	if (arg5 < arg6) {
	    arg4 += arg5;
	    arg7 += arg8 * arg5;
	    int i = arg6 - arg5;
	while_16_:
	    do {
		if (anInt819 == 0) {
		    do {
			if (aBoolean827) {
			    int i_178_ = arg5 - anInt822;
			    arg9 += arg12 / 8.0F * (float) i_178_;
			    arg10 += arg13 / 8.0F * (float) i_178_;
			    arg11 += arg14 / 8.0F * (float) i_178_;
			    int i_179_;
			    int i_180_;
			    if (arg11 != 0.0F) {
				i_179_ = (int) (arg9 * 4096.0F / arg11);
				i_180_ = (int) (arg10 * 4096.0F / arg11);
			    } else {
				i_179_ = 0;
				i_180_ = 0;
			    }
			    arg9 += arg12;
			    arg10 += arg13;
			    arg11 += arg14;
			    int i_181_;
			    int i_182_;
			    if (arg11 != 0.0F) {
				i_181_ = (int) (arg9 * 4096.0F / arg11);
				i_182_ = (int) (arg10 * 4096.0F / arg11);
			    } else {
				i_181_ = 0;
				i_182_ = 0;
			    }
			    arg2 = (i_179_ << 20) + i_180_;
			    int i_183_ = ((i_181_ - i_179_ >> 3 << 20)
					  + (i_182_ - i_180_ >> 3));
			    i >>= 3;
			    arg8 <<= 3;
			    int i_184_ = arg7 >> 8;
			    if (aBoolean830) {
				if (i > 0) {
				    do {
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_184_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_184_
						  & 0xff0000)) >> 8;
					arg2 += i_183_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_184_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_184_
						  & 0xff0000)) >> 8;
					arg2 += i_183_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_184_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_184_
						  & 0xff0000)) >> 8;
					arg2 += i_183_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_184_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_184_
						  & 0xff0000)) >> 8;
					arg2 += i_183_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_184_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_184_
						  & 0xff0000)) >> 8;
					arg2 += i_183_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_184_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_184_
						  & 0xff0000)) >> 8;
					arg2 += i_183_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_184_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_184_
						  & 0xff0000)) >> 8;
					arg2 += i_183_;
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_184_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_184_
						  & 0xff0000)) >> 8;
					arg2 += i_183_;
					i_179_ = i_181_;
					i_180_ = i_182_;
					arg9 += arg12;
					arg10 += arg13;
					arg11 += arg14;
					if (arg11 != 0.0F) {
					    i_181_ = (int) (arg9 * 4096.0F
							    / arg11);
					    i_182_ = (int) (arg10 * 4096.0F
							    / arg11);
					} else {
					    i_181_ = 0;
					    i_182_ = 0;
					}
					arg2 = (i_179_ << 20) + i_180_;
					i_183_ = ((i_181_ - i_179_ >> 3 << 20)
						  + (i_182_ - i_180_ >> 3));
					arg7 += arg8;
					i_184_ = arg7 >> 8;
				    } while (--i > 0);
				}
				i = arg6 - arg5 & 0x7;
				if (i > 0) {
				    do {
					arg3 = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)];
					arg0[arg4++]
					    = (((arg3 & 0xff00ff) * i_184_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_184_
						  & 0xff0000)) >> 8;
					arg2 += i_183_;
				    } while (--i > 0);
				}
			    } else {
				if (i > 0) {
				    do {
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_184_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_184_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_183_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_184_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_184_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_183_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_184_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_184_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_183_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_184_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_184_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_183_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_184_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_184_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_183_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_184_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_184_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_183_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_184_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_184_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_183_;
					if ((arg3
					     = arg1[(arg2 & 0xfc0) + (arg2
								      >>> 26)])
					    != 0)
					    arg0[arg4]
						= (((arg3 & 0xff00ff) * i_184_
						    & ~0xff00ff)
						   + ((arg3 & 0xff00) * i_184_
						      & 0xff0000)) >> 8;
					arg4++;
					arg2 += i_183_;
					i_179_ = i_181_;
					i_180_ = i_182_;
					arg9 += arg12;
					arg10 += arg13;
					arg11 += arg14;
					if (arg11 != 0.0F) {
					    i_181_ = (int) (arg9 * 4096.0F
							    / arg11);
					    i_182_ = (int) (arg10 * 4096.0F
							    / arg11);
					} else {
					    i_181_ = 0;
					    i_182_ = 0;
					}
					arg2 = (i_179_ << 20) + i_180_;
					i_183_ = ((i_181_ - i_179_ >> 3 << 20)
						  + (i_182_ - i_180_ >> 3));
					arg7 += arg8;
					i_184_ = arg7 >> 8;
				    } while (--i > 0);
				}
				i = arg6 - arg5 & 0x7;
				if (i <= 0)
				    break;
				do {
				    if ((arg3
					 = arg1[(arg2 & 0xfc0) + (arg2
								  >>> 26)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_184_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_184_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_183_;
				} while (--i > 0);
			    }
			    break;
			}
			int i_185_ = arg5 - anInt822;
			arg9 += arg12 / 8.0F * (float) i_185_;
			arg10 += arg13 / 8.0F * (float) i_185_;
			arg11 += arg14 / 8.0F * (float) i_185_;
			int i_186_;
			int i_187_;
			if (arg11 != 0.0F) {
			    i_186_ = (int) (arg9 * 16384.0F / arg11);
			    i_187_ = (int) (arg10 * 16384.0F / arg11);
			} else {
			    i_186_ = 0;
			    i_187_ = 0;
			}
			arg9 += arg12;
			arg10 += arg13;
			arg11 += arg14;
			int i_188_;
			int i_189_;
			if (arg11 != 0.0F) {
			    i_188_ = (int) (arg9 * 16384.0F / arg11);
			    i_189_ = (int) (arg10 * 16384.0F / arg11);
			} else {
			    i_188_ = 0;
			    i_189_ = 0;
			}
			arg2 = (i_186_ << 18) + i_187_;
			int i_190_ = ((i_188_ - i_186_ >> 3 << 18)
				      + (i_189_ - i_187_ >> 3));
			i >>= 3;
			arg8 <<= 3;
			int i_191_ = arg7 >> 8;
			if (aBoolean830) {
			    if (i > 0) {
				do {
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_191_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_191_
						       & 0xff0000)) >> 8;
				    arg2 += i_190_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_191_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_191_
						       & 0xff0000)) >> 8;
				    arg2 += i_190_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_191_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_191_
						       & 0xff0000)) >> 8;
				    arg2 += i_190_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_191_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_191_
						       & 0xff0000)) >> 8;
				    arg2 += i_190_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_191_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_191_
						       & 0xff0000)) >> 8;
				    arg2 += i_190_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_191_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_191_
						       & 0xff0000)) >> 8;
				    arg2 += i_190_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_191_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_191_
						       & 0xff0000)) >> 8;
				    arg2 += i_190_;
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_191_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_191_
						       & 0xff0000)) >> 8;
				    arg2 += i_190_;
				    i_186_ = i_188_;
				    i_187_ = i_189_;
				    arg9 += arg12;
				    arg10 += arg13;
				    arg11 += arg14;
				    if (arg11 != 0.0F) {
					i_188_
					    = (int) (arg9 * 16384.0F / arg11);
					i_189_
					    = (int) (arg10 * 16384.0F / arg11);
				    } else {
					i_188_ = 0;
					i_189_ = 0;
				    }
				    arg2 = (i_186_ << 18) + i_187_;
				    i_190_ = ((i_188_ - i_186_ >> 3 << 18)
					      + (i_189_ - i_187_ >> 3));
				    arg7 += arg8;
				    i_191_ = arg7 >> 8;
				} while (--i > 0);
			    }
			    i = arg6 - arg5 & 0x7;
			    if (i > 0) {
				do {
				    arg3 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)];
				    arg0[arg4++] = (((arg3 & 0xff00ff) * i_191_
						     & ~0xff00ff)
						    + ((arg3 & 0xff00) * i_191_
						       & 0xff0000)) >> 8;
				    arg2 += i_190_;
				} while (--i > 0);
				break;
			    }
			} else {
			    if (i > 0) {
				do {
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_191_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_191_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_190_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_191_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_191_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_190_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_191_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_191_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_190_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_191_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_191_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_190_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_191_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_191_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_190_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_191_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_191_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_190_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_191_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_191_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_190_;
				    if ((arg3
					 = arg1[(arg2 & 0x3f80) + (arg2
								   >>> 25)])
					!= 0)
					arg0[arg4]
					    = (((arg3 & 0xff00ff) * i_191_
						& ~0xff00ff)
					       + ((arg3 & 0xff00) * i_191_
						  & 0xff0000)) >> 8;
				    arg4++;
				    arg2 += i_190_;
				    i_186_ = i_188_;
				    i_187_ = i_189_;
				    arg9 += arg12;
				    arg10 += arg13;
				    arg11 += arg14;
				    if (arg11 != 0.0F) {
					i_188_
					    = (int) (arg9 / arg11 * 16384.0F);
					i_189_
					    = (int) (arg10 / arg11 * 16384.0F);
				    } else {
					i_188_ = 0;
					i_189_ = 0;
				    }
				    arg2 = (i_186_ << 18) + i_187_;
				    i_190_ = ((i_188_ - i_186_ >> 3 << 18)
					      + (i_189_ - i_187_ >> 3));
				    arg7 += arg8;
				    i_191_ = arg7 >> 8;
				} while (--i > 0);
			    }
			    i = arg6 - arg5 & 0x7;
			    if (i <= 0)
				break while_16_;
			    do {
				if ((arg3
				     = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_191_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_191_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_190_;
			    } while (--i > 0);
			}
		    } while (false);
		    break;
		}
		int i_192_ = anInt819;
		int i_193_ = 256 - anInt819;
		if (aBoolean827) {
		    int i_194_ = arg5 - anInt822;
		    arg9 += arg12 / 8.0F * (float) i_194_;
		    arg10 += arg13 / 8.0F * (float) i_194_;
		    arg11 += arg14 / 8.0F * (float) i_194_;
		    int i_195_;
		    int i_196_;
		    if (arg11 != 0.0F) {
			i_195_ = (int) (arg9 * 4096.0F / arg11);
			i_196_ = (int) (arg10 * 4096.0F / arg11);
		    } else {
			i_195_ = 0;
			i_196_ = 0;
		    }
		    arg9 += arg12;
		    arg10 += arg13;
		    arg11 += arg14;
		    int i_197_;
		    int i_198_;
		    if (arg11 != 0.0F) {
			i_197_ = (int) (arg9 * 4096.0F / arg11);
			i_198_ = (int) (arg10 * 4096.0F / arg11);
		    } else {
			i_197_ = 0;
			i_198_ = 0;
		    }
		    arg2 = (i_195_ << 20) + i_196_;
		    int i_199_ = ((i_197_ - i_195_ >> 3 << 20)
				  + (i_198_ - i_196_ >> 3));
		    i >>= 3;
		    arg8 <<= 3;
		    int i_200_ = arg7 >> 8;
		    if (aBoolean830) {
			if (i > 0) {
			    do {
				int i_201_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3
				    = (((arg3 & 0xff00ff) * i_200_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_200_
					  & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_201_ & 0xff00ff) * i_192_
						  + (arg3 & 0xff00ff) * i_193_)
						 & ~0xff00ff)
						+ (((i_201_ & 0xff00) * i_192_
						    + (arg3 & 0xff00) * i_193_)
						   & 0xff0000)) >> 8;
				arg2 += i_199_;
				i_201_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3
				    = (((arg3 & 0xff00ff) * i_200_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_200_
					  & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_201_ & 0xff00ff) * i_192_
						  + (arg3 & 0xff00ff) * i_193_)
						 & ~0xff00ff)
						+ (((i_201_ & 0xff00) * i_192_
						    + (arg3 & 0xff00) * i_193_)
						   & 0xff0000)) >> 8;
				arg2 += i_199_;
				i_201_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3
				    = (((arg3 & 0xff00ff) * i_200_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_200_
					  & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_201_ & 0xff00ff) * i_192_
						  + (arg3 & 0xff00ff) * i_193_)
						 & ~0xff00ff)
						+ (((i_201_ & 0xff00) * i_192_
						    + (arg3 & 0xff00) * i_193_)
						   & 0xff0000)) >> 8;
				arg2 += i_199_;
				i_201_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3
				    = (((arg3 & 0xff00ff) * i_200_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_200_
					  & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_201_ & 0xff00ff) * i_192_
						  + (arg3 & 0xff00ff) * i_193_)
						 & ~0xff00ff)
						+ (((i_201_ & 0xff00) * i_192_
						    + (arg3 & 0xff00) * i_193_)
						   & 0xff0000)) >> 8;
				arg2 += i_199_;
				i_201_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3
				    = (((arg3 & 0xff00ff) * i_200_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_200_
					  & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_201_ & 0xff00ff) * i_192_
						  + (arg3 & 0xff00ff) * i_193_)
						 & ~0xff00ff)
						+ (((i_201_ & 0xff00) * i_192_
						    + (arg3 & 0xff00) * i_193_)
						   & 0xff0000)) >> 8;
				arg2 += i_199_;
				i_201_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3
				    = (((arg3 & 0xff00ff) * i_200_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_200_
					  & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_201_ & 0xff00ff) * i_192_
						  + (arg3 & 0xff00ff) * i_193_)
						 & ~0xff00ff)
						+ (((i_201_ & 0xff00) * i_192_
						    + (arg3 & 0xff00) * i_193_)
						   & 0xff0000)) >> 8;
				arg2 += i_199_;
				i_201_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3
				    = (((arg3 & 0xff00ff) * i_200_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_200_
					  & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_201_ & 0xff00ff) * i_192_
						  + (arg3 & 0xff00ff) * i_193_)
						 & ~0xff00ff)
						+ (((i_201_ & 0xff00) * i_192_
						    + (arg3 & 0xff00) * i_193_)
						   & 0xff0000)) >> 8;
				arg2 += i_199_;
				i_201_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3
				    = (((arg3 & 0xff00ff) * i_200_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_200_
					  & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_201_ & 0xff00ff) * i_192_
						  + (arg3 & 0xff00ff) * i_193_)
						 & ~0xff00ff)
						+ (((i_201_ & 0xff00) * i_192_
						    + (arg3 & 0xff00) * i_193_)
						   & 0xff0000)) >> 8;
				arg2 += i_199_;
				i_195_ = i_197_;
				i_196_ = i_198_;
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				if (arg11 != 0.0F) {
				    i_197_ = (int) (arg9 * 4096.0F / arg11);
				    i_198_ = (int) (arg10 * 4096.0F / arg11);
				} else {
				    i_197_ = 0;
				    i_198_ = 0;
				}
				arg2 = (i_195_ << 20) + i_196_;
				i_199_ = ((i_197_ - i_195_ >> 3 << 20)
					  + (i_198_ - i_196_ >> 3));
				arg7 += arg8;
				i_200_ = arg7 >> 8;
			    } while (--i > 0);
			}
			i = arg6 - arg5 & 0x7;
			if (i > 0) {
			    do {
				int i_202_ = arg0[arg4];
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg3
				    = (((arg3 & 0xff00ff) * i_200_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_200_
					  & 0xff0000)) >> 8;
				arg0[arg4++] = ((((i_202_ & 0xff00ff) * i_192_
						  + (arg3 & 0xff00ff) * i_193_)
						 & ~0xff00ff)
						+ (((i_202_ & 0xff00) * i_192_
						    + (arg3 & 0xff00) * i_193_)
						   & 0xff0000)) >> 8;
				arg2 += i_199_;
			    } while (--i > 0);
			}
		    } else {
			if (i > 0) {
			    do {
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_203_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_200_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_200_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_203_ & 0xff00ff) * i_192_
					     + (arg3 & 0xff00ff) * i_193_)
					    & ~0xff00ff)
					   + (((i_203_ & 0xff00) * i_192_
					       + (arg3 & 0xff00) * i_193_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_199_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_204_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_200_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_200_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_204_ & 0xff00ff) * i_192_
					     + (arg3 & 0xff00ff) * i_193_)
					    & ~0xff00ff)
					   + (((i_204_ & 0xff00) * i_192_
					       + (arg3 & 0xff00) * i_193_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_199_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_205_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_200_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_200_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_205_ & 0xff00ff) * i_192_
					     + (arg3 & 0xff00ff) * i_193_)
					    & ~0xff00ff)
					   + (((i_205_ & 0xff00) * i_192_
					       + (arg3 & 0xff00) * i_193_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_199_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_206_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_200_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_200_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_206_ & 0xff00ff) * i_192_
					     + (arg3 & 0xff00ff) * i_193_)
					    & ~0xff00ff)
					   + (((i_206_ & 0xff00) * i_192_
					       + (arg3 & 0xff00) * i_193_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_199_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_207_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_200_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_200_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_207_ & 0xff00ff) * i_192_
					     + (arg3 & 0xff00ff) * i_193_)
					    & ~0xff00ff)
					   + (((i_207_ & 0xff00) * i_192_
					       + (arg3 & 0xff00) * i_193_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_199_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_208_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_200_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_200_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_208_ & 0xff00ff) * i_192_
					     + (arg3 & 0xff00ff) * i_193_)
					    & ~0xff00ff)
					   + (((i_208_ & 0xff00) * i_192_
					       + (arg3 & 0xff00) * i_193_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_199_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_209_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_200_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_200_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_209_ & 0xff00ff) * i_192_
					     + (arg3 & 0xff00ff) * i_193_)
					    & ~0xff00ff)
					   + (((i_209_ & 0xff00) * i_192_
					       + (arg3 & 0xff00) * i_193_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_199_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0) {
				    int i_210_ = arg0[arg4];
				    arg3 = (((arg3 & 0xff00ff) * i_200_
					     & ~0xff00ff)
					    + ((arg3 & 0xff00) * i_200_
					       & 0xff0000)) >> 8;
				    arg0[arg4]
					= ((((i_210_ & 0xff00ff) * i_192_
					     + (arg3 & 0xff00ff) * i_193_)
					    & ~0xff00ff)
					   + (((i_210_ & 0xff00) * i_192_
					       + (arg3 & 0xff00) * i_193_)
					      & 0xff0000)) >> 8;
				}
				arg4++;
				arg2 += i_199_;
				i_195_ = i_197_;
				i_196_ = i_198_;
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				if (arg11 != 0.0F) {
				    i_197_ = (int) (arg9 * 4096.0F / arg11);
				    i_198_ = (int) (arg10 * 4096.0F / arg11);
				} else {
				    i_197_ = 0;
				    i_198_ = 0;
				}
				arg2 = (i_195_ << 20) + i_196_;
				i_199_ = ((i_197_ - i_195_ >> 3 << 20)
					  + (i_198_ - i_196_ >> 3));
				arg7 += arg8;
				i_200_ = arg7 >> 8;
			    } while (--i > 0);
			}
			i = arg6 - arg5 & 0x7;
			if (i <= 0)
			    break;
			do {
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0) {
				int i_211_ = arg0[arg4];
				arg3
				    = (((arg3 & 0xff00ff) * i_200_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_200_
					  & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_211_ & 0xff00ff) * i_192_
						+ (arg3 & 0xff00ff) * i_193_)
					       & ~0xff00ff)
					      + (((i_211_ & 0xff00) * i_192_
						  + (arg3 & 0xff00) * i_193_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_199_;
			} while (--i > 0);
		    }
		    break;
		}
		int i_212_ = arg5 - anInt822;
		arg9 += arg12 / 8.0F * (float) i_212_;
		arg10 += arg13 / 8.0F * (float) i_212_;
		arg11 += arg14 / 8.0F * (float) i_212_;
		int i_213_;
		int i_214_;
		if (arg11 != 0.0F) {
		    i_213_ = (int) (arg9 * 16384.0F / arg11);
		    i_214_ = (int) (arg10 * 16384.0F / arg11);
		} else {
		    i_213_ = 0;
		    i_214_ = 0;
		}
		arg9 += arg12;
		arg10 += arg13;
		arg11 += arg14;
		int i_215_;
		int i_216_;
		if (arg11 != 0.0F) {
		    i_215_ = (int) (arg9 * 16384.0F / arg11);
		    i_216_ = (int) (arg10 * 16384.0F / arg11);
		} else {
		    i_215_ = 0;
		    i_216_ = 0;
		}
		arg2 = (i_213_ << 18) + i_214_;
		int i_217_
		    = (i_215_ - i_213_ >> 3 << 18) + (i_216_ - i_214_ >> 3);
		i >>= 3;
		arg8 <<= 3;
		int i_218_ = arg7 >> 8;
		if (aBoolean830) {
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    int i_219_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_218_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_219_ & 0xff00ff) * i_192_
					      + (arg3 & 0xff00ff) * i_193_)
					     & ~0xff00ff)
					    + (((i_219_ & 0xff00) * i_192_
						+ (arg3 & 0xff00) * i_193_)
					       & 0xff0000)) >> 8;
			    arg2 += i_217_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_219_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_218_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_219_ & 0xff00ff) * i_192_
					      + (arg3 & 0xff00ff) * i_193_)
					     & ~0xff00ff)
					    + (((i_219_ & 0xff00) * i_192_
						+ (arg3 & 0xff00) * i_193_)
					       & 0xff0000)) >> 8;
			    arg2 += i_217_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_219_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_218_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_219_ & 0xff00ff) * i_192_
					      + (arg3 & 0xff00ff) * i_193_)
					     & ~0xff00ff)
					    + (((i_219_ & 0xff00) * i_192_
						+ (arg3 & 0xff00) * i_193_)
					       & 0xff0000)) >> 8;
			    arg2 += i_217_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_219_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_218_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_219_ & 0xff00ff) * i_192_
					      + (arg3 & 0xff00ff) * i_193_)
					     & ~0xff00ff)
					    + (((i_219_ & 0xff00) * i_192_
						+ (arg3 & 0xff00) * i_193_)
					       & 0xff0000)) >> 8;
			    arg2 += i_217_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_219_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_218_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_219_ & 0xff00ff) * i_192_
					      + (arg3 & 0xff00ff) * i_193_)
					     & ~0xff00ff)
					    + (((i_219_ & 0xff00) * i_192_
						+ (arg3 & 0xff00) * i_193_)
					       & 0xff0000)) >> 8;
			    arg2 += i_217_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_219_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_218_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_219_ & 0xff00ff) * i_192_
					      + (arg3 & 0xff00ff) * i_193_)
					     & ~0xff00ff)
					    + (((i_219_ & 0xff00) * i_192_
						+ (arg3 & 0xff00) * i_193_)
					       & 0xff0000)) >> 8;
			    arg2 += i_217_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_219_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_218_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_219_ & 0xff00ff) * i_192_
					      + (arg3 & 0xff00ff) * i_193_)
					     & ~0xff00ff)
					    + (((i_219_ & 0xff00) * i_192_
						+ (arg3 & 0xff00) * i_193_)
					       & 0xff0000)) >> 8;
			    arg2 += i_217_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    i_219_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_218_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_219_ & 0xff00ff) * i_192_
					      + (arg3 & 0xff00ff) * i_193_)
					     & ~0xff00ff)
					    + (((i_219_ & 0xff00) * i_192_
						+ (arg3 & 0xff00) * i_193_)
					       & 0xff0000)) >> 8;
			    arg2 += i_217_;
			    i_213_ = i_215_;
			    i_214_ = i_216_;
			    arg9 += arg12;
			    arg10 += arg13;
			    arg11 += arg14;
			    if (arg11 != 0.0F) {
				i_215_ = (int) (arg9 * 16384.0F / arg11);
				i_216_ = (int) (arg10 * 16384.0F / arg11);
			    } else {
				i_215_ = 0;
				i_216_ = 0;
			    }
			    arg2 = (i_213_ << 18) + i_214_;
			    i_217_ = ((i_215_ - i_213_ >> 3 << 18)
				      + (i_216_ - i_214_ >> 3));
			    arg7 += arg8;
			    i_218_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    int i_220_ = arg0[arg4];
			    arg3 = ((((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				     + ((arg3 & 0xff00) * i_218_ & 0xff0000))
				    >> 8);
			    arg0[arg4++] = ((((i_220_ & 0xff00ff) * i_192_
					      + (arg3 & 0xff00ff) * i_193_)
					     & ~0xff00ff)
					    + (((i_220_ & 0xff00) * i_192_
						+ (arg3 & 0xff00) * i_193_)
					       & 0xff0000)) >> 8;
			    arg2 += i_217_;
			} while (--i > 0);
			break;
		    }
		} else {
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_221_ = arg0[arg4];
				arg3
				    = (((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_218_
					  & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_221_ & 0xff00ff) * i_192_
						+ (arg3 & 0xff00ff) * i_193_)
					       & ~0xff00ff)
					      + (((i_221_ & 0xff00) * i_192_
						  + (arg3 & 0xff00) * i_193_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_217_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_222_ = arg0[arg4];
				arg3
				    = (((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_218_
					  & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_222_ & 0xff00ff) * i_192_
						+ (arg3 & 0xff00ff) * i_193_)
					       & ~0xff00ff)
					      + (((i_222_ & 0xff00) * i_192_
						  + (arg3 & 0xff00) * i_193_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_217_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_223_ = arg0[arg4];
				arg3
				    = (((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_218_
					  & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_223_ & 0xff00ff) * i_192_
						+ (arg3 & 0xff00ff) * i_193_)
					       & ~0xff00ff)
					      + (((i_223_ & 0xff00) * i_192_
						  + (arg3 & 0xff00) * i_193_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_217_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_224_ = arg0[arg4];
				arg3
				    = (((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_218_
					  & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_224_ & 0xff00ff) * i_192_
						+ (arg3 & 0xff00ff) * i_193_)
					       & ~0xff00ff)
					      + (((i_224_ & 0xff00) * i_192_
						  + (arg3 & 0xff00) * i_193_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_217_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_225_ = arg0[arg4];
				arg3
				    = (((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_218_
					  & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_225_ & 0xff00ff) * i_192_
						+ (arg3 & 0xff00ff) * i_193_)
					       & ~0xff00ff)
					      + (((i_225_ & 0xff00) * i_192_
						  + (arg3 & 0xff00) * i_193_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_217_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_226_ = arg0[arg4];
				arg3
				    = (((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_218_
					  & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_226_ & 0xff00ff) * i_192_
						+ (arg3 & 0xff00ff) * i_193_)
					       & ~0xff00ff)
					      + (((i_226_ & 0xff00) * i_192_
						  + (arg3 & 0xff00) * i_193_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_217_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_227_ = arg0[arg4];
				arg3
				    = (((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_218_
					  & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_227_ & 0xff00ff) * i_192_
						+ (arg3 & 0xff00ff) * i_193_)
					       & ~0xff00ff)
					      + (((i_227_ & 0xff00) * i_192_
						  + (arg3 & 0xff00) * i_193_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_217_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_228_ = arg0[arg4];
				arg3
				    = (((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_218_
					  & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_228_ & 0xff00ff) * i_192_
						+ (arg3 & 0xff00ff) * i_193_)
					       & ~0xff00ff)
					      + (((i_228_ & 0xff00) * i_192_
						  + (arg3 & 0xff00) * i_193_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_217_;
			    i_213_ = i_215_;
			    i_214_ = i_216_;
			    arg9 += arg12;
			    arg10 += arg13;
			    arg11 += arg14;
			    if (arg11 != 0.0F) {
				i_215_ = (int) (arg9 * 16384.0F / arg11);
				i_216_ = (int) (arg10 * 16384.0F / arg11);
			    } else {
				i_215_ = 0;
				i_216_ = 0;
			    }
			    arg2 = (i_213_ << 18) + i_214_;
			    i_217_ = ((i_215_ - i_213_ >> 3 << 18)
				      + (i_216_ - i_214_ >> 3));
			    arg7 += arg8;
			    i_218_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0) {
				int i_229_ = arg0[arg4];
				arg3
				    = (((arg3 & 0xff00ff) * i_218_ & ~0xff00ff)
				       + ((arg3 & 0xff00) * i_218_
					  & 0xff0000)) >> 8;
				arg0[arg4] = ((((i_229_ & 0xff00ff) * i_192_
						+ (arg3 & 0xff00ff) * i_193_)
					       & ~0xff00ff)
					      + (((i_229_ & 0xff00) * i_192_
						  + (arg3 & 0xff00) * i_193_)
						 & 0xff0000)) >> 8;
			    }
			    arg4++;
			    arg2 += i_217_;
			} while (--i > 0);
		    }
		}
	    } while (false);
	}
    }
    
    public void method687
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 int arg7, int arg8, int arg9, int arg10, int arg11, int arg12,
	 int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
	int[] is = aClass130_Sub1_826.method1265(arg18);
	if (is == null) {
	    int i = aClass130_Sub1_826.method1271(arg18);
	    method688(arg0, arg1, arg2, arg3, arg4, arg5, method681(i, arg6),
		      method681(i, arg7), method681(i, arg8));
	} else {
	    aBoolean827 = aClass130_Sub1_826.method1264(arg18);
	    aBoolean830 = aClass130_Sub1_826.method1274(arg18);
	    int i = arg4 - arg3;
	    int i_230_ = arg1 - arg0;
	    int i_231_ = arg5 - arg3;
	    int i_232_ = arg2 - arg0;
	    int i_233_ = arg7 - arg6;
	    int i_234_ = arg8 - arg6;
	    int i_235_ = 0;
	    if (arg1 != arg0)
		i_235_ = (arg4 - arg3 << 16) / (arg1 - arg0);
	    int i_236_ = 0;
	    if (arg2 != arg1)
		i_236_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	    int i_237_ = 0;
	    if (arg2 != arg0)
		i_237_ = (arg3 - arg5 << 16) / (arg0 - arg2);
	    int i_238_ = i * i_232_ - i_231_ * i_230_;
	    if (i_238_ != 0) {
		int i_239_ = (i_233_ * i_232_ - i_234_ * i_230_ << 9) / i_238_;
		int i_240_ = (i_234_ * i - i_233_ * i_231_ << 9) / i_238_;
		float f = 8.0F / (float) aClass130_Sub1_826.anInt4068;
		float f_241_ = (float) aClass130_Sub1_826.anInt4036;
		arg10 = arg9 - arg10;
		arg13 = arg12 - arg13;
		arg16 = arg15 - arg16;
		arg11 -= arg9;
		arg14 -= arg12;
		arg17 -= arg15;
		float f_242_ = (float) (arg11 * arg12 - arg14 * arg9);
		float f_243_ = (float) (arg14 * arg15 - arg17 * arg12) * f;
		float f_244_ = (float) (arg17 * arg9 - arg11 * arg15) / f_241_;
		float f_245_ = (float) (arg10 * arg12 - arg13 * arg9);
		float f_246_ = (float) (arg13 * arg15 - arg16 * arg12) * f;
		float f_247_ = (float) (arg16 * arg9 - arg10 * arg15) / f_241_;
		float f_248_ = (float) (arg13 * arg11 - arg10 * arg14);
		float f_249_ = (float) (arg16 * arg14 - arg13 * arg17) * f;
		float f_250_
		    = (float) (arg10 * arg17 - arg16 * arg11) / f_241_;
		if (arg0 <= arg1 && arg0 <= arg2) {
		    if (arg0 < anInt824) {
			if (arg1 > anInt824)
			    arg1 = anInt824;
			if (arg2 > anInt824)
			    arg2 = anInt824;
			arg6 = (arg6 << 9) - i_239_ * arg3 + i_239_;
			if (arg1 < arg2) {
			    arg5 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg5 -= i_237_ * arg0;
				arg3 -= i_235_ * arg0;
				arg6 -= i_240_ * arg0;
				arg0 = 0;
			    }
			    arg4 <<= 16;
			    if (arg1 < 0) {
				arg4 -= i_236_ * arg1;
				arg1 = 0;
			    }
			    int i_251_ = arg0 - anInt821;
			    f_242_ += f_244_ * (float) i_251_;
			    f_245_ += f_247_ * (float) i_251_;
			    f_248_ += f_250_ * (float) i_251_;
			    if (arg0 != arg1 && i_237_ < i_235_
				|| arg0 == arg1 && i_237_ > i_236_) {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg1 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg0,
					      arg5 >> 16, arg3 >> 16, arg6,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg5 += i_237_;
				    arg3 += i_235_;
				    arg6 += i_240_;
				    arg0 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
				while (--arg2 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg0,
					      arg5 >> 16, arg4 >> 16, arg6,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg5 += i_237_;
				    arg4 += i_236_;
				    arg6 += i_240_;
				    arg0 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
			    } else {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg1 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg0,
					      arg3 >> 16, arg5 >> 16, arg6,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg5 += i_237_;
				    arg3 += i_235_;
				    arg6 += i_240_;
				    arg0 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
				while (--arg2 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg0,
					      arg4 >> 16, arg5 >> 16, arg6,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg5 += i_237_;
				    arg4 += i_236_;
				    arg6 += i_240_;
				    arg0 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
			    }
			} else {
			    arg4 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg4 -= i_237_ * arg0;
				arg3 -= i_235_ * arg0;
				arg6 -= i_240_ * arg0;
				arg0 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_236_ * arg2;
				arg2 = 0;
			    }
			    int i_252_ = arg0 - anInt821;
			    f_242_ += f_244_ * (float) i_252_;
			    f_245_ += f_247_ * (float) i_252_;
			    f_248_ += f_250_ * (float) i_252_;
			    if (arg0 != arg2 && i_237_ < i_235_
				|| arg0 == arg2 && i_236_ > i_235_) {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg2 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg0,
					      arg4 >> 16, arg3 >> 16, arg6,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg4 += i_237_;
				    arg3 += i_235_;
				    arg6 += i_240_;
				    arg0 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
				while (--arg1 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg0,
					      arg5 >> 16, arg3 >> 16, arg6,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg5 += i_236_;
				    arg3 += i_235_;
				    arg6 += i_240_;
				    arg0 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
			    } else {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray829[arg0];
				while (--arg2 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg0,
					      arg3 >> 16, arg4 >> 16, arg6,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg4 += i_237_;
				    arg3 += i_235_;
				    arg6 += i_240_;
				    arg0 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
				while (--arg1 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg0,
					      arg3 >> 16, arg5 >> 16, arg6,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg5 += i_236_;
				    arg3 += i_235_;
				    arg6 += i_240_;
				    arg0 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
			    }
			}
		    }
		} else if (arg1 <= arg2) {
		    if (arg1 < anInt824) {
			if (arg2 > anInt824)
			    arg2 = anInt824;
			if (arg0 > anInt824)
			    arg0 = anInt824;
			arg7 = (arg7 << 9) - i_239_ * arg4 + i_239_;
			if (arg2 < arg0) {
			    arg3 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg3 -= i_235_ * arg1;
				arg4 -= i_236_ * arg1;
				arg7 -= i_240_ * arg1;
				arg1 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_237_ * arg2;
				arg2 = 0;
			    }
			    int i_253_ = arg1 - anInt821;
			    f_242_ += f_244_ * (float) i_253_;
			    f_245_ += f_247_ * (float) i_253_;
			    f_248_ += f_250_ * (float) i_253_;
			    if (arg1 != arg2 && i_235_ < i_236_
				|| arg1 == arg2 && i_235_ > i_237_) {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg2 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg1,
					      arg3 >> 16, arg4 >> 16, arg7,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg3 += i_235_;
				    arg4 += i_236_;
				    arg7 += i_240_;
				    arg1 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
				while (--arg0 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg1,
					      arg3 >> 16, arg5 >> 16, arg7,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg3 += i_235_;
				    arg5 += i_237_;
				    arg7 += i_240_;
				    arg1 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
			    } else {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg2 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg1,
					      arg4 >> 16, arg3 >> 16, arg7,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg3 += i_235_;
				    arg4 += i_236_;
				    arg7 += i_240_;
				    arg1 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
				while (--arg0 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg1,
					      arg5 >> 16, arg3 >> 16, arg7,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg3 += i_235_;
				    arg5 += i_237_;
				    arg7 += i_240_;
				    arg1 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
			    }
			} else {
			    arg5 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg5 -= i_235_ * arg1;
				arg4 -= i_236_ * arg1;
				arg7 -= i_240_ * arg1;
				arg1 = 0;
			    }
			    arg3 <<= 16;
			    if (arg0 < 0) {
				arg3 -= i_237_ * arg0;
				arg0 = 0;
			    }
			    int i_254_ = arg1 - anInt821;
			    f_242_ += f_244_ * (float) i_254_;
			    f_245_ += f_247_ * (float) i_254_;
			    f_248_ += f_250_ * (float) i_254_;
			    if (i_235_ < i_236_) {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg0 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg1,
					      arg5 >> 16, arg4 >> 16, arg7,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg5 += i_235_;
				    arg4 += i_236_;
				    arg7 += i_240_;
				    arg1 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
				while (--arg2 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg1,
					      arg3 >> 16, arg4 >> 16, arg7,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg3 += i_237_;
				    arg4 += i_236_;
				    arg7 += i_240_;
				    arg1 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
			    } else {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray829[arg1];
				while (--arg0 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg1,
					      arg4 >> 16, arg5 >> 16, arg7,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg5 += i_235_;
				    arg4 += i_236_;
				    arg7 += i_240_;
				    arg1 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
				while (--arg2 >= 0) {
				    method686(anIntArray828, is, 0, 0, arg1,
					      arg4 >> 16, arg3 >> 16, arg7,
					      i_239_, f_242_, f_245_, f_248_,
					      f_243_, f_246_, f_249_);
				    arg3 += i_237_;
				    arg4 += i_236_;
				    arg7 += i_240_;
				    arg1 += anInt831;
				    f_242_ += f_244_;
				    f_245_ += f_247_;
				    f_248_ += f_250_;
				}
			    }
			}
		    }
		} else if (arg2 < anInt824) {
		    if (arg0 > anInt824)
			arg0 = anInt824;
		    if (arg1 > anInt824)
			arg1 = anInt824;
		    arg8 = (arg8 << 9) - i_239_ * arg5 + i_239_;
		    if (arg0 < arg1) {
			arg4 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg4 -= i_236_ * arg2;
			    arg5 -= i_237_ * arg2;
			    arg8 -= i_240_ * arg2;
			    arg2 = 0;
			}
			arg3 <<= 16;
			if (arg0 < 0) {
			    arg3 -= i_235_ * arg0;
			    arg0 = 0;
			}
			int i_255_ = arg2 - anInt821;
			f_242_ += f_244_ * (float) i_255_;
			f_245_ += f_247_ * (float) i_255_;
			f_248_ += f_250_ * (float) i_255_;
			if (i_236_ < i_237_) {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg0 >= 0) {
				method686(anIntArray828, is, 0, 0, arg2,
					  arg4 >> 16, arg5 >> 16, arg8, i_239_,
					  f_242_, f_245_, f_248_, f_243_,
					  f_246_, f_249_);
				arg4 += i_236_;
				arg5 += i_237_;
				arg8 += i_240_;
				arg2 += anInt831;
				f_242_ += f_244_;
				f_245_ += f_247_;
				f_248_ += f_250_;
			    }
			    while (--arg1 >= 0) {
				method686(anIntArray828, is, 0, 0, arg2,
					  arg4 >> 16, arg3 >> 16, arg8, i_239_,
					  f_242_, f_245_, f_248_, f_243_,
					  f_246_, f_249_);
				arg4 += i_236_;
				arg3 += i_235_;
				arg8 += i_240_;
				arg2 += anInt831;
				f_242_ += f_244_;
				f_245_ += f_247_;
				f_248_ += f_250_;
			    }
			} else {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg0 >= 0) {
				method686(anIntArray828, is, 0, 0, arg2,
					  arg5 >> 16, arg4 >> 16, arg8, i_239_,
					  f_242_, f_245_, f_248_, f_243_,
					  f_246_, f_249_);
				arg4 += i_236_;
				arg5 += i_237_;
				arg8 += i_240_;
				arg2 += anInt831;
				f_242_ += f_244_;
				f_245_ += f_247_;
				f_248_ += f_250_;
			    }
			    while (--arg1 >= 0) {
				method686(anIntArray828, is, 0, 0, arg2,
					  arg3 >> 16, arg4 >> 16, arg8, i_239_,
					  f_242_, f_245_, f_248_, f_243_,
					  f_246_, f_249_);
				arg4 += i_236_;
				arg3 += i_235_;
				arg8 += i_240_;
				arg2 += anInt831;
				f_242_ += f_244_;
				f_245_ += f_247_;
				f_248_ += f_250_;
			    }
			}
		    } else {
			arg3 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg3 -= i_236_ * arg2;
			    arg5 -= i_237_ * arg2;
			    arg8 -= i_240_ * arg2;
			    arg2 = 0;
			}
			arg4 <<= 16;
			if (arg1 < 0) {
			    arg4 -= i_235_ * arg1;
			    arg1 = 0;
			}
			int i_256_ = arg2 - anInt821;
			f_242_ += f_244_ * (float) i_256_;
			f_245_ += f_247_ * (float) i_256_;
			f_248_ += f_250_ * (float) i_256_;
			if (i_236_ < i_237_) {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg1 >= 0) {
				method686(anIntArray828, is, 0, 0, arg2,
					  arg3 >> 16, arg5 >> 16, arg8, i_239_,
					  f_242_, f_245_, f_248_, f_243_,
					  f_246_, f_249_);
				arg3 += i_236_;
				arg5 += i_237_;
				arg8 += i_240_;
				arg2 += anInt831;
				f_242_ += f_244_;
				f_245_ += f_247_;
				f_248_ += f_250_;
			    }
			    while (--arg0 >= 0) {
				method686(anIntArray828, is, 0, 0, arg2,
					  arg4 >> 16, arg5 >> 16, arg8, i_239_,
					  f_242_, f_245_, f_248_, f_243_,
					  f_246_, f_249_);
				arg4 += i_235_;
				arg5 += i_237_;
				arg8 += i_240_;
				arg2 += anInt831;
				f_242_ += f_244_;
				f_245_ += f_247_;
				f_248_ += f_250_;
			    }
			} else {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray829[arg2];
			    while (--arg1 >= 0) {
				method686(anIntArray828, is, 0, 0, arg2,
					  arg5 >> 16, arg3 >> 16, arg8, i_239_,
					  f_242_, f_245_, f_248_, f_243_,
					  f_246_, f_249_);
				arg3 += i_236_;
				arg5 += i_237_;
				arg8 += i_240_;
				arg2 += anInt831;
				f_242_ += f_244_;
				f_245_ += f_247_;
				f_248_ += f_250_;
			    }
			    while (--arg0 >= 0) {
				method686(anIntArray828, is, 0, 0, arg2,
					  arg5 >> 16, arg4 >> 16, arg8, i_239_,
					  f_242_, f_245_, f_248_, f_243_,
					  f_246_, f_249_);
				arg4 += i_235_;
				arg5 += i_237_;
				arg8 += i_240_;
				arg2 += anInt831;
				f_242_ += f_244_;
				f_245_ += f_247_;
				f_248_ += f_250_;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method688(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7, int arg8) {
	int i = arg4 - arg3;
	int i_257_ = arg1 - arg0;
	int i_258_ = arg5 - arg3;
	int i_259_ = arg2 - arg0;
	int i_260_ = arg7 - arg6;
	int i_261_ = arg8 - arg6;
	int i_262_;
	if (arg2 != arg1)
	    i_262_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	else
	    i_262_ = 0;
	int i_263_;
	if (arg1 != arg0)
	    i_263_ = (i << 16) / i_257_;
	else
	    i_263_ = 0;
	int i_264_;
	if (arg2 != arg0)
	    i_264_ = (i_258_ << 16) / i_259_;
	else
	    i_264_ = 0;
	int i_265_ = i * i_259_ - i_258_ * i_257_;
	if (i_265_ != 0) {
	    int i_266_ = (i_260_ * i_259_ - i_261_ * i_257_ << 8) / i_265_;
	    int i_267_ = (i_261_ * i - i_260_ * i_258_ << 8) / i_265_;
	    if (arg0 <= arg1 && arg0 <= arg2) {
		if (arg0 < anInt824) {
		    if (arg1 > anInt824)
			arg1 = anInt824;
		    if (arg2 > anInt824)
			arg2 = anInt824;
		    arg6 = (arg6 << 8) - i_266_ * arg3 + i_266_;
		    if (arg1 < arg2) {
			arg5 = arg3 <<= 16;
			if (arg0 < 0) {
			    arg5 -= i_264_ * arg0;
			    arg3 -= i_263_ * arg0;
			    arg6 -= i_267_ * arg0;
			    arg0 = 0;
			}
			arg4 <<= 16;
			if (arg1 < 0) {
			    arg4 -= i_262_ * arg1;
			    arg1 = 0;
			}
			if (arg0 != arg1 && i_264_ < i_263_
			    || arg0 == arg1 && i_264_ > i_262_) {
			    arg2 -= arg1;
			    arg1 -= arg0;
			    arg0 = anIntArray829[arg0];
			    while (--arg1 >= 0) {
				method684(anIntArray828, arg0, 0, 0,
					  arg5 >> 16, arg3 >> 16, arg6,
					  i_266_);
				arg5 += i_264_;
				arg3 += i_263_;
				arg6 += i_267_;
				arg0 += anInt831;
			    }
			    while (--arg2 >= 0) {
				method684(anIntArray828, arg0, 0, 0,
					  arg5 >> 16, arg4 >> 16, arg6,
					  i_266_);
				arg5 += i_264_;
				arg4 += i_262_;
				arg6 += i_267_;
				arg0 += anInt831;
			    }
			} else {
			    arg2 -= arg1;
			    arg1 -= arg0;
			    arg0 = anIntArray829[arg0];
			    while (--arg1 >= 0) {
				method684(anIntArray828, arg0, 0, 0,
					  arg3 >> 16, arg5 >> 16, arg6,
					  i_266_);
				arg5 += i_264_;
				arg3 += i_263_;
				arg6 += i_267_;
				arg0 += anInt831;
			    }
			    while (--arg2 >= 0) {
				method684(anIntArray828, arg0, 0, 0,
					  arg4 >> 16, arg5 >> 16, arg6,
					  i_266_);
				arg5 += i_264_;
				arg4 += i_262_;
				arg6 += i_267_;
				arg0 += anInt831;
			    }
			}
		    } else {
			arg4 = arg3 <<= 16;
			if (arg0 < 0) {
			    arg4 -= i_264_ * arg0;
			    arg3 -= i_263_ * arg0;
			    arg6 -= i_267_ * arg0;
			    arg0 = 0;
			}
			arg5 <<= 16;
			if (arg2 < 0) {
			    arg5 -= i_262_ * arg2;
			    arg2 = 0;
			}
			if (arg0 != arg2 && i_264_ < i_263_
			    || arg0 == arg2 && i_262_ > i_263_) {
			    arg1 -= arg2;
			    arg2 -= arg0;
			    arg0 = anIntArray829[arg0];
			    while (--arg2 >= 0) {
				method684(anIntArray828, arg0, 0, 0,
					  arg4 >> 16, arg3 >> 16, arg6,
					  i_266_);
				arg4 += i_264_;
				arg3 += i_263_;
				arg6 += i_267_;
				arg0 += anInt831;
			    }
			    while (--arg1 >= 0) {
				method684(anIntArray828, arg0, 0, 0,
					  arg5 >> 16, arg3 >> 16, arg6,
					  i_266_);
				arg5 += i_262_;
				arg3 += i_263_;
				arg6 += i_267_;
				arg0 += anInt831;
			    }
			} else {
			    arg1 -= arg2;
			    arg2 -= arg0;
			    arg0 = anIntArray829[arg0];
			    while (--arg2 >= 0) {
				method684(anIntArray828, arg0, 0, 0,
					  arg3 >> 16, arg4 >> 16, arg6,
					  i_266_);
				arg4 += i_264_;
				arg3 += i_263_;
				arg6 += i_267_;
				arg0 += anInt831;
			    }
			    while (--arg1 >= 0) {
				method684(anIntArray828, arg0, 0, 0,
					  arg3 >> 16, arg5 >> 16, arg6,
					  i_266_);
				arg5 += i_262_;
				arg3 += i_263_;
				arg6 += i_267_;
				arg0 += anInt831;
			    }
			}
		    }
		}
	    } else if (arg1 <= arg2) {
		if (arg1 < anInt824) {
		    if (arg2 > anInt824)
			arg2 = anInt824;
		    if (arg0 > anInt824)
			arg0 = anInt824;
		    arg7 = (arg7 << 8) - i_266_ * arg4 + i_266_;
		    if (arg2 < arg0) {
			arg3 = arg4 <<= 16;
			if (arg1 < 0) {
			    arg3 -= i_263_ * arg1;
			    arg4 -= i_262_ * arg1;
			    arg7 -= i_267_ * arg1;
			    arg1 = 0;
			}
			arg5 <<= 16;
			if (arg2 < 0) {
			    arg5 -= i_264_ * arg2;
			    arg2 = 0;
			}
			if (arg1 != arg2 && i_263_ < i_262_
			    || arg1 == arg2 && i_263_ > i_264_) {
			    arg0 -= arg2;
			    arg2 -= arg1;
			    arg1 = anIntArray829[arg1];
			    while (--arg2 >= 0) {
				method684(anIntArray828, arg1, 0, 0,
					  arg3 >> 16, arg4 >> 16, arg7,
					  i_266_);
				arg3 += i_263_;
				arg4 += i_262_;
				arg7 += i_267_;
				arg1 += anInt831;
			    }
			    while (--arg0 >= 0) {
				method684(anIntArray828, arg1, 0, 0,
					  arg3 >> 16, arg5 >> 16, arg7,
					  i_266_);
				arg3 += i_263_;
				arg5 += i_264_;
				arg7 += i_267_;
				arg1 += anInt831;
			    }
			} else {
			    arg0 -= arg2;
			    arg2 -= arg1;
			    arg1 = anIntArray829[arg1];
			    while (--arg2 >= 0) {
				method684(anIntArray828, arg1, 0, 0,
					  arg4 >> 16, arg3 >> 16, arg7,
					  i_266_);
				arg3 += i_263_;
				arg4 += i_262_;
				arg7 += i_267_;
				arg1 += anInt831;
			    }
			    while (--arg0 >= 0) {
				method684(anIntArray828, arg1, 0, 0,
					  arg5 >> 16, arg3 >> 16, arg7,
					  i_266_);
				arg3 += i_263_;
				arg5 += i_264_;
				arg7 += i_267_;
				arg1 += anInt831;
			    }
			}
		    } else {
			arg5 = arg4 <<= 16;
			if (arg1 < 0) {
			    arg5 -= i_263_ * arg1;
			    arg4 -= i_262_ * arg1;
			    arg7 -= i_267_ * arg1;
			    arg1 = 0;
			}
			arg3 <<= 16;
			if (arg0 < 0) {
			    arg3 -= i_264_ * arg0;
			    arg0 = 0;
			}
			if (i_263_ < i_262_) {
			    arg2 -= arg0;
			    arg0 -= arg1;
			    arg1 = anIntArray829[arg1];
			    while (--arg0 >= 0) {
				method684(anIntArray828, arg1, 0, 0,
					  arg5 >> 16, arg4 >> 16, arg7,
					  i_266_);
				arg5 += i_263_;
				arg4 += i_262_;
				arg7 += i_267_;
				arg1 += anInt831;
			    }
			    while (--arg2 >= 0) {
				method684(anIntArray828, arg1, 0, 0,
					  arg3 >> 16, arg4 >> 16, arg7,
					  i_266_);
				arg3 += i_264_;
				arg4 += i_262_;
				arg7 += i_267_;
				arg1 += anInt831;
			    }
			} else {
			    arg2 -= arg0;
			    arg0 -= arg1;
			    arg1 = anIntArray829[arg1];
			    while (--arg0 >= 0) {
				method684(anIntArray828, arg1, 0, 0,
					  arg4 >> 16, arg5 >> 16, arg7,
					  i_266_);
				arg5 += i_263_;
				arg4 += i_262_;
				arg7 += i_267_;
				arg1 += anInt831;
			    }
			    while (--arg2 >= 0) {
				method684(anIntArray828, arg1, 0, 0,
					  arg4 >> 16, arg3 >> 16, arg7,
					  i_266_);
				arg3 += i_264_;
				arg4 += i_262_;
				arg7 += i_267_;
				arg1 += anInt831;
			    }
			}
		    }
		}
	    } else if (arg2 < anInt824) {
		if (arg0 > anInt824)
		    arg0 = anInt824;
		if (arg1 > anInt824)
		    arg1 = anInt824;
		arg8 = (arg8 << 8) - i_266_ * arg5 + i_266_;
		if (arg0 < arg1) {
		    arg4 = arg5 <<= 16;
		    if (arg2 < 0) {
			arg4 -= i_262_ * arg2;
			arg5 -= i_264_ * arg2;
			arg8 -= i_267_ * arg2;
			arg2 = 0;
		    }
		    arg3 <<= 16;
		    if (arg0 < 0) {
			arg3 -= i_263_ * arg0;
			arg0 = 0;
		    }
		    if (i_262_ < i_264_) {
			arg1 -= arg0;
			arg0 -= arg2;
			arg2 = anIntArray829[arg2];
			while (--arg0 >= 0) {
			    method684(anIntArray828, arg2, 0, 0, arg4 >> 16,
				      arg5 >> 16, arg8, i_266_);
			    arg4 += i_262_;
			    arg5 += i_264_;
			    arg8 += i_267_;
			    arg2 += anInt831;
			}
			while (--arg1 >= 0) {
			    method684(anIntArray828, arg2, 0, 0, arg4 >> 16,
				      arg3 >> 16, arg8, i_266_);
			    arg4 += i_262_;
			    arg3 += i_263_;
			    arg8 += i_267_;
			    arg2 += anInt831;
			}
		    } else {
			arg1 -= arg0;
			arg0 -= arg2;
			arg2 = anIntArray829[arg2];
			while (--arg0 >= 0) {
			    method684(anIntArray828, arg2, 0, 0, arg5 >> 16,
				      arg4 >> 16, arg8, i_266_);
			    arg4 += i_262_;
			    arg5 += i_264_;
			    arg8 += i_267_;
			    arg2 += anInt831;
			}
			while (--arg1 >= 0) {
			    method684(anIntArray828, arg2, 0, 0, arg3 >> 16,
				      arg4 >> 16, arg8, i_266_);
			    arg4 += i_262_;
			    arg3 += i_263_;
			    arg8 += i_267_;
			    arg2 += anInt831;
			}
		    }
		} else {
		    arg3 = arg5 <<= 16;
		    if (arg2 < 0) {
			arg3 -= i_262_ * arg2;
			arg5 -= i_264_ * arg2;
			arg8 -= i_267_ * arg2;
			arg2 = 0;
		    }
		    arg4 <<= 16;
		    if (arg1 < 0) {
			arg4 -= i_263_ * arg1;
			arg1 = 0;
		    }
		    if (i_262_ < i_264_) {
			arg0 -= arg1;
			arg1 -= arg2;
			arg2 = anIntArray829[arg2];
			while (--arg1 >= 0) {
			    method684(anIntArray828, arg2, 0, 0, arg3 >> 16,
				      arg5 >> 16, arg8, i_266_);
			    arg3 += i_262_;
			    arg5 += i_264_;
			    arg8 += i_267_;
			    arg2 += anInt831;
			}
			while (--arg0 >= 0) {
			    method684(anIntArray828, arg2, 0, 0, arg4 >> 16,
				      arg5 >> 16, arg8, i_266_);
			    arg4 += i_263_;
			    arg5 += i_264_;
			    arg8 += i_267_;
			    arg2 += anInt831;
			}
		    } else {
			arg0 -= arg1;
			arg1 -= arg2;
			arg2 = anIntArray829[arg2];
			while (--arg1 >= 0) {
			    method684(anIntArray828, arg2, 0, 0, arg5 >> 16,
				      arg3 >> 16, arg8, i_266_);
			    arg3 += i_262_;
			    arg5 += i_264_;
			    arg8 += i_267_;
			    arg2 += anInt831;
			}
			while (--arg0 >= 0) {
			    method684(anIntArray828, arg2, 0, 0, arg5 >> 16,
				      arg4 >> 16, arg8, i_266_);
			    arg4 += i_263_;
			    arg5 += i_264_;
			    arg8 += i_267_;
			    arg2 += anInt831;
			}
		    }
		}
	    }
	}
    }
    
    public void method689(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7, int arg8) {
	int i = arg4 - arg3;
	int i_268_ = arg1 - arg0;
	int i_269_ = arg5 - arg3;
	int i_270_ = arg2 - arg0;
	int i_271_ = (arg7 & 0xff0000) - (arg6 & 0xff0000) >> 8;
	int i_272_ = (arg8 & 0xff0000) - (arg6 & 0xff0000) >> 8;
	int i_273_ = (arg7 & 0xff00) - (arg6 & 0xff00);
	int i_274_ = (arg8 & 0xff00) - (arg6 & 0xff00);
	int i_275_ = (arg7 & 0xff) - (arg6 & 0xff);
	int i_276_ = (arg8 & 0xff) - (arg6 & 0xff);
	int i_277_;
	if (arg2 != arg1)
	    i_277_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	else
	    i_277_ = 0;
	int i_278_;
	if (arg1 != arg0)
	    i_278_ = (i << 16) / i_268_;
	else
	    i_278_ = 0;
	int i_279_;
	if (arg2 != arg0)
	    i_279_ = (i_269_ << 16) / i_270_;
	else
	    i_279_ = 0;
	int i_280_ = i * i_270_ - i_269_ * i_268_;
	if (i_280_ != 0) {
	    int i_281_ = (i_271_ * i_270_ - i_272_ * i_268_) / i_280_;
	    int i_282_ = (i_272_ * i - i_271_ * i_269_) / i_280_;
	    int i_283_ = (i_273_ * i_270_ - i_274_ * i_268_) / i_280_;
	    int i_284_ = (i_274_ * i - i_273_ * i_269_) / i_280_;
	    int i_285_ = (i_275_ * i_270_ - i_276_ * i_268_ << 8) / i_280_;
	    int i_286_ = (i_276_ * i - i_275_ * i_269_ << 8) / i_280_;
	    if (arg0 <= arg1 && arg0 <= arg2) {
		if (arg0 < anInt824) {
		    if (arg1 > anInt824)
			arg1 = anInt824;
		    if (arg2 > anInt824)
			arg2 = anInt824;
		    int i_287_
			= ((arg6 & 0xff0000) >> 8) - i_281_ * arg3 + i_281_;
		    int i_288_ = (arg6 & 0xff00) - i_283_ * arg3 + i_283_;
		    int i_289_ = ((arg6 & 0xff) << 8) - i_285_ * arg3 + i_285_;
		    if (arg1 < arg2) {
			arg5 = arg3 <<= 16;
			if (arg0 < 0) {
			    arg5 -= i_279_ * arg0;
			    arg3 -= i_278_ * arg0;
			    i_287_ -= i_282_ * arg0;
			    i_288_ -= i_284_ * arg0;
			    i_289_ -= i_286_ * arg0;
			    arg0 = 0;
			}
			arg4 <<= 16;
			if (arg1 < 0) {
			    arg4 -= i_277_ * arg1;
			    arg1 = 0;
			}
			if (arg0 != arg1 && i_279_ < i_278_
			    || arg0 == arg1 && i_279_ > i_277_) {
			    arg2 -= arg1;
			    arg1 -= arg0;
			    arg0 = anIntArray829[arg0];
			    while (--arg1 >= 0) {
				method685(anIntArray828, arg0, 0, 0,
					  arg5 >> 16, arg3 >> 16, i_287_,
					  i_281_, i_288_, i_283_, i_289_,
					  i_285_);
				arg5 += i_279_;
				arg3 += i_278_;
				i_287_ += i_282_;
				i_288_ += i_284_;
				i_289_ += i_286_;
				arg0 += anInt831;
			    }
			    while (--arg2 >= 0) {
				method685(anIntArray828, arg0, 0, 0,
					  arg5 >> 16, arg4 >> 16, i_287_,
					  i_281_, i_288_, i_283_, i_289_,
					  i_285_);
				arg5 += i_279_;
				arg4 += i_277_;
				i_287_ += i_282_;
				i_288_ += i_284_;
				i_289_ += i_286_;
				arg0 += anInt831;
			    }
			} else {
			    arg2 -= arg1;
			    arg1 -= arg0;
			    arg0 = anIntArray829[arg0];
			    while (--arg1 >= 0) {
				method685(anIntArray828, arg0, 0, 0,
					  arg3 >> 16, arg5 >> 16, i_287_,
					  i_281_, i_288_, i_283_, i_289_,
					  i_285_);
				arg5 += i_279_;
				arg3 += i_278_;
				i_287_ += i_282_;
				i_288_ += i_284_;
				i_289_ += i_286_;
				arg0 += anInt831;
			    }
			    while (--arg2 >= 0) {
				method685(anIntArray828, arg0, 0, 0,
					  arg4 >> 16, arg5 >> 16, i_287_,
					  i_281_, i_288_, i_283_, i_289_,
					  i_285_);
				arg5 += i_279_;
				arg4 += i_277_;
				i_287_ += i_282_;
				i_288_ += i_284_;
				i_289_ += i_286_;
				arg0 += anInt831;
			    }
			}
		    } else {
			arg4 = arg3 <<= 16;
			if (arg0 < 0) {
			    arg4 -= i_279_ * arg0;
			    arg3 -= i_278_ * arg0;
			    i_287_ -= i_282_ * arg0;
			    i_288_ -= i_284_ * arg0;
			    i_289_ -= i_286_ * arg0;
			    arg0 = 0;
			}
			arg5 <<= 16;
			if (arg2 < 0) {
			    arg5 -= i_277_ * arg2;
			    arg2 = 0;
			}
			if (arg0 != arg2 && i_279_ < i_278_
			    || arg0 == arg2 && i_277_ > i_278_) {
			    arg1 -= arg2;
			    arg2 -= arg0;
			    arg0 = anIntArray829[arg0];
			    while (--arg2 >= 0) {
				method685(anIntArray828, arg0, 0, 0,
					  arg4 >> 16, arg3 >> 16, i_287_,
					  i_281_, i_288_, i_283_, i_289_,
					  i_285_);
				arg4 += i_279_;
				arg3 += i_278_;
				i_287_ += i_282_;
				i_288_ += i_284_;
				i_289_ += i_286_;
				arg0 += anInt831;
			    }
			    while (--arg1 >= 0) {
				method685(anIntArray828, arg0, 0, 0,
					  arg5 >> 16, arg3 >> 16, i_287_,
					  i_281_, i_288_, i_283_, i_289_,
					  i_285_);
				arg5 += i_277_;
				arg3 += i_278_;
				i_287_ += i_282_;
				i_288_ += i_284_;
				i_289_ += i_286_;
				arg0 += anInt831;
			    }
			} else {
			    arg1 -= arg2;
			    arg2 -= arg0;
			    arg0 = anIntArray829[arg0];
			    while (--arg2 >= 0) {
				method685(anIntArray828, arg0, 0, 0,
					  arg3 >> 16, arg4 >> 16, i_287_,
					  i_281_, i_288_, i_283_, i_289_,
					  i_285_);
				arg4 += i_279_;
				arg3 += i_278_;
				i_287_ += i_282_;
				i_288_ += i_284_;
				i_289_ += i_286_;
				arg0 += anInt831;
			    }
			    while (--arg1 >= 0) {
				method685(anIntArray828, arg0, 0, 0,
					  arg3 >> 16, arg5 >> 16, i_287_,
					  i_281_, i_288_, i_283_, i_289_,
					  i_285_);
				arg5 += i_277_;
				arg3 += i_278_;
				i_287_ += i_282_;
				i_288_ += i_284_;
				i_289_ += i_286_;
				arg0 += anInt831;
			    }
			}
		    }
		}
	    } else if (arg1 <= arg2) {
		if (arg1 < anInt824) {
		    if (arg2 > anInt824)
			arg2 = anInt824;
		    if (arg0 > anInt824)
			arg0 = anInt824;
		    int i_290_
			= ((arg7 & 0xff0000) >> 8) - i_281_ * arg4 + i_281_;
		    int i_291_ = (arg7 & 0xff00) - i_283_ * arg4 + i_283_;
		    int i_292_ = ((arg7 & 0xff) << 8) - i_285_ * arg4 + i_285_;
		    if (arg2 < arg0) {
			arg3 = arg4 <<= 16;
			if (arg1 < 0) {
			    arg3 -= i_278_ * arg1;
			    arg4 -= i_277_ * arg1;
			    i_290_ -= i_282_ * arg1;
			    i_291_ -= i_284_ * arg1;
			    i_292_ -= i_286_ * arg1;
			    arg1 = 0;
			}
			arg5 <<= 16;
			if (arg2 < 0) {
			    arg5 -= i_279_ * arg2;
			    arg2 = 0;
			}
			if (arg1 != arg2 && i_278_ < i_277_
			    || arg1 == arg2 && i_278_ > i_279_) {
			    arg0 -= arg2;
			    arg2 -= arg1;
			    arg1 = anIntArray829[arg1];
			    while (--arg2 >= 0) {
				method685(anIntArray828, arg1, 0, 0,
					  arg3 >> 16, arg4 >> 16, i_290_,
					  i_281_, i_291_, i_283_, i_292_,
					  i_285_);
				arg3 += i_278_;
				arg4 += i_277_;
				i_290_ += i_282_;
				i_291_ += i_284_;
				i_292_ += i_286_;
				arg1 += anInt831;
			    }
			    while (--arg0 >= 0) {
				method685(anIntArray828, arg1, 0, 0,
					  arg3 >> 16, arg5 >> 16, i_290_,
					  i_281_, i_291_, i_283_, i_292_,
					  i_285_);
				arg3 += i_278_;
				arg5 += i_279_;
				i_290_ += i_282_;
				i_291_ += i_284_;
				i_292_ += i_286_;
				arg1 += anInt831;
			    }
			} else {
			    arg0 -= arg2;
			    arg2 -= arg1;
			    arg1 = anIntArray829[arg1];
			    while (--arg2 >= 0) {
				method685(anIntArray828, arg1, 0, 0,
					  arg4 >> 16, arg3 >> 16, i_290_,
					  i_281_, i_291_, i_283_, i_292_,
					  i_285_);
				arg3 += i_278_;
				arg4 += i_277_;
				i_290_ += i_282_;
				i_291_ += i_284_;
				i_292_ += i_286_;
				arg1 += anInt831;
			    }
			    while (--arg0 >= 0) {
				method685(anIntArray828, arg1, 0, 0,
					  arg5 >> 16, arg3 >> 16, i_290_,
					  i_281_, i_291_, i_283_, i_292_,
					  i_285_);
				arg3 += i_278_;
				arg5 += i_279_;
				i_290_ += i_282_;
				i_291_ += i_284_;
				i_292_ += i_286_;
				arg1 += anInt831;
			    }
			}
		    } else {
			arg5 = arg4 <<= 16;
			if (arg1 < 0) {
			    arg5 -= i_278_ * arg1;
			    arg4 -= i_277_ * arg1;
			    i_290_ -= i_282_ * arg1;
			    i_291_ -= i_284_ * arg1;
			    i_292_ -= i_286_ * arg1;
			    arg1 = 0;
			}
			arg3 <<= 16;
			if (arg0 < 0) {
			    arg3 -= i_279_ * arg0;
			    arg0 = 0;
			}
			if (i_278_ < i_277_) {
			    arg2 -= arg0;
			    arg0 -= arg1;
			    arg1 = anIntArray829[arg1];
			    while (--arg0 >= 0) {
				method685(anIntArray828, arg1, 0, 0,
					  arg5 >> 16, arg4 >> 16, i_290_,
					  i_281_, i_291_, i_283_, i_292_,
					  i_285_);
				arg5 += i_278_;
				arg4 += i_277_;
				i_290_ += i_282_;
				i_291_ += i_284_;
				i_292_ += i_286_;
				arg1 += anInt831;
			    }
			    while (--arg2 >= 0) {
				method685(anIntArray828, arg1, 0, 0,
					  arg3 >> 16, arg4 >> 16, i_290_,
					  i_281_, i_291_, i_283_, i_292_,
					  i_285_);
				arg3 += i_279_;
				arg4 += i_277_;
				i_290_ += i_282_;
				i_291_ += i_284_;
				i_292_ += i_286_;
				arg1 += anInt831;
			    }
			} else {
			    arg2 -= arg0;
			    arg0 -= arg1;
			    arg1 = anIntArray829[arg1];
			    while (--arg0 >= 0) {
				method685(anIntArray828, arg1, 0, 0,
					  arg4 >> 16, arg5 >> 16, i_290_,
					  i_281_, i_291_, i_283_, i_292_,
					  i_285_);
				arg5 += i_278_;
				arg4 += i_277_;
				i_290_ += i_282_;
				i_291_ += i_284_;
				i_292_ += i_286_;
				arg1 += anInt831;
			    }
			    while (--arg2 >= 0) {
				method685(anIntArray828, arg1, 0, 0,
					  arg4 >> 16, arg3 >> 16, i_290_,
					  i_281_, i_291_, i_283_, i_292_,
					  i_285_);
				arg3 += i_279_;
				arg4 += i_277_;
				i_290_ += i_282_;
				i_291_ += i_284_;
				i_292_ += i_286_;
				arg1 += anInt831;
			    }
			}
		    }
		}
	    } else if (arg2 < anInt824) {
		if (arg0 > anInt824)
		    arg0 = anInt824;
		if (arg1 > anInt824)
		    arg1 = anInt824;
		int i_293_ = ((arg8 & 0xff0000) >> 8) - i_281_ * arg5 + i_281_;
		int i_294_ = (arg8 & 0xff00) - i_283_ * arg5 + i_283_;
		int i_295_ = ((arg8 & 0xff) << 8) - i_285_ * arg5 + i_285_;
		if (arg0 < arg1) {
		    arg4 = arg5 <<= 16;
		    if (arg2 < 0) {
			arg4 -= i_277_ * arg2;
			arg5 -= i_279_ * arg2;
			i_293_ -= i_282_ * arg2;
			i_294_ -= i_284_ * arg2;
			i_295_ -= i_286_ * arg2;
			arg2 = 0;
		    }
		    arg3 <<= 16;
		    if (arg0 < 0) {
			arg3 -= i_278_ * arg0;
			arg0 = 0;
		    }
		    if (i_277_ < i_279_) {
			arg1 -= arg0;
			arg0 -= arg2;
			arg2 = anIntArray829[arg2];
			while (--arg0 >= 0) {
			    method685(anIntArray828, arg2, 0, 0, arg4 >> 16,
				      arg5 >> 16, i_293_, i_281_, i_294_,
				      i_283_, i_295_, i_285_);
			    arg4 += i_277_;
			    arg5 += i_279_;
			    i_293_ += i_282_;
			    i_294_ += i_284_;
			    i_295_ += i_286_;
			    arg2 += anInt831;
			}
			while (--arg1 >= 0) {
			    method685(anIntArray828, arg2, 0, 0, arg4 >> 16,
				      arg3 >> 16, i_293_, i_281_, i_294_,
				      i_283_, i_295_, i_285_);
			    arg4 += i_277_;
			    arg3 += i_278_;
			    i_293_ += i_282_;
			    i_294_ += i_284_;
			    i_295_ += i_286_;
			    arg2 += anInt831;
			}
		    } else {
			arg1 -= arg0;
			arg0 -= arg2;
			arg2 = anIntArray829[arg2];
			while (--arg0 >= 0) {
			    method685(anIntArray828, arg2, 0, 0, arg5 >> 16,
				      arg4 >> 16, i_293_, i_281_, i_294_,
				      i_283_, i_295_, i_285_);
			    arg4 += i_277_;
			    arg5 += i_279_;
			    i_293_ += i_282_;
			    i_294_ += i_284_;
			    i_295_ += i_286_;
			    arg2 += anInt831;
			}
			while (--arg1 >= 0) {
			    method685(anIntArray828, arg2, 0, 0, arg3 >> 16,
				      arg4 >> 16, i_293_, i_281_, i_294_,
				      i_283_, i_295_, i_285_);
			    arg4 += i_277_;
			    arg3 += i_278_;
			    i_293_ += i_282_;
			    i_294_ += i_284_;
			    i_295_ += i_286_;
			    arg2 += anInt831;
			}
		    }
		} else {
		    arg3 = arg5 <<= 16;
		    if (arg2 < 0) {
			arg3 -= i_277_ * arg2;
			arg5 -= i_279_ * arg2;
			i_293_ -= i_282_ * arg2;
			i_294_ -= i_284_ * arg2;
			i_295_ -= i_286_ * arg2;
			arg2 = 0;
		    }
		    arg4 <<= 16;
		    if (arg1 < 0) {
			arg4 -= i_278_ * arg1;
			arg1 = 0;
		    }
		    if (i_277_ < i_279_) {
			arg0 -= arg1;
			arg1 -= arg2;
			arg2 = anIntArray829[arg2];
			while (--arg1 >= 0) {
			    method685(anIntArray828, arg2, 0, 0, arg3 >> 16,
				      arg5 >> 16, i_293_, i_281_, i_294_,
				      i_283_, i_295_, i_285_);
			    arg3 += i_277_;
			    arg5 += i_279_;
			    i_293_ += i_282_;
			    i_294_ += i_284_;
			    i_295_ += i_286_;
			    arg2 += anInt831;
			}
			while (--arg0 >= 0) {
			    method685(anIntArray828, arg2, 0, 0, arg4 >> 16,
				      arg5 >> 16, i_293_, i_281_, i_294_,
				      i_283_, i_295_, i_285_);
			    arg4 += i_278_;
			    arg5 += i_279_;
			    i_293_ += i_282_;
			    i_294_ += i_284_;
			    i_295_ += i_286_;
			    arg2 += anInt831;
			}
		    } else {
			arg0 -= arg1;
			arg1 -= arg2;
			arg2 = anIntArray829[arg2];
			while (--arg1 >= 0) {
			    method685(anIntArray828, arg2, 0, 0, arg5 >> 16,
				      arg3 >> 16, i_293_, i_281_, i_294_,
				      i_283_, i_295_, i_285_);
			    arg3 += i_277_;
			    arg5 += i_279_;
			    i_293_ += i_282_;
			    i_294_ += i_284_;
			    i_295_ += i_286_;
			    arg2 += anInt831;
			}
			while (--arg0 >= 0) {
			    method685(anIntArray828, arg2, 0, 0, arg5 >> 16,
				      arg4 >> 16, i_293_, i_281_, i_294_,
				      i_283_, i_295_, i_285_);
			    arg4 += i_278_;
			    arg5 += i_279_;
			    i_293_ += i_282_;
			    i_294_ += i_284_;
			    i_295_ += i_286_;
			    arg2 += anInt831;
			}
		    }
		}
	    }
	}
    }
    
    public Class65(Class130_Sub1 arg0) {
	anInt819 = 0;
	aBoolean823 = true;
	anIntArray829 = new int[4096];
	aBoolean827 = false;
	aBoolean830 = false;
	aClass130_Sub1_826 = arg0;
	anIntArray828 = aClass130_Sub1_826.anIntArray4026;
	anInt831 = aClass130_Sub1_826.anInt4029;
    }
}
