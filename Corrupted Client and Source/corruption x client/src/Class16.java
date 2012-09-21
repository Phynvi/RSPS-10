/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class16
{
    public Class205[] aClass205Array175;
    public int anInt176;
    public int anInt177;
    
    public byte[] method223() {
	int i = 0;
	for (int i_0_ = 0; i_0_ < 10; i_0_++) {
	    if (aClass205Array175[i_0_] != null
		&& (aClass205Array175[i_0_].anInt3010
		    + aClass205Array175[i_0_].anInt2998) > i)
		i = (aClass205Array175[i_0_].anInt3010
		     + aClass205Array175[i_0_].anInt2998);
	}
	if (i == 0)
	    return new byte[0];
	int i_1_ = 22050 * i / 1000;
	byte[] is = new byte[i_1_];
	for (int i_2_ = 0; i_2_ < 10; i_2_++) {
	    if (aClass205Array175[i_2_] != null) {
		int i_3_ = aClass205Array175[i_2_].anInt3010 * 22050 / 1000;
		int i_4_ = aClass205Array175[i_2_].anInt2998 * 22050 / 1000;
		int[] is_5_
		    = aClass205Array175[i_2_]
			  .method2736(i_3_, aClass205Array175[i_2_].anInt3010);
		for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
		    int i_7_ = is[i_6_ + i_4_] + (is_5_[i_6_] >> 8);
		    if ((i_7_ + 128 & ~0xff) != 0)
			i_7_ = i_7_ >> 31 ^ 0x7f;
		    is[i_6_ + i_4_] = (byte) i_7_;
		}
	    }
	}
	return is;
    }
    
    public int method224() {
	int i = 9999999;
	for (int i_8_ = 0; i_8_ < 10; i_8_++) {
	    if (aClass205Array175[i_8_] != null
		&& aClass205Array175[i_8_].anInt2998 / 20 < i)
		i = aClass205Array175[i_8_].anInt2998 / 20;
	}
	if (anInt176 < anInt177 && anInt176 / 20 < i)
	    i = anInt176 / 20;
	if (i == 9999999 || i == 0)
	    return 0;
	for (int i_9_ = 0; i_9_ < 10; i_9_++) {
	    if (aClass205Array175[i_9_] != null)
		aClass205Array175[i_9_].anInt2998 -= i * 20;
	}
	if (anInt176 < anInt177) {
	    anInt176 -= i * 20;
	    anInt177 -= i * 20;
	}
	return i;
    }
    
    public Class131_Sub12_Sub1 method225() {
	byte[] is = method223();
	return new Class131_Sub12_Sub1(22050, is, 22050 * anInt176 / 1000,
				       22050 * anInt177 / 1000);
    }
    
    public Class16(Stream arg0) {
	aClass205Array175 = new Class205[10];
	for (int i = 0; i < 10; i++) {
	    int i_10_ = arg0.readUnsignedByte(-82);
	    if (i_10_ != 0) {
		arg0.offset--;
		aClass205Array175[i] = new Class205();
		aClass205Array175[i].method2735(arg0);
	    }
	}
	anInt176 = arg0.readUnsignedShort(8104);
	anInt177 = arg0.readUnsignedShort(8104);
    }
    
    public static Class16 method226(Class158 arg0, int arg1, int arg2) {
	byte[] is = arg0.method2364(arg2, arg1, 0);
	if (is == null)
	    return null;
	return new Class16(new Stream(is));
    }
    
    public Class16() {
	aClass205Array175 = new Class205[10];
    }
}
