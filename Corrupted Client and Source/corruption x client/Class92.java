/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class92
{
    public int[] anIntArray1188;
    public static int anInt1189;
    public static int anInt1190;
    public static int regionX;
    public int[] anIntArray1192;
    public int[][] anIntArrayArray1193;
    public static int anInt1194;
    public static int anInt1195;
    public String aString1196;
    public static int anInt1197;
    public int[] anIntArray1198;
    public int[] anIntArray1199;
    public int[] anIntArray1200;
    public String[] aStringArray1201;
    public int anInt1202 = -1;
    public static int[] anIntArray1203 = new int[13];
    public Class180 aClass180_1204;
    public int[] anIntArray1205;
    public int[] anIntArray1206;
    public String aString1207;
    public static int anInt1208;
    public static int anInt1209;
    public int[][] anIntArrayArray1210;
    public String[] aStringArray1211;
    public int[][] anIntArrayArray1212;
    public int[] anIntArray1213;
    
    public void method846(boolean arg0) {
	anInt1194++;
	if (arg0 != true)
	    anIntArray1205 = null;
	if (aString1196 == null)
	    aString1196 = aString1207;
    }
    
    public static void method847(byte arg0) {
	try {
	    if (arg0 >= -12)
		anIntArray1203 = null;
	    anIntArray1203 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jq.A(" + arg0 + ')');
	}
    }
    
    public void method848(byte arg0, int arg1, Stream arg2) {
	try {
	    anInt1208++;
	    if (arg0 <= 65)
		aString1196 = null;
	    if (arg1 == 1)
		aString1207 = arg2.method1721(5);
	    else if ((arg1 ^ 0xffffffff) == -3)
		aString1196 = arg2.method1721(5);
	    else if ((arg1 ^ 0xffffffff) == -4) {
		int i = arg2.readUnsignedByte(86);
		anIntArrayArray1193 = new int[i][3];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
		    anIntArrayArray1193[i_0_][0] = arg2.readUnsignedShort(8104);
		    anIntArrayArray1193[i_0_][1] = arg2.readUnsignedInt(-2);
		    anIntArrayArray1193[i_0_][2] = arg2.readUnsignedInt(-2);
		}
	    } else if (arg1 != 4) {
		if ((arg1 ^ 0xffffffff) != -6) {
		    if ((arg1 ^ 0xffffffff) == -7)
			arg2.readUnsignedByte(-37);
		    else if (arg1 == 7)
			arg2.readUnsignedByte(-51);
		    else if (arg1 != 8) {
			if (arg1 != 9) {
			    if (arg1 == 10) {
				int i = arg2.readUnsignedByte(-33);
				anIntArray1200 = new int[i];
				for (int i_1_ = 0; i > i_1_; i_1_++)
				    anIntArray1200[i_1_] = arg2.readUnsignedInt(-2);
			    } else if (arg1 != 12) {
				if (arg1 != 13) {
				    if ((arg1 ^ 0xffffffff) == -15) {
					int i = arg2.readUnsignedByte(-60);
					anIntArrayArray1210 = new int[i][2];
					for (int i_2_ = 0;
					     ((i_2_ ^ 0xffffffff)
					      > (i ^ 0xffffffff));
					     i_2_++) {
					    anIntArrayArray1210[i_2_][0]
						= arg2.readUnsignedByte(-24);
					    anIntArrayArray1210[i_2_][1]
						= arg2.readUnsignedByte(-13);
					}
				    } else if ((arg1 ^ 0xffffffff) != -16) {
					if (arg1 == 17)
					    anInt1202 = arg2.readUnsignedShort(8104);
					else if (arg1 == 18) {
					    int i = arg2.readUnsignedByte(-60);
					    anIntArray1199 = new int[i];
					    anIntArray1205 = new int[i];
					    anIntArray1198 = new int[i];
					    aStringArray1211 = new String[i];
					    for (int i_3_ = 0; i_3_ < i;
						 i_3_++) {
						anIntArray1199[i_3_]
						    = arg2.readUnsignedInt(-2);
						anIntArray1198[i_3_]
						    = arg2.readUnsignedInt(-2);
						anIntArray1205[i_3_]
						    = arg2.readUnsignedInt(-2);
						aStringArray1211[i_3_]
						    = arg2.readString(false);
					    }
					} else if (arg1 != 19) {
					    if ((arg1 ^ 0xffffffff) == -250) {
						int i = arg2.readUnsignedByte(-38);
						if (aClass180_1204 == null) {
						    int i_4_
							= (Class101.method887
							   (1388313616, i));
						    aClass180_1204
							= new Class180(i_4_);
						}
						for (int i_5_ = 0;
						     ((i ^ 0xffffffff)
						      < (i_5_ ^ 0xffffffff));
						     i_5_++) {
						    boolean bool
							= (arg2.readUnsignedByte(-15)
							   == 1);
						    int i_6_ = (arg2.read3Bytes
								(false));
						    Class131 class131;
						    if (!bool)
							class131
							    = (new Class131_Sub24
							       (arg2.readUnsignedInt
								(-2)));
						    else
							class131
							    = (new Class131_Sub29
							       (arg2.readString
								(false)));
						    aClass180_1204.method2523
							(false, (long) i_6_,
							 class131);
						}
					    }
					} else {
					    int i = arg2.readUnsignedByte(104);
					    aStringArray1201 = new String[i];
					    anIntArray1188 = new int[i];
					    anIntArray1213 = new int[i];
					    anIntArray1192 = new int[i];
					    for (int i_7_ = 0;
						 ((i ^ 0xffffffff)
						  < (i_7_ ^ 0xffffffff));
						 i_7_++) {
						anIntArray1213[i_7_]
						    = arg2.readUnsignedInt(-2);
						anIntArray1188[i_7_]
						    = arg2.readUnsignedInt(-2);
						anIntArray1192[i_7_]
						    = arg2.readUnsignedInt(-2);
						aStringArray1201[i_7_]
						    = arg2.readString(false);
					    }
					}
				    } else
					arg2.readUnsignedShort(8104);
				} else {
				    int i = arg2.readUnsignedByte(-111);
				    anIntArray1206 = new int[i];
				    for (int i_8_ = 0; i > i_8_; i_8_++)
					anIntArray1206[i_8_]
					    = arg2.readUnsignedShort(8104);
				}
			    } else
				arg2.readUnsignedInt(-2);
			} else
			    arg2.readUnsignedByte(116);
		    }
		} else
		    arg2.readUnsignedShort(8104);
	    } else {
		int i = arg2.readUnsignedByte(122);
		anIntArrayArray1212 = new int[i][3];
		for (int i_9_ = 0; (i ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
		     i_9_++) {
		    anIntArrayArray1212[i_9_][0] = arg2.readUnsignedShort(8104);
		    anIntArrayArray1212[i_9_][1] = arg2.readUnsignedInt(-2);
		    anIntArrayArray1212[i_9_][2] = arg2.readUnsignedInt(-2);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("jq.B(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method849(Stream arg0, int arg1) {
	for (;;) {
	    int i = arg0.readUnsignedByte(108);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method848((byte) 121, i, arg0);
	}
	anInt1189++;
	if (arg1 > -118)
	    aStringArray1201 = null;
    }
    
    public static void method850(int arg0, int arg1, int arg2, byte arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	anInt1197++;
	if (!Class126.method1108((byte) -92, arg1)) {
	    if (arg2 == -1) {
		for (int i = 0; i < 100; i++)
		    Class131_Sub41_Sub16.aBooleanArray6371[i] = true;
	    } else
		Class131_Sub41_Sub16.aBooleanArray6371[arg2] = true;
	} else {
	    Class186.method2560(arg6, arg4, arg0, arg2, arg8,
				(Class131_Sub2_Sub9.aClass173ArrayArray5684
				 [arg1]),
				arg5, 108, -1, arg7);
	    if (arg3 != -35)
		regionX = 19;
	}
    }
    
    public static void method851(int arg0) {
	try {
	    for (int i = 0;
		 ((i ^ 0xffffffff)
		  > (Class131_Sub41_Sub12.aClass150ArrayArray6309.length
		     ^ 0xffffffff));
		 i++) {
		for (int i_10_ = 0;
		     ((Class131_Sub41_Sub12.aClass150ArrayArray6309[i].length
		       ^ 0xffffffff)
		      < (i_10_ ^ 0xffffffff));
		     i_10_++)
		    Class131_Sub41_Sub12.aClass150ArrayArray6309[i][i_10_]
			= Class201.aClass150_2934;
	    }
	    if (arg0 != 7716)
		method851(-40);
	    anInt1209++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"jq.D(" + arg0 + ')');
	}
    }
}
