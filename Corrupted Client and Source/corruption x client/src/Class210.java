/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class210
{
    public static long aLong3062;
    public static int anInt3063;
    public static int[] anIntArray3064 = new int[13];
    public static int anInt3065;
    public static Class50[] aClass50Array3066 = new Class50[5];
    public static int anInt3067;
    public static int anInt3068;
    public static Class115 aClass115_3069;
    
    public static boolean Flag(int arg0, int arg1, int arg2, int arg3,
				     int arg4, int arg5, int arg6, int arg7,
				     int arg8, int arg9, boolean arg10) { //normal walk to objects etc
	try {
	    anInt3067++;
	    int i = Class143.method2141(arg7, arg2, arg6, arg8,
					Class131_Sub2_Sub18.anIntArray5821,
					arg10, -12757,
					Class131_Sub24.anIntArray4473, arg5,
					Class166
					    .aClass23_Sub4_Sub1_Sub2_2216
					    .method335((byte) -51),
					arg4, arg0, arg1, arg9,
					(Class131_Sub2_Sub9.aClass19Array5682
					 [Class29.anInt300]));
	    if ((i ^ 0xffffffff) > -2)
		return false;
	    Class131_Sub2_Sub6.LocalX
		= Class131_Sub2_Sub18.anIntArray5821[-1 + i];
	    Class169.LocalY = Class131_Sub24.anIntArray4473[i - 1];
	    Class78.aBoolean1051 = false;
	    Class149.method2181((byte) -117);
	    int i_0_ = -96 / ((50 - arg3) / 35);
	    Class23_Sub4_Sub1_Sub1.routeFinder(i,0);
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ve.C(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ',' + arg7
						 + ',' + arg8 + ',' + arg9
						 + ',' + arg10 + ')'));
	}
    }
    public static boolean NpcRoute(int npcIndex, int arg0, int toX, int arg2, int arg3,
		     int toY, int arg5, int localX, int localY,
		     int arg8, int arg9, boolean arg10) { //walk to players and npcs when ataking them
try {
anInt3067++;
int i = Class143.method2141(localY, arg2, localX, arg8,
			Class131_Sub2_Sub18.anIntArray5821,
			arg10, -12757,
			Class131_Sub24.anIntArray4473, arg5,
			Class166
			    .aClass23_Sub4_Sub1_Sub2_2216
			    .method335((byte) -51),
			toY, arg0, toX, arg9,
			(Class131_Sub2_Sub9.aClass19Array5682
			 [Class29.anInt300]));
client.sendMessage("[LocalX][LocalY][ToX][ToY]: steps");
client.sendMessage("From["+localX+"]["+localY+"]to["+toX+"]["+toY+"]: "+i);
if ((i ^ 0xffffffff) > -2)
return false;
Class23_Sub4_Sub1_Sub1.NPCrouteFinder(npcIndex, i);
return true;
} catch (RuntimeException runtimeexception) {
throw Class131_Sub2_Sub6.method1495(runtimeexception,
				("ve.C(" + arg0 + ',' + toX
				 + ',' + arg2 + ',' + arg3
				 + ',' + toY + ',' + arg5
				 + ',' + localX + ',' + localY
				 + ',' + arg8 + ',' + arg9
				 + ',' + arg10 + ')'));
}
}
    public static boolean FlagNpcPlayer(int arg0, int toX, int arg2, int arg3,
		     int toY, int arg5, int arg6, int localX,
		     int localY, int arg9, boolean arg10) { //walk to players and npcs when ataking them
try {
anInt3067++;
int i = Class143.method2141(localX, arg2, arg6, localY,
			Class131_Sub2_Sub18.anIntArray5821,
			arg10, -12757,
			Class131_Sub24.anIntArray4473, arg5,
			Class166
			    .aClass23_Sub4_Sub1_Sub2_2216
			    .method335((byte) -51),
			toY, arg0, toX, arg9,
			(Class131_Sub2_Sub9.aClass19Array5682
			 [Class29.anInt300]));
if ((i ^ 0xffffffff) > -2)
return false;
Class131_Sub2_Sub6.LocalX
= Class131_Sub2_Sub18.anIntArray5821[-1 + i];
Class169.LocalY = Class131_Sub24.anIntArray4473[i - 1];
Class78.aBoolean1051 = false;
Class149.method2181((byte) -117);
Class23_Sub4_Sub1_Sub1.routeFinder(i,2);
return true;
} catch (RuntimeException runtimeexception) {
throw Class131_Sub2_Sub6.method1495(runtimeexception,
				("ve.C(" + arg0 + ',' + toX
				 + ',' + arg2 + ',' + arg3
				 + ',' + toY + ',' + arg5
				 + ',' + arg6 + ',' + localX
				 + ',' + localY + ',' + arg9
				 + ',' + arg10 + ')'));
}
}
    public static boolean routeFinder(int arg0, int arg1, int arg2, int arg3,
		     int arg4, int arg5, int arg6, int arg7,
		     int arg8, int arg9, boolean arg10, int i_5_) { //normal walk without flag
try {
	anInt3067++;
	int i = Class143.method2141(arg7, arg2, arg6, arg8,
				Class131_Sub2_Sub18.anIntArray5821,
				arg10, -12757,
				Class131_Sub24.anIntArray4473, arg5,
				Class166
				    .aClass23_Sub4_Sub1_Sub2_2216
				    .method335((byte) -51),
				arg4, arg0, arg1, arg9,
				(Class131_Sub2_Sub9.aClass19Array5682
				 [Class29.anInt300]));
	if ((i ^ 0xffffffff) > -2)
	return false;
	Class131_Sub2_Sub6.LocalX
	= Class131_Sub2_Sub18.anIntArray5821[-1 + i];
	Class169.LocalY = Class131_Sub24.anIntArray4473[i - 1];
	Class78.aBoolean1051 = false;
	Class149.method2181((byte) -117);
Class23_Sub4_Sub1_Sub1.routeFinder(i, i_5_);
return true;
} catch (RuntimeException runtimeexception) {
throw Class131_Sub2_Sub6.method1495(runtimeexception,
				("ve.C(" + arg0 + ',' + arg1
				 + ',' + arg2 + ',' + arg3
				 + ',' + arg4 + ',' + arg5
				 + ',' + arg6 + ',' + arg7
				 + ',' + arg8 + ',' + arg9
				 + ',' + arg10 + ')'));
}
}
    public static boolean Flag(int arg0, int arg1, int arg2, int arg3,
		     int arg4, int arg5, int arg6, int arg7,
		     int arg8, int arg9, boolean arg10, int i_5_) { //normal walk flag
try {
anInt3067++;
int i = Class143.method2141(arg7, arg2, arg6, arg8,
			Class131_Sub2_Sub18.anIntArray5821,
			arg10, -12757,
			Class131_Sub24.anIntArray4473, arg5,
			Class166
			    .aClass23_Sub4_Sub1_Sub2_2216
			    .method335((byte) -51),
			arg4, arg0, arg1, arg9,
			(Class131_Sub2_Sub9.aClass19Array5682
			 [Class29.anInt300]));
if ((i ^ 0xffffffff) > -2)
return false;
Class131_Sub2_Sub6.LocalX
= Class131_Sub2_Sub18.anIntArray5821[-1 + i];
Class169.LocalY = Class131_Sub24.anIntArray4473[i - 1];
Class78.aBoolean1051 = false;
Class149.method2181((byte) -117);
int i_0_ = -96 / ((50 - arg3) / 35);
return true;
} catch (RuntimeException runtimeexception) {
throw Class131_Sub2_Sub6.method1495(runtimeexception,
				("ve.C(" + arg0 + ',' + arg1
				 + ',' + arg2 + ',' + arg3
				 + ',' + arg4 + ',' + arg5
				 + ',' + arg6 + ',' + arg7
				 + ',' + arg8 + ',' + arg9
				 + ',' + arg10 + ')'));
}
}
    
    public static void method2760(int arg0, Class158 arg1) {
	try {
	    if (arg0 == 1) {
		Class131_Sub2_Sub32.anInt6014
		    = arg1.method2359(110, "p11_full");
		anInt3065++;
		Class128.anInt1743 = arg1.method2359(97, "p12_full");
		PacketParser.anInt5872
		    = arg1.method2359(112, "b12_full");
		Class131_Sub17.anInt4377 = arg1.method2359(113, "hitmarks");
		Class203.anInt2962 = arg1.method2359(99, "hitbar_default");
		Class85.anInt1111
		    = arg1.method2359(arg0 + 109, "timerbar_default");
		Class55.anInt714 = arg1.method2359(126, "headicons_pk");
		Class110_Sub1.anInt3892
		    = arg1.method2359(108, "headicons_prayer");
		Class44.anInt600 = arg1.method2359(95, "hint_headicons");
		Class131_Sub31.anInt4527
		    = arg1.method2359(120, "hint_mapmarkers");
		Class93.anInt1225 = arg1.method2359(124, "mapflag");
		Class74.anInt1009 = arg1.method2359(arg0 + 120, "cross");
		Class209.anInt3055 = arg1.method2359(98, "mapdots");
		Class131_Sub2_Sub9.anInt5680
		    = arg1.method2359(113, "scrollbar");
		Class105.anInt1368
		    = arg1.method2359(arg0 ^ 0x7c, "name_icons");
		Class131_Sub21.anInt4434
		    = arg1.method2359(110, "floorshadows");
		Class131_Sub41_Sub5.anInt6230
		    = arg1.method2359(107, "compass");
		Class130.anInt1769 = arg1.method2359(112, "hint_mapedge");
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ve.B(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method2761(int arg0) {
	try {
	    if (arg0 != -23369)
		aClass50Array3066 = null;
	    aClass115_3069 = null;
	    anIntArray3064 = null;
	    aClass50Array3066 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ve.A(" + arg0 + ')');
	}
    }
    
    static {
	aLong3062 = 0L;
	for (int i = 0;
	     (i ^ 0xffffffff) > (aClass50Array3066.length ^ 0xffffffff); i++)
	    aClass50Array3066[i] = new Class50();
    }
}
