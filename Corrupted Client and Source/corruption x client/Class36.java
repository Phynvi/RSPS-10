/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import jaggl.opengl;

public abstract class Class36 implements Interface9
{
    public int anInt3449;
    public Class130_Sub2 aClass130_Sub2_3450;
    public int anInt3451;
    public int anInt3452;
    public static int[] anIntArray3453 = new int[1];
    public int anInt3454;
    public boolean aBoolean3455 = false;
    public boolean aBoolean3456;
    
    public static int method469(int arg0) {
	if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837)
	    return 6407;
	if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836)
	    return 6408;
	if (arg0 == 6406 || arg0 == 34844)
	    return 6406;
	if (arg0 == 6409 || arg0 == 34846)
	    return 6409;
	if (arg0 == 6410 || arg0 == 34847)
	    return 6410;
	if (arg0 == 6402)
	    return 6402;
	throw new IllegalArgumentException("");
    }
    
    public static void method470(opengl arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int[] arg7) {
	if (arg3 > 0 && !Class131_Sub2_Sub31.method1624(false, arg3))
	    throw new IllegalArgumentException("");
	if (arg4 > 0 && !Class131_Sub2_Sub31.method1624(false, arg4))
	    throw new IllegalArgumentException("");
	if (arg5 != 32993)
	    throw new IllegalArgumentException("");
	int i = 0;
	int i_0_ = arg3 < arg4 ? arg3 : arg4;
	int i_1_ = arg3 >> 1;
	int i_2_ = arg4 >> 1;
	int[] is = arg7;
	int[] is_3_ = new int[i_1_ * i_2_];
	for (;;) {
	    arg0.glTexImage2D(arg1, i, arg2, arg3, arg4, 0, arg5, arg6,
			      IntBuffer.wrap(is));
	    if (i_0_ <= 1)
		break;
	    int i_4_ = 0;
	    int i_5_ = 0;
	    int i_6_ = i_5_ + arg3;
	    for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
		for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
		    int i_9_ = is[i_5_++];
		    int i_10_ = is[i_5_++];
		    int i_11_ = is[i_6_++];
		    int i_12_ = is[i_6_++];
		    int i_13_ = i_9_ >> 24 & 0xff;
		    int i_14_ = i_9_ >> 16 & 0xff;
		    int i_15_ = i_9_ >> 8 & 0xff;
		    int i_16_ = i_9_ & 0xff;
		    i_13_ += i_10_ >> 24 & 0xff;
		    i_14_ += i_10_ >> 16 & 0xff;
		    i_15_ += i_10_ >> 8 & 0xff;
		    i_16_ += i_10_ & 0xff;
		    i_13_ += i_11_ >> 24 & 0xff;
		    i_14_ += i_11_ >> 16 & 0xff;
		    i_15_ += i_11_ >> 8 & 0xff;
		    i_16_ += i_11_ & 0xff;
		    i_13_ += i_12_ >> 24 & 0xff;
		    i_14_ += i_12_ >> 16 & 0xff;
		    i_15_ += i_12_ >> 8 & 0xff;
		    i_16_ += i_12_ & 0xff;
		    is_3_[i_4_++]
			= ((i_13_ & 0x3fc) << 22 | (i_14_ & 0x3fc) << 14
			   | (i_15_ & 0x3fc) << 6 | (i_16_ & 0x3fc) >> 2);
		}
		i_5_ += arg3;
		i_6_ += arg3;
	    }
	    int[] is_17_ = is_3_;
	    is_3_ = is;
	    is = is_17_;
	    arg3 = i_1_;
	    arg4 = i_2_;
	    i_1_ >>= 1;
	    i_2_ >>= 1;
	    i_0_ >>= 1;
	    i++;
	}
    }
    
    public int method471() {
	return anInt3452;
    }
    
    public static void method472(opengl arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, byte[] arg6) {
	if (arg3 > 0 && !Class131_Sub2_Sub31.method1624(false, arg3))
	    throw new IllegalArgumentException("");
	if (arg4 > 0 && !Class131_Sub2_Sub31.method1624(false, arg4))
	    throw new IllegalArgumentException("");
	int i = method478(arg5);
	int i_18_ = 0;
	int i_19_ = arg3 < arg4 ? arg3 : arg4;
	int i_20_ = arg3 >> 1;
	int i_21_ = arg4 >> 1;
	byte[] is = arg6;
	byte[] is_22_ = new byte[i_20_ * i_21_ * i];
	for (;;) {
	    arg0.glTexImage2D(arg1, i_18_, arg2, arg3, arg4, 0, arg5, 5121,
			      ByteBuffer.wrap(is));
	    if (i_19_ <= 1)
		break;
	    int i_23_ = arg3 * i;
	    for (int i_24_ = 0; i_24_ < i; i_24_++) {
		int i_25_ = i_24_;
		int i_26_ = i_24_;
		int i_27_ = i_26_ + i_23_;
		for (int i_28_ = 0; i_28_ < i_21_; i_28_++) {
		    for (int i_29_ = 0; i_29_ < i_20_; i_29_++) {
			int i_30_ = is[i_26_];
			i_26_ += i;
			i_30_ += is[i_26_];
			i_26_ += i;
			i_30_ += is[i_27_];
			i_27_ += i;
			i_30_ += is[i_27_];
			i_27_ += i;
			is_22_[i_25_] = (byte) (i_30_ >> 2);
			i_25_ += i;
		    }
		    i_26_ += i_23_;
		    i_27_ += i_23_;
		}
	    }
	    byte[] is_31_ = is_22_;
	    is_22_ = is;
	    is = is_31_;
	    arg3 = i_20_;
	    arg4 = i_21_;
	    i_20_ >>= 1;
	    i_21_ >>= 1;
	    i_19_ >>= 1;
	    i_18_++;
	}
    }
    
    public void method473() {
	if (anInt3452 > 0) {
	    aClass130_Sub2_3450.method1344(anInt3452, method481());
	    anInt3452 = 0;
	}
    }
    
    public void method474(int arg0) {
	aClass130_Sub2_3450.anInt3325 -= arg0;
	aClass130_Sub2_3450.anInt3325 += method481();
    }
    
    public boolean method475() {
	opengl var_opengl = aClass130_Sub2_3450.anOpengl3304;
	if (aClass130_Sub2_3450.aBoolean3354) {
	    int i = method481();
	    aClass130_Sub2_3450.method1347(this);
	    var_opengl.glGenerateMipmapEXT(anInt3454);
	    aBoolean3456 = true;
	    method476();
	    method474(i);
	    return true;
	}
	return false;
    }
    
    public void method476() {
	opengl var_opengl = aClass130_Sub2_3450.anOpengl3304;
	aClass130_Sub2_3450.method1347(this);
	if (aBoolean3455) {
	    var_opengl.glTexParameteri(anInt3454, 10241,
				       aBoolean3456 ? 9987 : 9729);
	    var_opengl.glTexParameteri(anInt3454, 10240, 9729);
	} else {
	    var_opengl.glTexParameteri(anInt3454, 10241,
				       aBoolean3456 ? 9984 : 9728);
	    var_opengl.glTexParameteri(anInt3454, 10240, 9728);
	}
    }
    
    public void finalize() throws Throwable {
	method473();
	super.finalize();
    }
    
    public void method477(boolean arg0) {
	if (aBoolean3455 != arg0) {
	    aBoolean3455 = arg0;
	    method476();
	}
    }
    
    public static int method478(int arg0) {
	if (arg0 == 6406)
	    return 1;
	if (arg0 == 6409)
	    return 1;
	if (arg0 == 32841)
	    return 1;
	if (arg0 == 6410)
	    return 2;
	if (arg0 == 6407)
	    return 3;
	if (arg0 == 6408)
	    return 4;
	throw new IllegalArgumentException("");
    }
    
    public static void method479(opengl arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, float[] arg6) {
	if (arg3 > 0 && !Class131_Sub2_Sub31.method1624(false, arg3))
	    throw new IllegalArgumentException("");
	if (arg4 > 0 && !Class131_Sub2_Sub31.method1624(false, arg4))
	    throw new IllegalArgumentException("");
	int i = method478(arg5);
	int i_32_ = 0;
	int i_33_ = arg3 < arg4 ? arg3 : arg4;
	int i_34_ = arg3 >> 1;
	int i_35_ = arg4 >> 1;
	float[] fs = arg6;
	float[] fs_36_ = new float[i_34_ * i_35_ * i];
	for (;;) {
	    arg0.glTexImage2D(arg1, i_32_, arg2, arg3, arg4, 0, arg5, 5126,
			      FloatBuffer.wrap(fs));
	    if (i_33_ <= 1)
		break;
	    int i_37_ = arg3 * i;
	    for (int i_38_ = 0; i_38_ < i; i_38_++) {
		int i_39_ = i_38_;
		int i_40_ = i_38_;
		int i_41_ = i_40_ + i_37_;
		for (int i_42_ = 0; i_42_ < i_35_; i_42_++) {
		    for (int i_43_ = 0; i_43_ < i_34_; i_43_++) {
			float f = fs[i_40_];
			i_40_ += i;
			f += fs[i_40_];
			i_40_ += i;
			f += fs[i_41_];
			i_41_ += i;
			f += fs[i_41_];
			i_41_ += i;
			fs_36_[i_39_] = f * 0.25F;
			i_39_ += i;
		    }
		    i_40_ += i_37_;
		    i_41_ += i_37_;
		}
	    }
	    float[] fs_44_ = fs_36_;
	    fs_36_ = fs;
	    fs = fs_44_;
	    arg3 = i_34_;
	    arg4 = i_35_;
	    i_34_ >>= 1;
	    i_35_ >>= 1;
	    i_33_ >>= 1;
	    i_32_++;
	}
    }
    
    public void method480(boolean arg0) {
	if (aBoolean3456 != arg0) {
	    int i = method481();
	    aBoolean3456 = true;
	    method476();
	    method474(i);
	}
    }
    
    public int method481() {
	int i = aClass130_Sub2_3450.method1291(anInt3449) * anInt3451;
	return aBoolean3456 ? i * 4 / 3 : i;
    }
    
    public Class36(Class130_Sub2 arg0, int arg1, int arg2, int arg3,
		   boolean arg4) {
	aClass130_Sub2_3450 = arg0;
	anInt3454 = arg1;
	anInt3449 = arg2;
	aBoolean3456 = arg4;
	anInt3451 = arg3;
	aClass130_Sub2_3450.anOpengl3304.glGenTextures(1, anIntArray3453, 0);
	anInt3452 = anIntArray3453[0];
	method474(0);
    }
}
