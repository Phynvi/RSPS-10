/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class183
{
    public static boolean aBoolean2610 = true;
    public static int anInt2611;
    public static boolean aBoolean2612;
    public static boolean aBoolean2613;
    public static int anInt2614;
    public static int[] anIntArray2615 = new int[4096];
    public static Class163 aClass163_2616;
    public static Class33 aClass33_2617;
    public static int anInt2618;
    public static int anInt2619;
    
    public static void method2538(int arg0) {
	try {
	    aClass163_2616 = null;
	    aClass33_2617 = null;
	    if (arg0 != 18391)
		aBoolean2612 = true;
	    anIntArray2615 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sn.J(" + arg0 + ')');
	}
    }
    
    public static void method2539(int arg0) {
	try {
	    anInt2614++;
	    if (arg0 != 25422)
		method2540(-61);
	    Class23_Sub2_Sub1.aClass214_4976.method2775((byte) 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sn.H(" + arg0 + ')');
	}
    }
    
    public static void method2540(int arg0) {
	anInt2619++;
	for (Class131_Sub41_Sub2 class131_sub41_sub2
		 = (Class131_Sub41_Sub2) Class53.aClass119_703.method1007(0);
	     class131_sub41_sub2 != null;
	     class131_sub41_sub2
		 = (Class131_Sub41_Sub2) Class53.aClass119_703.method1014(0)) {
	    Class23_Sub4_Sub2 class23_sub4_sub2
		= class131_sub41_sub2.aClass23_Sub4_Sub2_6187;
	    if (Class29.anInt300 == class23_sub4_sub2.aByte3740
		&& ((Class125.anInt1632 ^ 0xffffffff)
		    >= (class23_sub4_sub2.anInt5357 ^ 0xffffffff))) {
		if ((class23_sub4_sub2.anInt5354 ^ 0xffffffff)
		    >= (Class125.anInt1632 ^ 0xffffffff)) {
		    if ((class23_sub4_sub2.anInt5336 ^ 0xffffffff) < -1) {
			Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			    = (Class23_Sub4_Sub2
			       .aClass23_Sub4_Sub1_Sub1Array5379
			       [class23_sub4_sub2.anInt5336 - 1]);
			if (class23_sub4_sub1_sub1 != null
			    && class23_sub4_sub1_sub1.anInt3733 >= 0
			    && ((Class131_Sub41_Sub11_Sub1.anInt6546 * 128
				 ^ 0xffffffff)
				< (class23_sub4_sub1_sub1.anInt3733
				   ^ 0xffffffff))
			    && ((class23_sub4_sub1_sub1.anInt3747 ^ 0xffffffff)
				<= -1)
			    && (class23_sub4_sub1_sub1.anInt3747
				< 128 * Class131_Sub2_Sub26.anInt5931))
			    class23_sub4_sub2.method373
				(Class125.anInt1632, 7403,
				 ((RuntimeException_Sub1.method2833
				   (class23_sub4_sub1_sub1.anInt3747, -117,
				    class23_sub4_sub1_sub1.anInt3733,
				    class23_sub4_sub2.aByte3740))
				  - class23_sub4_sub2.anInt5368),
				 class23_sub4_sub1_sub1.anInt3733,
				 class23_sub4_sub1_sub1.anInt3747);
		    }
		    if (class23_sub4_sub2.anInt5336 < 0) {
			int i = -class23_sub4_sub2.anInt5336 + -1;
			Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2;
			if (i != Class110.anInt1433)
			    class23_sub4_sub1_sub2
				= Class105.aClass23_Sub4_Sub1_Sub2Array1373[i];
			else
			    class23_sub4_sub1_sub2
				= Class166.aClass23_Sub4_Sub1_Sub2_2216;
			if (class23_sub4_sub1_sub2 != null
			    && ((class23_sub4_sub1_sub2.anInt3733 ^ 0xffffffff)
				<= -1)
			    && (128 * Class131_Sub41_Sub11_Sub1.anInt6546
				> class23_sub4_sub1_sub2.anInt3733)
			    && class23_sub4_sub1_sub2.anInt3747 >= 0
			    && (Class131_Sub2_Sub26.anInt5931 * 128
				> class23_sub4_sub1_sub2.anInt3747))
			    class23_sub4_sub2.method373
				(Class125.anInt1632, 7403,
				 ((RuntimeException_Sub1.method2833
				   (class23_sub4_sub1_sub2.anInt3747,
				    arg0 + 5740,
				    class23_sub4_sub1_sub2.anInt3733,
				    class23_sub4_sub2.aByte3740))
				  - class23_sub4_sub2.anInt5368),
				 class23_sub4_sub1_sub2.anInt3733,
				 class23_sub4_sub1_sub2.anInt3747);
		    }
		    class23_sub4_sub2.method371(-1, Class42.anInt563);
		    Class131_Sub23.method1823(class23_sub4_sub2, true);
		}
	    } else {
		class131_sub41_sub2.method1355((byte) 115);
		class23_sub4_sub2.method370(false);
	    }
	}
	if (arg0 != -5815)
	    anInt2618 = -19;
    }
    
    static {
	aBoolean2613 = true;
	anInt2618 = 0;
	aBoolean2612 = false;
    }
}
