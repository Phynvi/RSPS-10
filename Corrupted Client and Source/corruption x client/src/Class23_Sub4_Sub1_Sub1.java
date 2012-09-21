/* Class23_Sub4_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23_Sub4_Sub1_Sub1 extends Class23_Sub4_Sub1
{//npc update
    public static int anInt6469;
    public static int anInt6470;
    public static int anInt6471;
    public static int anInt6472;
    public static int anInt6473;
    public Class66 aClass66_6474;
    public static Class158 aClass158_6475;
    public static int anInt6476;
    public static Class214 aClass214_6477 = new Class214(200);
    public static int anInt6478;
    public static int anInt6479;
    public static int anInt6480;
    public static Class158 aClass158_6481;
    public static int anInt6482;
    public static int anInt6483;
    public static int anInt6484;
    public static int anInt6485;
    public static int anInt6486;
    public static int anInt6487;
    public static int anInt6488;
    public static int anInt6489;
    public static int anInt6490;
    
    public static boolean method348(byte arg0, String arg1) {
	try {
	    anInt6487++;
	    if (arg1 == null)
		return false;
	    for (int i = 0; (i ^ 0xffffffff) > (Class33.anInt469 ^ 0xffffffff);
		 i++) {
		if (arg1.equalsIgnoreCase(Class23_Sub2.aStringArray3707[i]))
		    return true;
	    }
	    if (arg0 < 71)
		method354(24);
	    if (arg1.equalsIgnoreCase(Class166.aClass23_Sub4_Sub1_Sub2_2216
				      .aString6491))
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ai.Q(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public void method349(int arg0, Class66 arg1) {
	aClass66_6474 = arg1;
	int i = 65 % ((25 - arg0) / 51);
	anInt6489++;
	if (aClass1_Sub6_5316 != null)
	    aClass1_Sub6_5316.method121();
    }
    
    public void method293(byte arg0, Class130 arg1, int arg2, int arg3,
			  boolean arg4, Class23 arg5, int arg6) {
	try {
	    anInt6469++;
	    if (arg0 > -116)
		method345((byte) 5);
	    throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ai.J(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ','
						 + (arg5 != null ? "{...}"
						    : "null")
						 + ',' + arg6 + ')'));
	}
    }
    
    public void method294(Class130 arg0, int arg1) {
	try {
	    anInt6485++;
	    if (aClass66_6474 != null
		&& (aBoolean5326 || method353(0, -5235, arg0))) {
		if (arg1 != 0)
		    aClass66_6474 = null;
		this.method331((byte) -44, arg0, aClass154Array5329,
			       aBoolean5326);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ai.H("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public boolean method350(boolean arg0) {
	try {
	    anInt6472++;
	    if (arg0 != false)
		aClass158_6481 = null;
	    if (aClass66_6474 == null)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ai.L(" + arg0 + ')');
	}
    }
    
    public int method332(byte arg0) {
	try {
	    anInt6478++;
	    if (aClass66_6474.anIntArray845 != null) {
		Class66 class66 = aClass66_6474.method697(true);
		if (class66 != null && class66.anInt848 != -1)
		    return class66.anInt848;
	    }
	    int i = -119 / ((arg0 - -66) / 59);
	    return aClass66_6474.anInt848;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ai.HA(" + arg0 + ')');
	}
    }
    
    public boolean method351(int arg0) {
	try {
	    if (arg0 != 82)
		method346((byte) -1);
	    anInt6471++;
	    return aClass66_6474.aBoolean841;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ai.T(" + arg0 + ')');
	}
    }
    
    public static void method352(int arg0, int arg1) {
	Class103.anInt1342 = arg1;
	anInt6479++;
	Class2.aClass214_83.method2783(arg0 + -86);
	if (arg0 != -1)
	    aClass158_6481 = null;
    }
    
    public boolean method353(int arg0, int arg1, Class130 arg2) {
	try {
	    anInt6480++;
	    int i = arg0;
	    Class72 class72 = this.method344(arg1 + 5351);
	    Class161 class161
		= (anInt5247 == -1 || (anInt5256 ^ 0xffffffff) != -1 ? null
		   : Class145.method2159(anInt5247, (byte) -116));
	    Class161 class161_0_
		= (((anInt5254 ^ 0xffffffff) == 0
		    || aBoolean5261 && class161 != null)
		   ? null : Class145.method2159(anInt5254, (byte) -97));
	    int i_1_ = class72.anInt973;
	    int i_2_ = class72.anInt975;
	    if ((i_1_ ^ 0xffffffff) != -1 || (i_2_ ^ 0xffffffff) != -1
		|| class72.anInt956 != 0 || class72.anInt965 != 0)
		arg0 |= 0x7;
	    if (arg1 != -5235)
		aClass214_6477 = null;
	    Class154 class154
		= (aClass154Array5329[0]
		   = aClass66_6474.method696(anInt5304, anInt5237,
					     aClass141Array5313, class161, 110,
					     class161_0_, anInt5235, arg2,
					     anInt5248, anInt5305, arg0,
					     anInt5258));
	    if (class154 == null)
		return false;
	    anInt5264 = class154.method2256();
	    this.method341(14889, class154);
	    int i_3_ = aClass171_5297.method2441((byte) 126);
	    anInt5252 = 0;
	    anInt5236 = 0;
	    anInt5275 = 0;
	    if (i_1_ == 0 && i_2_ == 0)
		this.method336(this.method335((byte) -67) << -905035737, 2,
			       this.method335((byte) -122) << 1548331143,
			       i_3_);
	    else {
		this.method336(i_2_, 2, i_1_, i_3_);
		if (anInt5252 != 0)
		    aClass154Array5329[0].method2288(anInt5252);
		if ((anInt5275 ^ 0xffffffff) != -1)
		    aClass154Array5329[0].method2251(anInt5275);
		if (anInt5236 != 0)
		    aClass154Array5329[0].method2272(0, anInt5236, 0);
	    }
	    aClass154Array5329[1] = null;
	    if (anInt5253 != -1 && (anInt5262 ^ 0xffffffff) != 0) {
		Class112 class112 = Class151.method2194(anInt5253, -6861);
		Class154 class154_4_
		    = class112.method956(-1, anInt5262, anInt5288, anInt5251,
					 (!class112.aBoolean1442 ? 2 : 7) | i,
					 arg2);
		if (class154_4_ != null) {
		    class154_4_.method2272(0, -anInt5286, 0);
		    if (class112.aBoolean1442 && (i_1_ != 0 || i_2_ != 0)) {
			if ((anInt5252 ^ 0xffffffff) != -1)
			    class154_4_.method2288(anInt5252);
			if ((anInt5275 ^ 0xffffffff) != -1)
			    class154_4_.method2251(anInt5275);
			if (anInt5236 != 0)
			    class154_4_.method2272(0, anInt5236, 0);
		    }
		    aClass154Array5329[1] = class154_4_;
		}
	    }
	    aClass154Array5329[2] = null;
	    if (anInterface6_5333 != null) {
		if ((Class125.anInt1632 ^ 0xffffffff)
		    <= (anInt5332 ^ 0xffffffff))
		    anInterface6_5333 = null;
		if ((Class125.anInt1632 ^ 0xffffffff) <= (anInt5324
							  ^ 0xffffffff)
		    && anInt5332 > Class125.anInt1632) {
		    Class154 class154_5_
			= anInterface6_5333.method18((byte) 105, i | 0x7,
						     arg2);
		    if (class154_5_ != null) {
			class154_5_.method2272(-anInt3733 + anInt5327,
					       -anInt3746 + anInt5325,
					       anInt5323 - anInt3747);
			if ((i_3_ ^ 0xffffffff) != -1)
			    class154_5_.method2264(i_3_);
			aClass154Array5329[2] = class154_5_;
		    }
		}
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ai.O(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public boolean method287(int arg0, Class130 arg1, int arg2, int arg3) {
	try {
	    anInt6482++;
	    if (aClass66_6474 == null || !method353(65536, -5235, arg1))
		return false;
	    Class9 class9 = arg1.method1238();
	    int i = aClass171_5297.method2441((byte) 126);
	    class9.method177(i);
	    class9.method181(anInt3733, anInt3746, anInt3747);
	    int i_6_ = 0;
	    if (arg3 <= 12)
		return true;
	    for (/**/; ((aClass154Array5329.length ^ 0xffffffff)
			< (i_6_ ^ 0xffffffff)); i_6_++) {
		if (aClass154Array5329[i_6_] != null)
		    return (aClass154Array5329[i_6_].method2278
			    (arg2, arg0, class9, aClass66_6474.anInt839 == 1));
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ai.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public int method323(int arg0) {
	try {
	    anInt6473++;
	    if (arg0 >= -7)
		method323(-56);
	    return anInt5264;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ai.UA(" + arg0 + ')');
	}
    }
    
    public static void method354(int arg0) {
	aClass158_6481 = null;
	aClass214_6477 = null;
	aClass158_6475 = null;
	if (arg0 != -14754)
	    method354(39);
    }
    
    public int method346(byte arg0) {
	try {
	    if (arg0 != 115)
		aClass66_6474 = null;
	    anInt6483++;
	    if (aClass66_6474.anIntArray845 != null) {
		Class66 class66 = aClass66_6474.method697(true);
		if (class66 != null && class66.anInt901 != -1)
		    return class66.anInt901;
	    }
	    return aClass66_6474.anInt901;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ai.NA(" + arg0 + ')');
	}
    }
    
    public int method345(byte arg0) {
	try {
	    anInt6470++;
	    if (aClass66_6474.anIntArray845 != null) {
		Class66 class66 = aClass66_6474.method697(true);
		if (class66 != null && (class66.anInt846 ^ 0xffffffff) != 0)
		    return class66.anInt846;
	    }
	    if (arg0 < 78)
		aClass66_6474 = null;
	    if ((aClass66_6474.anInt846 ^ 0xffffffff) == 0)
		return super.method345((byte) 112);
	    return aClass66_6474.anInt846;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ai.GA(" + arg0 + ')');
	}
    }
    
    public boolean method289(byte arg0) {
	try {
	    anInt6490++;
	    if (arg0 != -115)
		method293((byte) 125, null, -9, 15, true, null, 20);
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ai.D(" + arg0 + ')');
	}
    }
    
    public Class1_Sub2 method288(Class130 arg0, boolean arg1) {
	try {
	    anInt6476++;
	    if (aClass66_6474 == null || !method353(1024, -5235, arg0))
		return null;
	    Class9 class9 = arg0.method1238();
	    int i = aClass171_5297.method2441((byte) 127);
	    class9.method177(i);
	    class9.method174(anInt3733, anInt3746, anInt3747);
	    Class72 class72 = this.method344(110);
	    Class66 class66
		= (aClass66_6474.anIntArray845 == null ? aClass66_6474
		   : aClass66_6474.method697(!arg1));
	    if (Class121.aBoolean1588 && class66.aBoolean857
		&& class72.aBoolean978) {
		Class161 class161
		    = (anInt5247 == -1 || (anInt5256 ^ 0xffffffff) != -1 ? null
		       : Class145.method2159(anInt5247, (byte) -107));
		Class161 class161_7_
		    = ((anInt5254 ^ 0xffffffff) != 0 && (!aBoolean5261
							 || class161 == null)
		       ? Class145.method2159(anInt5254, (byte) -124) : null);
		Class154 class154
		    = (Class131_Sub2_Sub27.method1601
		       (0xffff & aClass66_6474.aShort894, arg0,
			class161_7_ != null ? class161_7_ : class161,
			0xff & aClass66_6474.aByte854, anInt5236, i,
			aBoolean5309,
			class161_7_ != null ? anInt5235 : anInt5248,
			aClass154Array5329[0], anInt5252, anInt5275,
			aClass66_6474.aShort862 & 0xffff,
			aClass66_6474.anInt839, 0xff & aClass66_6474.aByte851,
			(byte) 22));
		if (class154 != null) {
		    float f = arg0.method1162();
		    float f_8_ = arg0.method1239();
		    arg0.method1177(false);
		    arg0.method1252(f, f_8_ - 150.0F);
		    class154.method2261(class9, null, 0);
		    arg0.method1252(f, f_8_);
		    arg0.method1177(true);
		}
	    }
	    Class1_Sub2 class1_sub2 = null;
	    if (method351(82))
		class1_sub2
		    = Class131_Sub41_Sub11
			  .method2003(aClass154Array5329.length, 12300);
	    if (aClass1_Sub6_5316 != null) {
		Class105 class105 = aClass1_Sub6_5316.method113();
		arg0.method1234(aClass154Array5329, class105, class9,
				(class1_sub2 != null
				 ? class1_sub2.aClass1_Sub5Array3500 : null),
				0);
	    } else
		arg0.method1196(aClass154Array5329, class9,
				(class1_sub2 == null ? null
				 : class1_sub2.aClass1_Sub5Array3500),
				0);
	    this.method331((byte) -111, arg0, aClass154Array5329, arg1);
	    if (aClass154Array5329[2] != null) {
		if ((i ^ 0xffffffff) != -1)
		    aClass154Array5329[2].method2264(i);
		aClass154Array5329[2].method2272(-anInt5327 + anInt3733,
						 anInt3746 - anInt5325,
						 anInt3747 - anInt5323);
	    }
	    return class1_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ai.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method295(int arg0) {
	try {
	    anInt6484++;
	    if (arg0 != 0)
		aClass158_6481 = null;
	    throw new IllegalStateException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ai.E(" + arg0 + ')');
	}
    }
    public static void NPCrouteFinder(int NpcIndex, int arg1) {
    	try {
    	    int i = arg1;
    	    if ((i ^ 0xffffffff) < -26)
    		i = 25;
    	    arg1--;
    	    int i_2_ = Class183.anIntArray2615[arg1];
    	    int i_3_ = Class116.anIntArray1490[arg1];
    		Class93.aClass131_Sub15_Sub2_1226.createPacket(166);
    		Class93.aClass131_Sub15_Sub2_1226.writeByte(3 + i + i);
    		Class131_Sub8_Sub1.anInt6101++;
    	    Class93.aClass131_Sub15_Sub2_1226
    		.writeLEShort(i_3_, (byte) -115);
    	    Class93.aClass131_Sub15_Sub2_1226.writeByteS(NpcIndex);
    	    Class93.aClass131_Sub15_Sub2_1226
    		.writeShort(i_2_);
    		    for (int i_4_ = 1; i_4_  < i; i_4_++) {
    		    	arg1--;
    			Class93.aClass131_Sub15_Sub2_1226.writeByte((Class183.anIntArray2615[arg1] - i_2_));
    			Class93.aClass131_Sub15_Sub2_1226.writeByteS((Class116.anIntArray1490[arg1] - i_3_));
    		    }
    	} catch (RuntimeException runtimeexception) {
    	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
    						("ai.P(" +  + ',' + arg1
    						 + ',' + NpcIndex + ',' + 
    						 + ')'));
    	}
        } 
    public static void routeFinder(int arg1, int arg2) {
    	try {
    	    int i = arg1;
    	    if ((i ^ 0xffffffff) < -26)
    		i = 25;
    	    arg1--;
    	    int i_2_ = Class183.anIntArray2615[arg1];
    	    int i_3_ = Class116.anIntArray1490[arg1];
    	    if ((arg2 ^ 0xffffffff) == -1) {
    		Class93.aClass131_Sub15_Sub2_1226.createPacket(119);
    		Class93.aClass131_Sub15_Sub2_1226.writeByte(3 + i + i);
    		Class131_Sub8_Sub1.anInt6101++;
    	    }
    	    anInt6486++;
    	    if ((arg2 ^ 0xffffffff) == -2) {
    		Class142.anInt1894++;
    		Class93.aClass131_Sub15_Sub2_1226.createPacket(163);
    		Class93.aClass131_Sub15_Sub2_1226.writeByte(14 + (3 + i + i));
    	    }
    	    if ((arg2 ^ 0xffffffff) == -3) {
        		Class93.aClass131_Sub15_Sub2_1226.createPacket(165);
        		Class93.aClass131_Sub15_Sub2_1226.writeByte(3 + i + i);
        		Class131_Sub8_Sub1.anInt6101++;
        	    }
    	    Class93.aClass131_Sub15_Sub2_1226
    		.writeLEShort(i_3_ + Class64.regionY, (byte) -115);
    	    Class93.aClass131_Sub15_Sub2_1226.writeByteS(!(Class131_Sub2_Sub39
    							   .aBooleanArray6080
    							   [82]) ? 0 : 1);
    	    Class93.aClass131_Sub15_Sub2_1226
    		.writeShort(Class92.regionX + i_2_);
    	    Class131_Sub2_Sub6.LocalX = i_2_;
    	    Class169.LocalY = i_3_;
    	    Class78.aBoolean1051 = false;
    		    for (int i_4_ = 1; i_4_  < i; i_4_++) {
    		    	arg1--;
    			Class93.aClass131_Sub15_Sub2_1226.writeByte((Class183.anIntArray2615[arg1] - i_2_));
    			Class93.aClass131_Sub15_Sub2_1226.writeByteS((Class116.anIntArray1490[arg1] - i_3_));
    		    }
    	} catch (RuntimeException runtimeexception) {
    	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
    						("ai.P(" +  + ',' + arg1
    						 + ',' + arg2 + ',' + 
    						 + ')'));
    	}
        }  
    public static void methodtodo(int arg0, int arg1, int arg2, int arg3) {
	try {
	   /* int i = arg3;
	    if ((i ^ 0xffffffff) < -26)
		i = 25;
	    arg3--;
	    int i_2_ = Class183.anIntArray2615[arg3];
	    int i_3_ = Class116.anIntArray1490[arg3];*/
	    if ((arg1 ^ 0xffffffff) == -1) {
		Class93.aClass131_Sub15_Sub2_1226.createPacket(119);
		//Class93.aClass131_Sub15_Sub2_1226.writeByte(3 + i + i);
		Class131_Sub8_Sub1.anInt6101++;
	    }
	    anInt6486++;
	    if ((arg1 ^ 0xffffffff) == -2) {
		Class142.anInt1894++;
		Class93.aClass131_Sub15_Sub2_1226.createPacket(163);
		//Class93.aClass131_Sub15_Sub2_1226.writeByte(14 + (3 + i + i));
	    }
	    Class93.aClass131_Sub15_Sub2_1226
		.writeLEShort(arg0 + Class64.regionY, (byte) -115);
	    Class93.aClass131_Sub15_Sub2_1226.writeByteS(!(Class131_Sub2_Sub39
							   .aBooleanArray6080
							   [82]) ? 0 : 1);
	    Class93.aClass131_Sub15_Sub2_1226
		.writeShort(Class92.regionX + arg3);
	    Class131_Sub2_Sub6.LocalX = arg3; //arg3
	    Class169.LocalY = arg0; //arg0
	    Class78.aBoolean1051 = false;
		   // Stream localStream = new Stream(new byte[1000000]);
		    client.sendMessage("i"+0);
		    for (int i_4_ = arg3; 0 > i_4_; i_4_++) {
		    	arg3--;
			/*Class93.aClass131_Sub15_Sub2_1226.writeByte((Class183.anIntArray2615[arg2] - i_2_));
			Class93.aClass131_Sub15_Sub2_1226.writeByteS((Class116.anIntArray1490[arg2] - i_3_));*/
		    	 client.sendMessage("ClipedX: "+(Class183.anIntArray2615[arg3] - 0)+" , ClipedY: "+(Class116.anIntArray1490[arg3] - 0));
		    }
		    /*if (Class183.anIntArray2615[arg2] != 0 || Class116.anIntArray1490[arg2] != 0)
		    client.sendMessage("ClipedX: "+(Class183.anIntArray2615[arg2]+ -arg3)+" , ClipedY: "+(Class116.anIntArray1490[arg2]+ -arg0));
		     */
		    
	    /*if (arg2 == 0)
		Class149.method2181((byte) -117);*/
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ai.P(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
}
