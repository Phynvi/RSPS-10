/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class77
{
    public static Class158 aClass158_1040;
    public static int anInt1041;
    public static int anInt1042;
    public static int[] anIntArray1043;
    public static Class173 aClass173_1044 = null;
    public static int anInt1045;
    public static boolean aBoolean1046;
    public static Class158 aClass158_1047;
    public static int anInt1048;
    
    public static Class23_Sub3 method773(int arg0, int arg1, int arg2) {
	Class147 class147 = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			     [arg0][arg1][arg2]);
	if (class147 == null)
	    return null;
	Class23_Sub3 class23_sub3 = class147.aClass23_Sub3_1970;
	class147.aClass23_Sub3_1970 = null;
	return class23_sub3;
    }
    
    public static Class215 method774(Component arg0, SignLink arg1, int arg2,
				     byte arg3, int arg4) {
	try {
	    anInt1041++;
	    if (Class131_Sub2_Sub14.anInt5754 == 0)
		throw new IllegalStateException();
	    if ((arg4 ^ 0xffffffff) > -1 || (arg4 ^ 0xffffffff) <= -3)
		throw new IllegalArgumentException();
	    if ((arg2 ^ 0xffffffff) > -257)
		arg2 = 256;
	    try {
		Class215 class215
		    = (Class215) Class.forName("Class215_Sub2").newInstance();
		class215.anInt3174 = arg2;
		class215.anIntArray3169
		    = new int[((!Class131_Sub2_Sub10_Sub1.aBoolean6534 ? 1 : 2)
			       * 256)];
		class215.method2796(arg0);
		class215.anInt3181 = 1024 + (arg2 & ~0x3ff);
		if (class215.anInt3181 > 16384)
		    class215.anInt3181 = 16384;
		class215.method2797(class215.anInt3181);
		if ((Class98.anInt1303 ^ 0xffffffff) < -1
		    && Class210.aClass115_3069 == null) {
		    Class210.aClass115_3069 = new Class115();
		    Class210.aClass115_3069.aSignLink_1483 = arg1;
		    arg1.method2692((byte) 107, Class210.aClass115_3069,
				    Class98.anInt1303);
		}
		if (Class210.aClass115_3069 != null) {
		    if (Class210.aClass115_3069.aClass215Array1478[arg4]
			!= null)
			throw new IllegalArgumentException();
		    Class210.aClass115_3069.aClass215Array1478[arg4]
			= class215;
		}
		return class215;
	    } catch (Throwable throwable) {
		try {
		    Class215_Sub1 class215_sub1
			= new Class215_Sub1(arg1, arg4);
		    class215_sub1.anInt3174 = arg2;
		    class215_sub1.anIntArray3169
			= new int[256 * (!Class131_Sub2_Sub10_Sub1.aBoolean6534
					 ? 1 : 2)];
		    class215_sub1.method2796(arg0);
		    class215_sub1.anInt3181 = 16384;
		    class215_sub1.method2797(class215_sub1.anInt3181);
		    if (Class98.anInt1303 > 0
			&& Class210.aClass115_3069 == null) {
			Class210.aClass115_3069 = new Class115();
			Class210.aClass115_3069.aSignLink_1483 = arg1;
			arg1.method2692((byte) 107, Class210.aClass115_3069,
					Class98.anInt1303);
		    }
		    if (arg3 != 91)
			aBoolean1046 = true;
		    if (Class210.aClass115_3069 != null) {
			if (Class210.aClass115_3069.aClass215Array1478[arg4]
			    != null)
			    throw new IllegalArgumentException();
			Class210.aClass115_3069.aClass215Array1478[arg4]
			    = class215_sub1;
		    }
		    return class215_sub1;
		} catch (Throwable throwable_0_) {
		    return new Class215();
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hr.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method775(int arg0, boolean arg1, int arg2, int arg3,
				 Class23_Sub4_Sub1 arg4, int arg5, int arg6) {
	try {
	    anInt1042++;
	    if (arg1 != false)
		aBoolean1046 = false;
	    Class18.method230(arg6, 31496, arg2, arg4.anInt3747,
			      arg4.anInt3733, arg0, 0, arg5, arg3);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hr.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ','
						 + (arg4 != null ? "{...}"
						    : "null")
						 + ',' + arg5 + ',' + arg6
						 + ')'));
	}
    }
    
    public static void method776(byte arg0) {
	try {
	    aClass173_1044 = null;
	    if (arg0 >= -111)
		aClass173_1044 = null;
	    aClass158_1047 = null;
	    aClass158_1040 = null;
	    anIntArray1043 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hr.D(" + arg0 + ')');
	}
    }
    
    public static void method777(boolean arg0, Class131_Sub1 arg1) {
	try {
	    arg1.aBoolean4073 = arg0;
	    anInt1048++;
	    if (arg1.aClass131_Sub12_4075 != null)
		arg1.aClass131_Sub12_4075.anInt4256 = 0;
	    for (Class131_Sub1 class131_sub1 = arg1.method1359();
		 class131_sub1 != null; class131_sub1 = arg1.method1357())
		method777(false, class131_sub1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hr.E(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	anIntArray1043 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1,
				     4096, 6144, 2048 };
	anInt1045 = 0;
    }
}
