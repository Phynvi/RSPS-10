/* Class1_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub6 extends Class1
{
    public long aLong3562;
    public boolean aBoolean3563;
    public static boolean[] aBooleanArray3564 = new boolean[8];
    public int anInt3565 = 0;
    public Class1_Sub7_Sub1_Sub1[] aClass1_Sub7_Sub1_Sub1Array3566;
    public static boolean[] aBooleanArray3567 = new boolean[8];
    public long aLong3568;
    public Class50 aClass50_3569;
    public boolean aBoolean3570 = false;
    public int anInt3571;
    public Class119 aClass119_3572;
    public int anInt3573;
    public int anInt3574;
    public boolean aBoolean3575;
    public Class105 aClass105_3576;
    public int anInt3577;
    public int anInt3578;
    public int anInt3579;
    
    public void method111(Class130 arg0, Class41[] arg1, boolean arg2) {
	for (int i = 0; i < 8; i++)
	    aBooleanArray3567[i] = false;
    while_70_:
	for (Class1_Sub3 class1_sub3
		 = (Class1_Sub3) aClass50_3569.method586((byte) 42);
	     class1_sub3 != null;
	     class1_sub3 = (Class1_Sub3) aClass50_3569.method589(84)) {
	    if (arg1 != null) {
		for (int i = 0; i < arg1.length; i++) {
		    if (class1_sub3.aClass41_3532 == arg1[i]
			|| class1_sub3.aClass41_3532 == arg1[i].aClass41_546) {
			aBooleanArray3567[i] = true;
			class1_sub3.method106(-24415);
			class1_sub3.aBoolean3526 = false;
			continue while_70_;
		    }
		}
	    }
	    if (!arg2) {
		if (class1_sub3.anInt3521 == 0) {
		    class1_sub3.method95((byte) 71);
		    anInt3571--;
		} else
		    class1_sub3.aBoolean3526 = true;
	    }
	}
	if (arg1 != null) {
	    for (int i = 0; i < arg1.length; i++) {
		if (anInt3571 == 8)
		    break;
		if (!aBooleanArray3567[i]) {
		    Class1_Sub3 class1_sub3
			= new Class1_Sub3(arg0, arg1[i], this, aLong3568);
		    aClass50_3569.method584(class1_sub3, (byte) -128);
		    anInt3571++;
		    aBooleanArray3567[i] = true;
		}
	    }
	}
    }
    
    public void method112() {
	aBoolean3570 = false;
    }
    
    public Class105 method113() {
	return aClass105_3576;
    }
    
    public static void method114() {
	aBooleanArray3567 = null;
	aBooleanArray3564 = null;
    }
    
    public void method115(long arg0) {
	aLong3568 = arg0;
    }
    
    public void method116(Class104[] arg0, boolean arg1) {
	for (int i = 0; i < 8; i++)
	    aBooleanArray3564[i] = false;
    while_72_:
	for (Class131_Sub41_Sub12 class131_sub41_sub12
		 = (Class131_Sub41_Sub12) aClass119_3572.method1007(0);
	     class131_sub41_sub12 != null;
	     class131_sub41_sub12
		 = (Class131_Sub41_Sub12) aClass119_3572.method1014(0)) {
	    if (arg0 != null) {
		for (int i = 0; i < arg0.length; i++) {
		    if (class131_sub41_sub12.aClass104_6310 == arg0[i]
			|| (class131_sub41_sub12.aClass104_6310
			    == arg0[i].aClass104_1360)) {
			aBooleanArray3564[i] = true;
			class131_sub41_sub12.method2009(0);
			continue while_72_;
		    }
		}
	    }
	    if (!arg1) {
		class131_sub41_sub12.method1355((byte) 118);
		anInt3577--;
		if (class131_sub41_sub12.method1918(-29860)) {
		    class131_sub41_sub12.method1919(-29183);
		    Class131_Sub41_Sub12.anInt6320--;
		}
	    }
	}
	if (arg0 != null) {
	    for (int i = 0; i < arg0.length; i++) {
		if (anInt3577 == 8)
		    break;
		if (!aBooleanArray3564[i]) {
		    Class131_Sub41_Sub12 class131_sub41_sub12 = null;
		    if ((Class131_Sub2_Sub28.method1609
			 (arg0[i].anInt1358, (byte) -121).anInt1398) == 1
			&& Class131_Sub41_Sub12.anInt6320 < 32) {
			class131_sub41_sub12
			    = new Class131_Sub41_Sub12(arg0[i], this);
			Class50.aClass181_663.method2534(true,
							 (long) (arg0[i]
								 .anInt1358),
							 class131_sub41_sub12);
			Class131_Sub41_Sub12.anInt6320++;
		    }
		    if (class131_sub41_sub12 == null)
			class131_sub41_sub12
			    = new Class131_Sub41_Sub12(arg0[i], this);
		    aClass119_3572.method1018((byte) -123,
					      class131_sub41_sub12);
		    anInt3577++;
		    aBooleanArray3564[i] = true;
		}
	    }
	}
    }
    
    public void method117() {
	aBoolean3563 = true;
	for (Class131_Sub41_Sub12 class131_sub41_sub12
		 = (Class131_Sub41_Sub12) aClass119_3572.method1007(0);
	     class131_sub41_sub12 != null;
	     class131_sub41_sub12
		 = (Class131_Sub41_Sub12) aClass119_3572.method1014(0)) {
	    if (class131_sub41_sub12.aClass107_6317.anInt1398 == 1)
		class131_sub41_sub12.method1919(-29183);
	}
	aClass1_Sub7_Sub1_Sub1Array3566 = new Class1_Sub7_Sub1_Sub1[8192];
	anInt3565 = 0;
	aClass50_3569 = new Class50();
	anInt3571 = 0;
	aClass119_3572 = new Class119();
	anInt3577 = 0;
	this.method95((byte) 71);
    }
    
    public boolean method118(Class130 arg0, long arg1) {
	if (aLong3568 != aLong3562)
	    method119();
	else
	    method112();
	if (arg1 - aLong3568 > 750L) {
	    method117();
	    return false;
	}
	int i = (int) (arg1 - aLong3562);
	if (aBoolean3575) {
	    for (Class1_Sub3 class1_sub3
		     = (Class1_Sub3) aClass50_3569.method586((byte) 42);
		 class1_sub3 != null;
		 class1_sub3 = (Class1_Sub3) aClass50_3569.method589(25)) {
		for (int i_0_ = 0; i_0_ < class1_sub3.aClass31_3512.anInt393;
		     i_0_++)
		    class1_sub3.method107(arg0, 1, !aBoolean3570, arg1, 65535);
	    }
	    aBoolean3575 = false;
	}
	for (Class1_Sub3 class1_sub3
		 = (Class1_Sub3) aClass50_3569.method586((byte) 42);
	     class1_sub3 != null;
	     class1_sub3 = (Class1_Sub3) aClass50_3569.method589(37))
	    class1_sub3.method107(arg0, i, !aBoolean3570, arg1, 65535);
	aLong3562 = arg1;
	return true;
    }
    
    public void method119() {
	aBoolean3570 = true;
    }
    
    public void method120(Class130 arg0, long arg1, Class41[] arg2,
			  Class104[] arg3, boolean arg4) {
	if (!aBoolean3563) {
	    method111(arg0, arg2, arg4);
	    method116(arg3, arg4);
	    aLong3568 = arg1;
	}
    }
    
    public void method121() {
	aBoolean3575 = true;
    }
    
    public void method122() {
	aClass105_3576.aClass142_1375.method2140(false);
	for (Class1_Sub3 class1_sub3
		 = (Class1_Sub3) aClass50_3569.method586((byte) 42);
	     class1_sub3 != null;
	     class1_sub3 = (Class1_Sub3) aClass50_3569.method589(28))
	    class1_sub3.method105(aLong3562, 721491592);
    }
    
    public void method123(int arg0, int arg1, int arg2, int arg3, int arg4) {
	anInt3573 = arg0;
	anInt3578 = arg1;
	anInt3579 = arg3;
	anInt3574 = arg4;
    }
    
    public Class1_Sub6(int arg0) {
	aBoolean3563 = false;
	aClass50_3569 = new Class50();
	anInt3571 = 0;
	aClass119_3572 = new Class119();
	aBoolean3575 = false;
	anInt3577 = 0;
	aClass105_3576 = new Class105();
	aClass1_Sub7_Sub1_Sub1Array3566 = new Class1_Sub7_Sub1_Sub1[8192];
	Class42.aClass50_574.method584(this, (byte) -126);
	aLong3568 = (long) arg0;
	aLong3562 = (long) arg0;
	aBoolean3575 = true;
    }
}
