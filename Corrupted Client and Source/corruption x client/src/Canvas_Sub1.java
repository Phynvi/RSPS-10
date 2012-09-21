/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public class Canvas_Sub1 extends Canvas
{
    public static boolean aBoolean42 = false;
    public Component aComponent43;
    public static int anInt44;
    public static int anInt45;
    public static Class184[] aClass184Array46;
    public static int anInt47;
    
    public void update(Graphics arg0) {
	try {
	    aComponent43.update(arg0);
	    anInt44++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ik.update("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method75(byte arg0) {
	try {
	    if (arg0 != 38)
		aBoolean42 = false;
	    aClass184Array46 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ik.A(" + arg0 + ')');
	}
    }
    
    public void paint(Graphics arg0) {
	try {
	    aComponent43.paint(arg0);
	    anInt47++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ik.paint("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static boolean method76(boolean arg0) {
	for (int i = Class51.anInt675; i < Class133.anInt1805; i++) {
	    Class147[][] class147s
		= Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[i];
	    for (int i_0_ = -Class131_Sub2_Sub32.anInt6011; i_0_ <= 0;
		 i_0_++) {
		int i_1_ = Class210.anInt3063 + i_0_;
		int i_2_ = Class210.anInt3063 - i_0_;
		if (i_1_ >= Class52.anInt695
		    || i_2_ < Class120_Sub2.anInt3976) {
		    for (int i_3_ = -Class131_Sub2_Sub32.anInt6011; i_3_ <= 0;
			 i_3_++) {
			int i_4_ = Class47.anInt643 + i_3_;
			int i_5_ = Class47.anInt643 - i_3_;
			if (i_1_ >= Class52.anInt695) {
			    if (i_4_ >= Class23_Sub1.anInt3702) {
				Class147 class147 = class147s[i_1_][i_4_];
				if (class147 != null
				    && class147.aBoolean1954) {
				    Class131_Sub2_Sub19.aBoolean5827 = arg0;
				    Class153_Sub1.aClass120_4757
					.method1026((byte) 121, class147);
				    Class153_Sub1.aClass120_4757
					.method1028(-42);
				}
			    }
			    if (i_5_ < Stream.anInt4350) {
				Class147 class147 = class147s[i_1_][i_5_];
				if (class147 != null
				    && class147.aBoolean1954) {
				    Class131_Sub2_Sub19.aBoolean5827 = arg0;
				    Class153_Sub1.aClass120_4757
					.method1026((byte) 121, class147);
				    Class153_Sub1.aClass120_4757
					.method1028(-85);
				}
			    }
			}
			if (i_2_ < Class120_Sub2.anInt3976) {
			    if (i_4_ >= Class23_Sub1.anInt3702) {
				Class147 class147 = class147s[i_2_][i_4_];
				if (class147 != null
				    && class147.aBoolean1954) {
				    Class131_Sub2_Sub19.aBoolean5827 = arg0;
				    Class153_Sub1.aClass120_4757
					.method1026((byte) 121, class147);
				    Class153_Sub1.aClass120_4757
					.method1028(114);
				}
			    }
			    if (i_5_ < Stream.anInt4350) {
				Class147 class147 = class147s[i_2_][i_5_];
				if (class147 != null
				    && class147.aBoolean1954) {
				    Class131_Sub2_Sub19.aBoolean5827 = arg0;
				    Class153_Sub1.aClass120_4757
					.method1026((byte) 121, class147);
				    Class153_Sub1.aClass120_4757
					.method1028(124);
				}
			    }
			}
			if (Class100.anInt1321 == 0) {
			    if (Class23_Sub2.aBoolean3709)
				Class153_Sub1.aClass120_4757
				    .method1021(24, (byte) -127);
			    return true;
			}
		    }
		}
	    }
	}
	return false;
    }
    
    public Canvas_Sub1(Component arg0) {
	try {
	    aComponent43 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ik.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method77(int arg0) {
	try {
	    Class131_Sub41_Sub11.aClass214_6299.method2783(-95);
	    anInt45++;
	    int i = -94 / ((arg0 - 37) / 42);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ik.B(" + arg0 + ')');
	}
    }
}
