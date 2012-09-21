/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class72
{
    public int anInt949;
    public static int anInt950;
    public int anInt951 = -1;
    public int anInt952;
    public int anInt953 = -1;
    public int anInt954;
    public int anInt955;
    public int anInt956;
    public int anInt957;
    public int anInt958;
    public int[] anIntArray959 = null;
    public int anInt960;
    public int anInt961 = 0;
    public int anInt962;
    public int anInt963;
    public int anInt964;
    public int anInt965;
    public int anInt966;
    public int[] anIntArray967;
    public static int anInt968;
    public int anInt969;
    public static int anInt970;
    public int[] anIntArray971;
    public int anInt972;
    public int anInt973;
    public int anInt974;
    public int anInt975;
    public int anInt976;
    public int anInt977;
    public boolean aBoolean978;
    public int[][] anIntArrayArray979;
    public int anInt980;
    public int anInt981;
    public static short[] aShortArray982 = { 960, 957, -21568, -21571, 22464 };
    public int anInt983;
    public static int anInt984;
    public int anInt985;
    public int anInt986;
    public int anInt987;
    public int anInt988;
    public int anInt989;
    public int anInt990;
    public static int anInt991;
    public int anInt992;
    public int anInt993;
    public int anInt994;
    
    public int method747(byte arg0) {
	try {
	    if (arg0 != -24)
		return -60;
	    anInt968++;
	    if ((anInt972 ^ 0xffffffff) != 0)
		return anInt972;
	    if (anIntArray967 != null) {
		int i = (int) ((double) anInt994 * Math.random());
		int i_0_;
		for (i_0_ = 0; i >= anIntArray959[i_0_]; i_0_++)
		    i -= anIntArray959[i_0_];
		return anIntArray967[i_0_];
	    }
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hh.B(" + arg0 + ')');
	}
    }
    
    public void method748(Stream arg0, int arg1, int arg2) {
	if ((arg2 ^ 0xffffffff) != -2) {
	    if ((arg2 ^ 0xffffffff) != -3) {
		if (arg2 != 3) {
		    if ((arg2 ^ 0xffffffff) != -5) {
			if (arg2 == 5)
			    anInt977 = arg0.readUnsignedShort(8104);
			else if ((arg2 ^ 0xffffffff) != -7) {
			    if (arg2 == 7)
				anInt960 = arg0.readUnsignedShort(8104);
			    else if ((arg2 ^ 0xffffffff) == -9)
				anInt985 = arg0.readUnsignedShort(8104);
			    else if (arg2 == 9)
				anInt957 = arg0.readUnsignedShort(8104);
			    else if (arg2 == 26) {
				anInt973
				    = (short) (4 * arg0.readUnsignedByte(arg1
								   ^ 0xffc7));
				anInt975 = (short) (arg0.readUnsignedByte(-15) * 4);
			    } else if ((arg2 ^ 0xffffffff) == -28) {
				if (anIntArrayArray979 == null)
				    anIntArrayArray979 = new int[12][];
				int i = arg0.readUnsignedByte(-83);
				anIntArrayArray979[i] = new int[6];
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -7;
				     i_1_++)
				    anIntArrayArray979[i][i_1_]
					= arg0.readSignedShort(arg1 + 1625620480);
			    } else if ((arg2 ^ 0xffffffff) == -29) {
				anIntArray971 = new int[12];
				for (int i = 0; i < 12; i++) {
				    anIntArray971[i] = arg0.readUnsignedByte(118);
				    if (anIntArray971[i] == 255)
					anIntArray971[i] = -1;
				}
			    } else if (arg2 != 29) {
				if (arg2 != 30) {
				    if ((arg2 ^ 0xffffffff) != -32) {
					if (arg2 != 32) {
					    if ((arg2 ^ 0xffffffff) != -34) {
						if (arg2 != 34) {
						    if (arg2 != 35) {
							if ((arg2 ^ 0xffffffff)
							    != -37) {
							    if ((arg2
								 ^ 0xffffffff)
								!= -38) {
								if (arg2
								    != 38) {
								    if ((arg2
									 ^ 0xffffffff)
									!= -40) {
									if ((arg2
									     ^ 0xffffffff)
									    != -41) {
									    if ((arg2 ^ 0xffffffff) == -42)
										anInt953 = arg0.readUnsignedShort(8104);
									    else if (arg2 != 42) {
										if ((arg2 ^ 0xffffffff) == -44)
										    arg0.readUnsignedShort(8104);
										else if ((arg2 ^ 0xffffffff) != -45) {
										    if ((arg2 ^ 0xffffffff) == -46)
											anInt964 = arg0.readUnsignedShort(arg1 + 73640);
										    else if ((arg2 ^ 0xffffffff) != -47) {
											if (arg2 == 47)
											    anInt966 = arg0.readUnsignedShort(8104);
											else if (arg2 == 48)
											    anInt989 = arg0.readUnsignedShort(8104);
											else if (arg2 != 49) {
											    if ((arg2 ^ 0xffffffff) != -51) {
												if (arg2 != 51) {
												    if (arg2 == 52) {
													int i = arg0.readUnsignedByte(arg1 ^ 0xffb3);
													anIntArray959 = new int[i];
													anIntArray967 = new int[i];
													for (int i_2_ = 0; i_2_ < i; i_2_++) {
													    anIntArray967[i_2_] = arg0.readUnsignedShort(8104);
													    int i_3_ = arg0.readUnsignedByte(-62);
													    anIntArray959[i_2_] = i_3_;
													    anInt994 += i_3_;
													}
												    } else if (arg2 == 53)
													aBoolean978 = false;
												} else
												    anInt962 = arg0.readUnsignedShort(8104);
											    } else
												anInt990 = arg0.readUnsignedShort(8104);
											} else
											    anInt952 = arg0.readUnsignedShort(8104);
										    } else
											anInt983 = arg0.readUnsignedShort(arg1 + 73640);
										} else
										    anInt955 = arg0.readUnsignedShort(arg1 ^ ~0xe057);
									    } else
										anInt981 = arg0.readUnsignedShort(8104);
									} else
									    anInt949 = arg0.readUnsignedShort(8104);
								    } else
									anInt954
									    = arg0.readUnsignedShort(8104);
								} else
								    anInt958
									= (arg0.readUnsignedShort
									   (arg1
									    ^ ~0xe057));
							    } else
								anInt951
								    = (arg0.readUnsignedByte
								       (-20));
							} else
							    anInt965
								= (arg0.readSignedShort
								   (arg1
								    + 1625620480));
						    } else
							anInt969
							    = (arg0.readUnsignedShort
							       (arg1 + 73640));
						} else
						    anInt993
							= arg0.readUnsignedByte(92);
					    } else
						anInt956
						    = (arg0.readSignedShort
						       (arg1 + 1625620480));
					} else
					    anInt961 = arg0.readUnsignedShort(8104);
				    } else
					anInt988 = arg0.readUnsignedByte(-112);
				} else
				    anInt980 = arg0.readUnsignedShort(arg1 + 73640);
			    } else
				anInt992 = arg0.readUnsignedByte(127);
			} else
			    anInt976 = arg0.readUnsignedShort(8104);
		    } else
			anInt986 = arg0.readUnsignedShort(8104);
		} else
		    anInt987 = arg0.readUnsignedShort(8104);
	    } else
		anInt974 = arg0.readUnsignedShort(8104);
	} else {
	    anInt972 = arg0.readUnsignedShort(8104);
	    anInt963 = arg0.readUnsignedShort(8104);
	    if ((anInt972 ^ 0xffffffff) == -65536)
		anInt972 = -1;
	    if ((anInt963 ^ 0xffffffff) == -65536)
		anInt963 = -1;
	}
	anInt950++;
	if (arg1 != -65536)
	    method749((byte) 113);
    }
    
    public static void method749(byte arg0) {
	aShortArray982 = null;
	if (arg0 <= 99)
	    aShortArray982 = null;
    }
    
    public boolean method750(int arg0, int arg1) {
	try {
	    anInt970++;
	    if (arg0 == -1)
		return false;
	    if ((anInt972 ^ 0xffffffff) == (arg0 ^ 0xffffffff))
		return true;
	    if (anIntArray967 != null) {
		for (int i = 0;
		     (anIntArray967.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++) {
		    if ((anIntArray967[i] ^ 0xffffffff) == (arg0 ^ 0xffffffff))
			return true;
		}
	    }
	    if (arg1 != -28)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hh.C(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method751(int arg0) {
	try {
	    if (arg0 == 0)
		anInt984++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hh.A(" + arg0 + ')');
	}
    }
    
    public void method752(int arg0, Stream arg1) {
	for (;;) {
	    int i = arg1.readUnsignedByte(-48);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method748(arg1, -65536, i);
	}
	anInt991++;
	if (arg0 < 123)
	    anInt954 = -54;
    }
    
    public Class72() {
	anInt957 = -1;
	anInt954 = -1;
	anInt960 = -1;
	anInt958 = -1;
	anInt965 = 0;
	anInt973 = 0;
	anInt949 = -1;
	anInt956 = 0;
	anInt972 = -1;
	anIntArray967 = null;
	anInt952 = -1;
	anInt983 = -1;
	anInt985 = -1;
	anInt962 = -1;
	anInt966 = -1;
	anInt977 = -1;
	anInt975 = 0;
	anInt976 = -1;
	anInt988 = 0;
	anInt981 = -1;
	anInt987 = -1;
	anInt980 = 0;
	anInt964 = -1;
	anInt963 = -1;
	anInt986 = -1;
	aBoolean978 = true;
	anInt992 = 0;
	anInt955 = -1;
	anInt989 = -1;
	anInt974 = -1;
	anInt969 = 0;
	anInt994 = 0;
	anInt990 = -1;
	anInt993 = 0;
    }
}
