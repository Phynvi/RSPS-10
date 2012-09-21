/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class18
{
    public static Class50 aClass50_188;
    public static int anInt189 = 0;
    public static int anInt190;
    public static int anInt191;
    public static int anInt192;
    public static Class173 aClass173_193;
    public static String[] aStringArray194 = new String[100];
    public static int anInt195;
    
    public static void method230(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	try {
	    anInt192++;
	    if ((arg4 ^ 0xffffffff) > -129 || (arg3 ^ 0xffffffff) > -129
		|| ((arg4 ^ 0xffffffff)
		    < (-256 + 128 * Class131_Sub41_Sub11_Sub1.anInt6546
		       ^ 0xffffffff))
		|| ((arg3 ^ 0xffffffff)
		    < ((Class131_Sub2_Sub26.anInt5931 - 2) * 128
		       ^ 0xffffffff)))
		Class131_Sub2_Sub6.anIntArray5629[0]
		    = Class131_Sub2_Sub6.anIntArray5629[1] = -1;
	    else if (arg1 == 31496) {
		int i = (-arg7
			 + RuntimeException_Sub1.method2833(arg3, 115, arg4,
							    Class29.anInt300));
		PacketParser.aClass9_5876.method174(arg6, 0, 0);
		Class183_Sub1.aClass130_4960
		    .method1260(PacketParser.aClass9_5876);
		Class183_Sub1.aClass130_4960.method1240(arg4, i, arg3,
							(Class131_Sub2_Sub6
							 .anIntArray5629));
		PacketParser.aClass9_5876.method174(-arg6, 0, 0);
		Class183_Sub1.aClass130_4960
		    .method1260(PacketParser.aClass9_5876);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bg.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ')'));
	}
    }
    
    public static Class131_Sub41_Sub15 method231(byte[] arg0, int arg1) {
	try {
	    anInt191++;
	    Class131_Sub41_Sub15 class131_sub41_sub15
		= new Class131_Sub41_Sub15();
	    Stream stream = new Stream(arg0);
	    stream.offset
		= stream.data.length + -2;
	    int i = stream.readUnsignedShort(8104);
	    int i_0_ = -12 + stream.data.length + arg1 + -i;
	    stream.offset = i_0_;
	    int i_1_ = stream.readUnsignedInt(-2);
	    class131_sub41_sub15.anInt6361 = stream.readUnsignedShort(8104);
	    class131_sub41_sub15.anInt6362 = stream.readUnsignedShort(8104);
	    class131_sub41_sub15.anInt6366
		= stream.readUnsignedShort(arg1 ^ ~0x1fa9);
	    class131_sub41_sub15.anInt6359 = stream.readUnsignedShort(8104);
	    int i_2_ = stream.readUnsignedByte(87);
	    if (i_2_ > 0) {
		class131_sub41_sub15.aClass180Array6353 = new Class180[i_2_];
		for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff);
		     i_3_++) {
		    int i_4_ = stream.readUnsignedShort(8104);
		    Class180 class180
			= new Class180(Class101.method887(1388313616, i_4_));
		    class131_sub41_sub15.aClass180Array6353[i_3_] = class180;
		    while ((i_4_-- ^ 0xffffffff) < -1) {
			int i_5_ = stream.readUnsignedInt(arg1);
			int i_6_ = stream.readUnsignedInt(-2);
			class180.method2523(false, (long) i_5_,
					    new Class131_Sub24(i_6_));
		    }
		}
	    }
	    stream.offset = 0;
	    class131_sub41_sub15.aString6352
		= stream.method1779(-22016);
	    class131_sub41_sub15.anIntArray6356 = new int[i_1_];
	    class131_sub41_sub15.anIntArray6369 = new int[i_1_];
	    class131_sub41_sub15.aStringArray6358 = new String[i_1_];
	    int i_7_ = 0;
	    while ((stream.offset ^ 0xffffffff)
		   > (i_0_ ^ 0xffffffff)) {
		int i_8_ = stream.readUnsignedShort(8104);
		if ((i_8_ ^ 0xffffffff) != -4) {
		    if ((i_8_ ^ 0xffffffff) > -101 && i_8_ != 21 && i_8_ != 38
			&& i_8_ != 39)
			class131_sub41_sub15.anIntArray6356[i_7_]
			    = stream.readUnsignedInt(-2);
		    else
			class131_sub41_sub15.anIntArray6356[i_7_]
			    = (stream.readUnsignedByte
			       (Class23_Sub4_Sub5.method390(arg1, 76)));
		} else
		    class131_sub41_sub15.aStringArray6358[i_7_]
			= stream.readString(false).intern();
		class131_sub41_sub15.anIntArray6369[i_7_++] = i_8_;
	    }
	    return class131_sub41_sub15;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("bg.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method232(int arg0, boolean arg1, int arg2, int arg3,
				 int arg4) {
	anInt195++;
	if (arg0 + -arg2 < Class149.anInt1988
	    || (Class115.anInt1477 ^ 0xffffffff) > (arg0 + arg2 ^ 0xffffffff)
	    || (-arg2 + arg3 ^ 0xffffffff) > (Class116.anInt1494 ^ 0xffffffff)
	    || arg2 + arg3 > Class125.anInt1629)
	    Class121_Sub1.method1044(arg2, -1, arg4, arg0, arg3);
	else
	    Class22_Sub1.method283(arg0, arg3, -26, arg4, arg2);
	if (arg1 != false)
	    method232(-3, false, 19, -57, 99);
    }
    
    public static void method233(byte arg0) {
	aStringArray194 = null;
	aClass173_193 = null;
	aClass50_188 = null;
	if (arg0 != -128)
	    method233((byte) 71);
    }
    
    static {
	aClass50_188 = new Class50();
    }
}
