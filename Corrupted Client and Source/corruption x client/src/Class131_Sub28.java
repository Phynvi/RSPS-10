/* Class131_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jaggl.opengl;

public class Class131_Sub28 extends Class131
{
    public Class7 aClass7_4493;
    public ByteBuffer aByteBuffer4494;
    public int anInt4495;
    public int[] anIntArray4496;
    public Class68_Sub1 aClass68_Sub1_4497;
    public int anInt4498;
    public int anInt4499;
    public float aFloat4500;
    public Class130_Sub2 aClass130_Sub2_4501;
    
    public void method1842(int arg0, int arg1) {
	aByteBuffer4494.position(3 + 4 * arg1);
	if (arg0 < -71)
	    aByteBuffer4494.put((byte) -1);
    }
    
    public void method1843(int arg0, int arg1, int arg2, int arg3) {
	anIntArray4496[arg2 + aClass68_Sub1_4497.anInt924 * arg3]
	    = Cryption.method2105(anIntArray4496[arg2 + (aClass68_Sub1_4497
							 .anInt924) * arg3],
				  arg0 << arg1);
    }
    
    public void method1844(int[] arg0, int arg1, int arg2) {
	if (arg2 != 21873)
	    method1842(17, 88);
	Class68_Sub1.aStream_3813.offset = 0;
	int i = 0;
	if (aClass130_Sub2_4501.aBoolean3360) {
	    for (int i_0_ = 0; arg1 > i_0_; i_0_++) {
		int i_1_ = arg0[i_0_];
		int i_2_ = anIntArray4496[i_1_];
		short[] is = aClass68_Sub1_4497.aShortArrayArray3831[i_1_];
		if ((i_2_ ^ 0xffffffff) != -1 && is != null) {
		    int i_3_ = 0;
		    int i_4_ = 0;
		    while ((is.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff)) {
			if ((1 << i_3_++ & i_2_) != 0) {
			    i++;
			    Class68_Sub1.aStream_3813
				.writeShort(is[i_4_++]);
			    Class68_Sub1.aStream_3813
				.writeShort(is[i_4_++]);
			    i++;
			    Class68_Sub1.aStream_3813
				.writeShort(is[i_4_++]);
			    i++;
			} else
			    i_4_ += 3;
		    }
		}
	    }
	} else {
	    for (int i_5_ = 0; (arg1 ^ 0xffffffff) < (i_5_ ^ 0xffffffff);
		 i_5_++) {
		int i_6_ = arg0[i_5_];
		short[] is = aClass68_Sub1_4497.aShortArrayArray3831[i_6_];
		int i_7_ = anIntArray4496[i_6_];
		if (-1 != (i_7_ ^ 0xffffffff) && is != null) {
		    int i_8_ = 0;
		    int i_9_ = 0;
		    while (is.length > i_9_) {
			if (-1 == (i_7_ & 1 << i_8_++ ^ 0xffffffff))
			    i_9_ += 3;
			else {
			    Class68_Sub1.aStream_3813
				.method1773(677910600, is[i_9_++]);
			    i++;
			    Class68_Sub1.aStream_3813
				.method1773(677910600, is[i_9_++]);
			    i++;
			    i++;
			    Class68_Sub1.aStream_3813
				.method1773(677910600, is[i_9_++]);
			}
		    }
		}
	    }
	}
	if (i > 0) {
	    opengl var_opengl = aClass130_Sub2_4501.anOpengl3304;
	    aClass130_Sub2_4501.method1343
		(anInt4495, (aClass68_Sub1_4497.anInt3812 & 0x7) != 0,
		 (0x8 & aClass68_Sub1_4497.anInt3812) != 0);
	    if (aClass130_Sub2_4501.aBoolean3362)
		aClass130_Sub2_4501.method1236(2147483647, anInt4499,
					       anInt4498);
	    aClass130_Sub2_4501.anInterface7_3430.method26
		(5123, Class68_Sub1.aStream_3813.data,
		 Class68_Sub1.aStream_3813.offset);
	    var_opengl.glMatrixMode(5890);
	    var_opengl.glPushMatrix();
	    var_opengl.glScalef(1.0F / aFloat4500, 1.0F / aFloat4500, 1.0F);
	    var_opengl.glMatrixMode(5888);
	    aClass130_Sub2_4501.method1305(aClass68_Sub1_4497.aClass7_3843,
					   aClass68_Sub1_4497.aClass7_3837,
					   aClass7_4493,
					   aClass68_Sub1_4497.aClass7_3834);
	    aClass130_Sub2_4501
		.method1312(aClass130_Sub2_4501.anInterface7_3430, 4, 0, i);
	    var_opengl.glMatrixMode(5890);
	    var_opengl.glPopMatrix();
	    var_opengl.glMatrixMode(5888);
	}
    }
    
    public void method1845(int arg0, int arg1) {
	if (arg1 != 65535)
	    anInt4499 = -87;
	aByteBuffer4494 = ByteBuffer.allocateDirect(4 * arg0);
    }
    
    public void method1846(int arg0, int arg1) {
	aByteBuffer4494.position(arg0 * 4);
	aByteBuffer4494.flip();
	if (arg1 > 107) {
	    Interface2 interface2
		= aClass130_Sub2_4501.method1283(0, aByteBuffer4494, false);
	    aClass7_4493
		= new Class7(aClass130_Sub2_4501, interface2, 5121, 4, 0);
	    aByteBuffer4494 = null;
	}
    }
    
    public void method1847(int arg0, int arg1, int arg2, int arg3,
			   float arg4) {
	if (anInt4495 != -1) {
	    Class42 class42
		= aClass130_Sub2_4501.anInterface4_3303.method10(-19907,
								 anInt4495);
	    int i = class42.aByte570 & 0xff;
	    if (0 != i && -5 != (class42.aByte576 ^ 0xffffffff)) {
		int i_10_;
		if ((arg0 ^ 0xffffffff) > -1)
		    i_10_ = 0;
		else if (127 < arg0)
		    i_10_ = 16777215;
		else
		    i_10_ = arg0 * 131586;
		if (-257 != (i ^ 0xffffffff)) {
		    int i_11_ = i;
		    int i_12_ = 256 + -i;
		    arg3 = ((i_11_ * (i_10_ & 0xff00) + i_12_ * (0xff00 & arg3)
			     & 0xff0000)
			    + (i_12_ * (arg3 & 0xff00ff) + i_11_ * (0xff00ff
								    & i_10_)
			       & ~0xff00ff)) >> -1097887448;
		} else
		    arg3 = i_10_;
	    }
	    int i_13_ = class42.aByte577 & 0xff;
	    if (-1 != (i_13_ ^ 0xffffffff)) {
		i_13_ += 256;
		int i_14_ = ((arg3 & 0xff0000) >> -94529040) * i_13_;
		if (65535 < i_14_)
		    i_14_ = 65535;
		int i_15_ = (arg3 >> -740098616 & 0xff) * i_13_;
		if (65535 < i_15_)
		    i_15_ = 65535;
		int i_16_ = (0xff & arg3) * i_13_;
		if (65535 < i_16_)
		    i_16_ = 65535;
		arg3
		    = ((0xff00 & i_15_) + ((~0x4fff00ff & i_14_) << -919813688)
		       + (i_16_ >> 166398280));
	    }
	}
	if (arg4 != 1.0F) {
	    int i = arg3 >> 1372698640 & 0xff;
	    int i_17_ = 0xff & arg3 >> 1370666184;
	    i *= arg4;
	    int i_18_ = 0xff & arg3;
	    i_17_ *= arg4;
	    if (0 <= i) {
		if (-256 > (i ^ 0xffffffff))
		    i = 255;
	    } else
		i = 0;
	    if (0 > i_17_)
		i_17_ = 0;
	    else if ((i_17_ ^ 0xffffffff) < -256)
		i_17_ = 255;
	    i_18_ *= arg4;
	    if (0 > i_18_)
		i_18_ = 0;
	    else if (-256 > (i_18_ ^ 0xffffffff))
		i_18_ = 255;
	    arg3 = i_17_ << -914705272 | i << -840998512 | i_18_;
	}
	aByteBuffer4494.position(arg2 * 4);
	aByteBuffer4494.put((byte) (arg3 >> 814686704));
	int i = 6 / ((arg1 - 26) / 42);
	aByteBuffer4494.put((byte) (arg3 >> 1405797800));
	aByteBuffer4494.put((byte) arg3);
    }
    
    public Class131_Sub28(Class68_Sub1 arg0, int arg1, int arg2, int arg3,
			  int arg4) {
	aClass68_Sub1_4497 = arg0;
	anInt4498 = arg4;
	aClass130_Sub2_4501 = aClass68_Sub1_4497.aClass130_Sub2_3810;
	aFloat4500 = (float) arg2;
	anInt4499 = arg3;
	anIntArray4496 = new int[(aClass68_Sub1_4497.anInt924
				  * aClass68_Sub1_4497.anInt916)];
	anInt4495 = arg1;
    }
}
