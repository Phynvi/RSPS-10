/* Class1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub5 extends Class1
{
    public boolean aBoolean3556 = false;
    public int anInt3557;
    public int anInt3558;
    public int anInt3559;
    public int anInt3560;
    public int anInt3561;
    
    public boolean method110(int arg0, int arg1) {
	if (!aBoolean3556)
	    return false;
	int i = anInt3560 - anInt3561;
	int i_0_ = anInt3559 - anInt3557;
	int i_1_ = i * i + i_0_ * i_0_;
	int i_2_ = arg0 * i + arg1 * i_0_ - (anInt3561 * i + anInt3557 * i_0_);
	if (i_2_ <= 0) {
	    int i_3_ = anInt3561 - arg0;
	    int i_4_ = anInt3557 - arg1;
	    if (i_3_ * i_3_ + i_4_ * i_4_ >= anInt3558 * anInt3558)
		return false;
	    return true;
	}
	if (i_2_ > i_1_) {
	    int i_5_ = anInt3560 - arg0;
	    int i_6_ = anInt3559 - arg1;
	    if (i_5_ * i_5_ + i_6_ * i_6_ >= anInt3558 * anInt3558)
		return false;
	    return true;
	}
	i_2_ = (i_2_ << 10) / i_1_;
	int i_7_ = anInt3561 + (i * i_2_ >> 10) - arg0;
	int i_8_ = anInt3557 + (i_0_ * i_2_ >> 10) - arg1;
	if (i_7_ * i_7_ + i_8_ * i_8_ >= anInt3558 * anInt3558)
	    return false;
	return true;
    }
}
