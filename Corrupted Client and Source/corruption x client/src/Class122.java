/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.opengl;

public class Class122
{
    public Class130_Sub2 aClass130_Sub2_1594;
    public int anInt1595 = -1;
    public Class119 aClass119_1596;
    public int anInt1597;
    public int anInt1598 = 0;
    public Class102 aClass102_1599;
    public int anInt1600;
    public boolean aBoolean1601;
    public Class36_Sub1 aClass36_Sub1_1602;
    public Class36_Sub1[] aClass36_Sub1Array1603;
    public boolean aBoolean1604;
    public int anInt1605;
    public boolean aBoolean1606;
    public int anInt1607;
    public boolean aBoolean1608;
    public Class217 aClass217_1609;
    
    public void method1062(Class131_Sub40 arg0) {
	method1063(arg0, true);
    }
    
    public void method1063(Class131_Sub40 arg0, boolean arg1) {
	if (arg1)
	    arg0.method1906();
	arg0.aBoolean4663 = false;
	arg0.method1355((byte) 125);
	method1067();
    }
    
    public boolean method1064() {
	return aClass130_Sub2_1594.method1285() == aClass102_1599;
    }
    
    public void method1065() {
	if (method1064()) {
	    opengl var_opengl = aClass130_Sub2_1594.anOpengl3304;
	    aClass130_Sub2_1594.method1299();
	    aClass130_Sub2_1594.method1284(0);
	    aClass130_Sub2_1594.method1244();
	    int i = 0;
	    int i_0_ = 1;
	    Class131_Sub40 class131_sub40_1_;
	    for (Class131_Sub40 class131_sub40
		     = (Class131_Sub40) aClass119_1596.method1007(0);
		 class131_sub40 != null; class131_sub40 = class131_sub40_1_) {
		class131_sub40_1_
		    = (Class131_Sub40) aClass119_1596.method1014(0);
		int i_2_ = class131_sub40.method1907(0);
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
		    class131_sub40.method1912(i_3_, aClass36_Sub1Array1603[i],
					      aClass36_Sub1_1602);
		    if (class131_sub40_1_ == null && i_3_ == i_2_ - 1) {
			aClass130_Sub2_1594.method1339(aClass102_1599);
			aClass130_Sub2_1594.method1282(0, 0);
			var_opengl.glBegin(7);
			var_opengl.glTexCoord2f(0.0F, (float) anInt1595);
			var_opengl.glMultiTexCoord2f(33985, 0.0F, 1.0F);
			var_opengl.glVertex2i(anInt1598, anInt1600);
			var_opengl.glTexCoord2f(0.0F, 0.0F);
			var_opengl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			var_opengl.glVertex2i(anInt1598,
					      anInt1600 + anInt1595);
			var_opengl.glTexCoord2f((float) anInt1597, 0.0F);
			var_opengl.glMultiTexCoord2f(33985, 1.0F, 0.0F);
			var_opengl.glVertex2i(anInt1598 + anInt1597,
					      anInt1600 + anInt1595);
			var_opengl.glTexCoord2f((float) anInt1597,
						(float) anInt1595);
			var_opengl.glMultiTexCoord2f(33985, 1.0F, 1.0F);
			var_opengl.glVertex2i(anInt1598 + anInt1597,
					      anInt1600);
			var_opengl.glEnd();
		    } else {
			aClass102_1599.method890(0 + i_0_);
			var_opengl.glBegin(7);
			var_opengl.glTexCoord2f(0.0F, 0.0F);
			var_opengl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			var_opengl.glVertex2i(0, 0);
			var_opengl.glTexCoord2f(0.0F, (float) anInt1595);
			var_opengl.glMultiTexCoord2f(33985, 0.0F, 1.0F);
			var_opengl.glVertex2i(0, anInt1595);
			var_opengl.glTexCoord2f((float) anInt1597,
						(float) anInt1595);
			var_opengl.glMultiTexCoord2f(33985, 1.0F, 1.0F);
			var_opengl.glVertex2i(anInt1597, anInt1595);
			var_opengl.glTexCoord2f((float) anInt1597, 0.0F);
			var_opengl.glMultiTexCoord2f(33985, 1.0F, 0.0F);
			var_opengl.glVertex2i(anInt1597, 0);
			var_opengl.glEnd();
		    }
		    class131_sub40.method1913(i_3_);
		    i_0_ = i_0_ + 1 & 0x1;
		    i = i + 1 & 0x1;
		}
	    }
	}
    }
    
    public boolean method1066(Class131_Sub40 arg0) {
	if (aClass102_1599 != null) {
	    if (arg0.method1905() || arg0.method1908()) {
		if (anInt1597 != -1 && anInt1595 != -1)
		    arg0.method1911(anInt1597, anInt1595);
		arg0.aBoolean4663 = true;
		aClass119_1596.method1018((byte) -127, arg0);
		method1067();
		return true;
	    }
	    arg0.method1906();
	}
	return false;
    }
    
    public void method1067() {
	int i = 0;
	int i_4_ = 0;
	boolean bool = false;
	for (Class131_Sub40 class131_sub40
		 = (Class131_Sub40) aClass119_1596.method1007(0);
	     class131_sub40 != null;
	     class131_sub40 = (Class131_Sub40) aClass119_1596.method1014(0)) {
	    int i_5_ = class131_sub40.method1909();
	    if (i_5_ > i)
		i = i_5_;
	    i_4_ += class131_sub40.method1907(0);
	    bool |= class131_sub40.method1904(126);
	}
	int i_6_;
	if (i == 2)
	    i_6_ = 34836;
	else if (i == 1)
	    i_6_ = 34842;
	else
	    i_6_ = 6408;
	if (i_6_ != anInt1607) {
	    anInt1607 = i_6_;
	    aBoolean1608 = true;
	}
	int i_7_ = anInt1605 > 2 ? 2 : anInt1605;
	int i_8_ = i_4_ > 2 ? 2 : i_4_;
	if (i_7_ != i_8_)
	    aBoolean1604 = aBoolean1608 = true;
	if (bool != aBoolean1601) {
	    aBoolean1601 = bool;
	    aBoolean1606 = true;
	}
	anInt1605 = i_4_;
    }
    
    public void method1068() {
	if (aClass102_1599 != null) {
	    aClass102_1599 = null;
	    aClass36_Sub1Array1603 = null;
	    aClass217_1609 = null;
	    aClass36_Sub1_1602 = null;
	    aBoolean1608 = true;
	    aBoolean1606 = true;
	    aBoolean1604 = true;
	    if (!aClass119_1596.method1015(-102)) {
		for (Class131 class131 = aClass119_1596.method1007(0);
		     class131 != aClass119_1596.aClass131_1553;
		     class131 = class131.aClass131_1783)
		    ((Class131_Sub40) class131).method1906();
	    }
	}
	anInt1597 = anInt1595 = -1;
    }
    
    public boolean method1069(int arg0, int arg1, int arg2, int arg3) {
	if (aClass102_1599 == null || aClass119_1596.method1015(-69))
	    return false;
	boolean bool = false;
	if (anInt1597 != arg2 || anInt1595 != arg3) {
	    anInt1597 = arg2;
	    anInt1595 = arg3;
	    for (Class131 class131 = aClass119_1596.method1007(0);
		 class131 != aClass119_1596.aClass131_1553;
		 class131 = class131.aClass131_1783)
		((Class131_Sub40) class131).method1911(anInt1597, anInt1595);
	    aBoolean1608 = true;
	    aBoolean1606 = true;
	}
	if (aBoolean1606) {
	    if (aClass217_1609 != null) {
		aClass217_1609.method2818();
		aClass217_1609 = null;
	    }
	    if (aClass36_Sub1_1602 != null) {
		aClass36_Sub1_1602.method473();
		aClass36_Sub1_1602 = null;
	    }
	    if (aBoolean1601)
		aClass36_Sub1_1602
		    = new Class36_Sub1(aClass130_Sub2_1594, 34037, 6402,
				       anInt1597, anInt1595);
	    else
		aClass217_1609 = new Class217(aClass130_Sub2_1594, 6402,
					      anInt1597, anInt1595);
	    aBoolean1604 = true;
	    aBoolean1606 = false;
	    bool = true;
	}
	if (aBoolean1608) {
	    if (aClass36_Sub1Array1603[0] != null) {
		aClass36_Sub1Array1603[0].method473();
		aClass36_Sub1Array1603[0] = null;
	    }
	    if (aClass36_Sub1Array1603[1] != null) {
		aClass36_Sub1Array1603[1].method473();
		aClass36_Sub1Array1603[1] = null;
	    }
	    aClass36_Sub1Array1603[0]
		= new Class36_Sub1(aClass130_Sub2_1594, 34037, anInt1607,
				   anInt1597, anInt1595);
	    aClass36_Sub1Array1603[1]
		= anInt1605 > 1 ? new Class36_Sub1(aClass130_Sub2_1594, 34037,
						   anInt1607, anInt1597,
						   anInt1595) : null;
	    aBoolean1604 = true;
	    aBoolean1608 = false;
	    bool = true;
	}
	int i = aClass130_Sub2_1594.method1285().method17();
	aClass130_Sub2_1594.method1313(aClass102_1599);
	if (aBoolean1604) {
	    aClass102_1599.method889(0);
	    aClass102_1599.method889(1);
	    aClass102_1599.method889(8);
	    if (aClass36_Sub1Array1603[0] != null)
		aClass102_1599.method896(0, aClass36_Sub1Array1603[0]);
	    if (aClass36_Sub1Array1603[1] != null)
		aClass102_1599.method896(1, aClass36_Sub1Array1603[1]);
	    if (aClass36_Sub1_1602 != null)
		aClass102_1599.method896(8, aClass36_Sub1_1602);
	    if (aClass217_1609 != null)
		aClass102_1599.method891(8, aClass217_1609);
	    aClass102_1599.method890(0);
	    aBoolean1604 = false;
	    bool = true;
	}
	if (bool && !aClass102_1599.method894()) {
	    aClass130_Sub2_1594.method1339(aClass102_1599);
	    aBoolean1608 = true;
	    aBoolean1606 = true;
	    aBoolean1604 = true;
	    return false;
	}
	anInt1598 = arg0;
	anInt1600 = arg1;
	aClass130_Sub2_1594.method1282(-anInt1598, anInt1600 + anInt1595 - i);
	return true;
    }
    
    public Class122(Class130_Sub2 arg0) {
	anInt1597 = -1;
	anInt1600 = 0;
	aClass119_1596 = new Class119();
	aBoolean1604 = true;
	aClass36_Sub1Array1603 = new Class36_Sub1[2];
	aBoolean1601 = false;
	aBoolean1606 = true;
	anInt1607 = -1;
	aBoolean1608 = true;
	anInt1605 = 0;
	aClass130_Sub2_1594 = arg0;
	if (aClass130_Sub2_1594.aBoolean3354
	    && aClass130_Sub2_1594.aBoolean3359)
	    aClass102_1599 = new Class102(aClass130_Sub2_1594);
    }
}
