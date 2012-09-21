/* Class131_Sub2_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub2_Sub39 extends Class131_Sub2
{
    public static short[][] aShortArrayArray6076
	= { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437,
	      2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580,
	      784, 21966, 28950, -15697, -14002 },
	    { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145,
	      -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673,
	      -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 },
	    new short[0], new short[0], new short[0] };
    public static int anInt6077;
    public int anInt6078 = 4096;
    public static int anInt6079 = 0;
    public static boolean[] aBooleanArray6080;
    public static int[] anIntArray6081
	= { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
    public int anInt6082 = 4096;
    public static Class140 aClass140_6083;
    public static client aClient6084;
    public static int anInt6085;
    public int anInt6086 = 4096;
    public static int anInt6087;
    
    public int[][] method1462(int arg0, int arg1) {
	try {
	    anInt6085++;
	    if (arg1 != 0)
		method1646(-37);
	    int[][] is = aClass59_4097.method641(arg0, -2);
	    if (aClass59_4097.aBoolean783) {
		int[][] is_0_ = this.method1463(0, (byte) 116, arg0);
		int[] is_1_ = is_0_[0];
		int[] is_2_ = is_0_[1];
		int[] is_3_ = is_0_[2];
		int[] is_4_ = is[0];
		int[] is_5_ = is[1];
		int[] is_6_ = is[2];
		for (int i = 0; Class131_Sub2_Sub7.anInt5637 > i; i++) {
		    int i_7_ = is_1_[i];
		    int i_8_ = is_3_[i];
		    int i_9_ = is_2_[i];
		    if ((i_8_ ^ 0xffffffff) != (i_7_ ^ 0xffffffff)
			|| (i_8_ ^ 0xffffffff) != (i_9_ ^ 0xffffffff)) {
			is_4_[i] = anInt6078;
			is_5_[i] = anInt6086;
			is_6_[i] = anInt6082;
		    } else {
			is_4_[i] = anInt6078 * i_7_ >> 434413420;
			is_5_[i] = i_8_ * anInt6086 >> -1537167028;
			is_6_[i] = i_9_ * anInt6082 >> 2117020428;
		    }
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wf.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public Class131_Sub2_Sub39() {
	super(1, false);
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	try {
	    if (arg1 != -49)
		method1455(-27, (byte) -91, null);
	    int i = arg0;
	while_117_:
	    do {
		do {
		    if (i != 0) {
			if ((i ^ 0xffffffff) != -2) {
			    if ((i ^ 0xffffffff) == -3)
				break;
			    break while_117_;
			}
		    } else {
			anInt6078 = arg2.readUnsignedShort(8104);
			break while_117_;
		    }
		    anInt6086 = arg2.readUnsignedShort(arg1 ^ ~0x1f98);
		    break while_117_;
		} while (false);
		anInt6082 = arg2.readUnsignedShort(8104);
	    } while (false);
	    anInt6087++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("wf.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1646(int arg0) {
	try {
	    aClass140_6083 = null;
	    aBooleanArray6080 = null;
	    aShortArrayArray6076 = null;
	    aClient6084 = null;
	    if (arg0 != 28835)
		aClass140_6083 = null;
	    anIntArray6081 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"wf.B(" + arg0 + ')');
	}
    }
    
    static {
	aBooleanArray6080 = new boolean[112];
    }
}
