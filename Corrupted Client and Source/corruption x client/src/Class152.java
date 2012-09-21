/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class152
{
    public abstract int method2198();
    
    public abstract void method2199(int i, int i_0_, int i_1_);
    
    public void method2200(int arg0, int arg1, int arg2, int arg3) {
	method2201(arg0, arg1, arg2, arg3, 0, 0, 1);
    }
    
    public abstract void method2201(int i, int i_2_, int i_3_, int i_4_,
				    int i_5_, int i_6_, int i_7_);
    
    public abstract void method2202(int i, int i_8_, int i_9_, int i_10_,
				    int i_11_);
    
    public void method2203(float arg0, float arg1, float arg2, float arg3,
			   int arg4, int arg5, int arg6, int arg7, int arg8) {
	if (arg4 != 0) {
	    double d = (double) (arg5 & 0xffff) * 9.587379924285257E-5;
	    float f = (float) Math.sin(d) * (float) arg4;
	    float f_12_ = (float) Math.cos(d) * (float) arg4;
	    float f_13_ = (-arg2 * f_12_ + -arg3 * f) / 4096.0F + arg0;
	    float f_14_ = (arg2 * f + -arg3 * f_12_) / 4096.0F + arg1;
	    float f_15_ = (((((float) method2216() - arg2) * f_12_ + -arg3 * f)
			    / 4096.0F)
			   + arg0);
	    float f_16_ = ((-((float) method2216() - arg2) * f
			    + -arg3 * f_12_) / 4096.0F
			   + arg1);
	    float f_17_ = (((-arg2 * f_12_ + ((float) method2198() - arg3) * f)
			    / 4096.0F)
			   + arg0);
	    float f_18_
		= ((arg2 * f + ((float) method2198() - arg3) * f_12_) / 4096.0F
		   + arg1);
	    method2217(f_13_, f_14_, f_15_, f_16_, f_17_, f_18_, arg6, arg7,
		       arg8);
	}
    }
    
    public abstract int method2204();
    
    public abstract void method2205(int i, int i_19_, int i_20_, int i_21_,
				    int i_22_, int i_23_, int i_24_);
    
    public abstract int method2206();
    
    public abstract void method2207(float f, float f_25_, float f_26_,
				    float f_27_, float f_28_, float f_29_,
				    Class183 class183, int i, int i_30_);
    
    public abstract void method2208(int i, int i_31_, int i_32_, int i_33_);
    
    public void method2209(float arg0, float arg1, int arg2, int arg3) {
	method2203(arg0, arg1, (float) method2216() / 2.0F,
		   (float) method2198() / 2.0F, arg2, arg3, 0, 0, 1);
    }
    
    public void method2210(float arg0, float arg1, int arg2, int arg3,
			   int arg4, int arg5, int arg6) {
	method2203(arg0, arg1, (float) method2216() / 2.0F,
		   (float) method2198() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }
    
    public void method2211(int arg0, int arg1) {
	method2202(arg0, arg1, 0, 0, 1);
    }
    
    public void method2212(float arg0, float arg1, int arg2, int arg3,
			   Class183 arg4, int arg5, int arg6) {
	method2213(arg0, arg1, (float) method2216() / 2.0F,
		   (float) method2198() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }
    
    public void method2213(float arg0, float arg1, float arg2, float arg3,
			   int arg4, int arg5, Class183 arg6, int arg7,
			   int arg8) {
	if (arg4 != 0) {
	    double d = (double) (arg5 & 0xffff) * 9.587379924285257E-5;
	    float f = (float) Math.sin(d) * (float) arg4;
	    float f_34_ = (float) Math.cos(d) * (float) arg4;
	    float f_35_ = (-arg2 * f_34_ + -arg3 * f) / 4096.0F + arg0;
	    float f_36_ = (arg2 * f + -arg3 * f_34_) / 4096.0F + arg1;
	    float f_37_ = (((((float) method2216() - arg2) * f_34_ + -arg3 * f)
			    / 4096.0F)
			   + arg0);
	    float f_38_ = ((-((float) method2216() - arg2) * f
			    + -arg3 * f_34_) / 4096.0F
			   + arg1);
	    float f_39_ = (((-arg2 * f_34_ + ((float) method2198() - arg3) * f)
			    / 4096.0F)
			   + arg0);
	    float f_40_
		= ((arg2 * f + ((float) method2198() - arg3) * f_34_) / 4096.0F
		   + arg1);
	    method2207(f_35_, f_36_, f_37_, f_38_, f_39_, f_40_, arg6, arg7,
		       arg8);
	}
    }
    
    public abstract void method2214(int i, int i_41_, Class183 class183,
				    int i_42_, int i_43_);
    
    public abstract void method2215(int i, int i_44_, int i_45_, int i_46_,
				    int i_47_, int i_48_);
    
    public abstract int method2216();
    
    public abstract void method2217(float f, float f_49_, float f_50_,
				    float f_51_, float f_52_, float f_53_,
				    int i, int i_54_, int i_55_);
}
