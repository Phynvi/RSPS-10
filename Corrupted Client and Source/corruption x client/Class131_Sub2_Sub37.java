/* Class131_Sub2_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub37 extends Class131_Sub2
{
    public int anInt6055 = 0;
    public static int anInt6056;
    public static Class68[] aClass68Array6057;
    public static int[] anIntArray6058;
    public static int anInt6059;
    public static int anInt6060;
    public static int anInt6061;
    public static int anInt6062;
    public static int anInt6063;
    public int anInt6064 = 4096;
    /*synthetic*/ public static Class aClass6065;
    
    public static void method1636(int arg0) {
	Class219.aClass214_3204.method2775((byte) 56);
	anInt6059++;
	Class17.aClass214_182.method2775((byte) 56);
	if (arg0 != 0)
	    anIntArray6058 = null;
    }
    
    public static void method1637(int arg0, int arg1, int arg2, int arg3) {
	try {
	    if (arg1 == -9328) {
		if (arg2 == 1007)
		    Class168.method2432(10, arg3, arg0);
		else if ((arg2 ^ 0xffffffff) != -1003) {
		    if (arg2 != 1010) {
			if ((arg2 ^ 0xffffffff) == -1004)
			    Class168.method2432(13, arg3, arg0);
			else if ((arg2 ^ 0xffffffff) == -1005)
			    Class168.method2432(14, arg3, arg0);
		    } else
			Class168.method2432(12, arg3, arg0);
		} else
		    Class168.method2432(11, arg3, arg0);
		anInt6062++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vo.G(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub37() {
	super(1, true);
    }
    
    public static void method1638(int arg0) {
	try {
	    anIntArray6058 = null;
	    if (arg0 != -30260)
		aClass68Array6057 = null;
	    aClass68Array6057 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"vo.D(" + arg0 + ')');
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt6056++;
	    if (arg0 != -11543)
		return null;
	    int[] is = aClass200_4087.method2714(arg1, (byte) 77);
	    if (aClass200_4087.aBoolean2927) {
		int[] is_0_ = this.method1459(0, (byte) -40, arg1);
		for (int i = 0;
		     ((i ^ 0xffffffff)
		      > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
		     i++) {
		    int i_1_ = is_0_[i];
		    is[i] = (i_1_ >= anInt6055 && ((i_1_ ^ 0xffffffff)
						   >= (anInt6064 ^ 0xffffffff))
			     ? 4096 : 0);
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vo.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static boolean method1639(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt6060++;
	    boolean bool = true;
	    Interface6 interface6
		= (Interface6) Class43.method521(arg1, arg3, arg2);
	    if (arg0 != -1003)
		method1639(-21, -24, 123, 119);
	    if (interface6 != null)
		bool &= Class1_Sub7_Sub1.method134(interface6, false);
	    interface6 = ((Interface6)
			  Class63.method662(arg1, arg3, arg2,
					    (aClass6065 != null ? aClass6065
					     : (aClass6065
						= method1640("Interface6")))));
	    if (interface6 != null)
		bool &= Class1_Sub7_Sub1.method134(interface6, false);
	    interface6 = (Interface6) Class186.method2564(arg1, arg3, arg2);
	    if (interface6 != null)
		bool &= Class1_Sub7_Sub1.method134(interface6, false);
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("vo.F(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt6061++;
	if (arg1 == -49) {
	    int i = arg0;
	    do {
		if (i != 0) {
		    if ((i ^ 0xffffffff) != -2)
			break;
		} else {
		    anInt6055 = arg2.readUnsignedShort(8104);
		    break;
		}
		anInt6064 = arg2.readUnsignedShort(arg1 ^ ~0x1f98);
	    } while (false);
	}
    }
    
    /*synthetic*/ public static Class method1640(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
