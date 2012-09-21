/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Rectangle;

public abstract class Class130
{
    public static int anInt1764;
    public static int anInt1765;
    public static int anInt1766;
    public static int anInt1767;
    public static int anInt1768;
    public static int anInt1769;
    public static int anInt1770;
    public static int anInt1771;
    public static int anInt1772;
    public static int anInt1773;
    public static int anInt1774;
    public static int anInt1775;
    public static int anInt1776;
    public static int anInt1777;
    public static Class140 aClass140_1778;
    public static int anInt1779;
    public static int anInt1780;
    public int anInt1781 = -1;
    public static int anInt1782;
    
    public static synchronized Class130 method1157(int arg0, int arg1,
						   SignLink arg2, Canvas arg3,
						   int arg4, Interface4 arg5) {
	try {
	    anInt1771++;
	    if (arg1 != -9426)
		aClass140_1778 = null;
	    int i = -1;
	    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -9; i_0_++) {
		if (!Class9.aBooleanArray112[i_0_]) {
		    i = i_0_;
		    break;
		}
	    }
	    if ((i ^ 0xffffffff) == 0)
		throw new IllegalStateException("NFTI");
	    Object object = null;
	    Class130 class130;
	    if ((arg4 ^ 0xffffffff) == -1)
		class130 = Class131_Sub13.method1710(i, arg3, arg5, false);
	    else if (arg4 == 1)
		class130 = Class44.method538(arg1 ^ 0x24b8, i, arg5, arg3,
					     arg0, arg2);
	    else
		throw new IllegalArgumentException("UM");
	    Class9.aBooleanArray112[i] = true;
	    return class130;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("nr.QG(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
			+ (arg5 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public abstract void method1158();
    
    public abstract boolean method1159();
    
    public abstract void method1160(int i, int i_1_, int i_2_, int i_3_,
				    int i_4_);
    
    public abstract void method1161(float f);
    
    public abstract float method1162();
    
    public abstract boolean method1163();
    
    public abstract int method1164();
    
    public abstract int method1165();
    
    public abstract void method1166();
    
    public void method1167(int arg0) {
	try {
	    anInt1764++;
	    if (arg0 != -31586)
		method1246(0.69155765F, -1.0978364F, -2.4051638F);
	    Class9.aBooleanArray112[anInt1781] = false;
	    method1158();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nr.SG(" + arg0 + ')');
	}
    }
    
    public abstract void method1168(int i, int i_5_, int i_6_, int i_7_,
				    int i_8_, int i_9_);
    
    public abstract void method1169();
    
    public abstract boolean method1170();
    
    public abstract void method1171(boolean bool);
    
    public abstract void method1172(Class83 class83);
    
    public abstract void method1173(int i, int i_10_, int i_11_, int i_12_,
				    int i_13_, int i_14_);
    
    public abstract int[] method1174(int i, int i_15_, int i_16_, int i_17_);
    
    public abstract boolean method1175();
    
    public abstract void method1176(int i, int i_18_, int i_19_, int i_20_,
				    int i_21_);
    
    public abstract void method1177(boolean bool);
    
    public abstract Class152 method1178(Class124 class124, boolean bool);
    
    public abstract Class183 method1179(int i, int i_22_, int[] is,
					int[] is_23_);
    
    public abstract void method1180(int i, int i_24_, int i_25_, int i_26_,
				    int i_27_, int i_28_);
    
    public abstract Class83 method1181(int i, int i_29_, int i_30_, int i_31_,
				       int i_32_, int i_33_);
    
    public abstract void method1182();
    
    public abstract void method1183(int i);
    
    public abstract Class83 method1184(Class83 class83, Class83 class83_34_,
				       float f, Class83 class83_35_);
    
    public abstract void method1185(boolean bool);
    
    public abstract boolean method1186();
    
    public abstract void method1187(int i);
    
    public abstract void method1188(int i, int i_36_, int i_37_, int i_38_);
    
    public abstract void method1189(int i);
    
    public abstract void method1190(Canvas canvas);
    
    public abstract void method1191(int i);
    
    public abstract void method1192(int i, Class183 class183, int i_39_,
				    int i_40_);
    
    public abstract void method1193(int i, int i_41_, int i_42_, int i_43_);
    
    public abstract void method1194();
    
    public void method1195(boolean arg0, int arg1, int arg2, int arg3,
			   int arg4, int arg5) {
	do {
	    try {
		method1180(arg4, arg3, arg2, arg1, arg5, 1);
		anInt1782++;
		if (arg0 == true)
		    break;
		anInt1769 = -5;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("nr.IG(" + arg0 + ','
						     + arg1 + ',' + arg2 + ','
						     + arg3 + ',' + arg4 + ','
						     + arg5 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public abstract void method1196(Class154[] class154s, Class9 class9,
				    Class1_Sub5[] class1_sub5s, int i);
    
    public abstract boolean method1197();
    
    public static void method1198(boolean arg0, int arg1) {
	try {
	    Class23_Sub2_Sub1.aClass214_4976.method2786(0, arg1);
	    if (arg0 != true)
		anInt1769 = -84;
	    anInt1772++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nr.VG(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1199(int arg0) {
	try {
	    if (arg0 != -29885)
		anInt1769 = -50;
	    aClass140_1778 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nr.OG(" + arg0 + ')');
	}
    }
    
    public static void method1200(int arg0) {
	do {
	    try {
		anInt1765++;
		Class23_Sub4_Sub4.method383(-80, Class22_Sub1.aClass173_3666);
		Class9.anInt120++;
		if (!Class33.aBoolean471 || !Class131_Sub3.aBoolean4125) {
		    if (Class9.anInt120 > 1)
			Class22_Sub1.aClass173_3666 = null;
		} else {
		    int i = Class144.anInt1914;
		    i -= RuntimeException_Sub1.anInt3243;
		    int i_44_ = Class23_Sub4_Sub3.anInt5005;
		    if ((i ^ 0xffffffff) > (Class182.anInt2606 ^ 0xffffffff))
			i = Class182.anInt2606;
		    i_44_ -= Class1_Sub7_Sub1.anInt5212;
		    if ((i_44_ ^ 0xffffffff)
			> (Class131_Sub4.anInt4131 ^ 0xffffffff))
			i_44_ = Class131_Sub4.anInt4131;
		    if (i - -Class22_Sub1.aClass173_3666.anInt2411
			> (Class23_Sub4_Sub1_Sub2.aClass173_6520.anInt2411
			   + Class182.anInt2606))
			i = (Class182.anInt2606
			     + (Class23_Sub4_Sub1_Sub2.aClass173_6520.anInt2411
				+ -Class22_Sub1.aClass173_3666.anInt2411));
		    if ((i_44_ + Class22_Sub1.aClass173_3666.anInt2437
			 ^ 0xffffffff)
			< ((Class131_Sub4.anInt4131
			    - -Class23_Sub4_Sub1_Sub2.aClass173_6520.anInt2437)
			   ^ 0xffffffff))
			i_44_ = (-Class22_Sub1.aClass173_3666.anInt2437
				 + ((Class23_Sub4_Sub1_Sub2.aClass173_6520
				     .anInt2437)
				    + Class131_Sub4.anInt4131));
		    int i_45_ = 0 / ((35 - arg0) / 59);
		    int i_46_ = -Class142.anInt1885 + i;
		    int i_47_ = i_44_ + -InputStream_Sub1.anInt52;
		    int i_48_ = Class22_Sub1.aClass173_3666.anInt2335;
		    if (((Class9.anInt120 ^ 0xffffffff)
			 < (Class22_Sub1.aClass173_3666.anInt2319
			    ^ 0xffffffff))
			&& (i_46_ > i_48_
			    || (-i_48_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff)
			    || i_48_ < i_47_ || i_47_ < -i_48_))
			Class131_Sub9.aBoolean4216 = true;
		    int i_49_
			= (Class23_Sub4_Sub1_Sub2.aClass173_6520.anInt2427
			   + (i + -Class182.anInt2606));
		    int i_50_
			= (Class23_Sub4_Sub1_Sub2.aClass173_6520.anInt2415
			   + -Class131_Sub4.anInt4131 + i_44_);
		    if (Class22_Sub1.aClass173_3666.anObjectArray2331 != null
			&& Class131_Sub9.aBoolean4216) {
			Class131_Sub14 class131_sub14 = new Class131_Sub14();
			class131_sub14.anObjectArray4281
			    = Class22_Sub1.aClass173_3666.anObjectArray2331;
			class131_sub14.anInt4279 = i_49_;
			class131_sub14.aClass173_4276
			    = Class22_Sub1.aClass173_3666;
			class131_sub14.anInt4285 = i_50_;
			Class168.method2437(class131_sub14);
		    }
		    if ((Class147.anInt1949 ^ 0xffffffff) != -1)
			break;
		    if (Class131_Sub9.aBoolean4216) {
			if (Class22_Sub1.aClass173_3666.anObjectArray2405
			    != null) {
			    Class131_Sub14 class131_sub14
				= new Class131_Sub14();
			    class131_sub14.anInt4285 = i_50_;
			    class131_sub14.aClass173_4276
				= Class22_Sub1.aClass173_3666;
			    class131_sub14.aClass173_4280
				= Class33.aClass173_465;
			    class131_sub14.anInt4279 = i_49_;
			    class131_sub14.anObjectArray4281
				= (Class22_Sub1.aClass173_3666
				   .anObjectArray2405);
			    Class168.method2437(class131_sub14);
			}
			if (Class33.aClass173_465 != null
			    && (client.method53(Class22_Sub1.aClass173_3666)
				!= null))
			    Class128_Sub1.method1145
				(Class22_Sub1.aClass173_3666.anInt2455,
				 Class22_Sub1.aClass173_3666.anInt2350,
				 Class33.aClass173_465.anInt2455, 35,
				 Class33.aClass173_465.anInt2350);
		    } else if (((Class131_Sub27.anInt4491 ^ 0xffffffff) == -2
				|| Class131_Sub41_Sub20.method2064(114))
			       && (Class147.anInt1946 ^ 0xffffffff) < -3)
			Class161.method2387(-119, 2);
		    else if (Class98.method864(17762))
			Class161.method2387(-127, 1);
		    Class22_Sub1.aClass173_3666 = null;
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    "nr.WG(" + arg0 + ')');
	    }
	    break;
	} while (false);
    }
    
    public void method1201(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	try {
	    method1173(arg2, arg3, arg0, arg1, arg4, 1);
	    int i = 26 / ((arg5 - -29) / 60);
	    anInt1780++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nr.TG(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public abstract void method1202(int i, int i_51_, int i_52_, int i_53_);
    
    public abstract int method1203(int i, int i_54_);
    
    public abstract void method1204(Class154 class154, Class105 class105,
				    Class9 class9, Class1_Sub5 class1_sub5,
				    int i);
    
    public abstract void method1205(int i, int i_55_, int i_56_, int i_57_,
				    int i_58_, int i_59_, byte[] is, int i_60_,
				    int i_61_);
    
    public abstract boolean method1206();
    
    public abstract void method1207(int i, int i_62_, int i_63_, int i_64_,
				    int i_65_);
    
    public abstract int method1208(int i, int i_66_);
    
    public abstract boolean method1209(int i, int i_67_, int i_68_, int i_69_,
				       int i_70_, int i_71_);
    
    public static void method1210(boolean arg0) {
	try {
	    anInt1777++;
	    int i = Class108.aByteArrayArray1420.length;
	    int i_72_ = 0;
	    if (arg0 != false)
		aClass140_1778 = null;
	    for (/**/; (i ^ 0xffffffff) < (i_72_ ^ 0xffffffff); i_72_++) {
		if (Class108.aByteArrayArray1420[i_72_] != null) {
		    int i_73_ = -1;
		    for (int i_74_ = 0; i_74_ < Class133.anInt1804; i_74_++) {
			if ((Class74.anIntArray1003[i_72_] ^ 0xffffffff)
			    == (Class166.anIntArray2217[i_74_] ^ 0xffffffff)) {
			    i_73_ = i_74_;
			    break;
			}
		    }
		    if (i_73_ == -1) {
			Class166.anIntArray2217[Class133.anInt1804]
			    = Class74.anIntArray1003[i_72_];
			i_73_ = Class133.anInt1804++;
		    }
		    Stream stream
			= new Stream(Class108.aByteArrayArray1420
					     [i_72_]);
		    int i_75_ = 0;
		    while (Class108.aByteArrayArray1420[i_72_].length
			   > stream.offset) {
			if (i_75_ >= 511 || (Class131_Sub41_Sub2.anInt6186
					     ^ 0xffffffff) <= -1024)
			    break;
			int i_76_ = i_73_ | i_75_++ << -87348186;
			int i_77_ = stream.readUnsignedShort(8104);
			int i_78_ = i_77_ >> 758085070;
			int i_79_ = (0x1f92 & i_77_) >> -585992921;
			int i_80_ = 0x3f & i_77_;
			int i_81_ = i_79_ + ((Class74.anIntArray1003[i_72_]
					      >> -1162177496) * 64
					     - Class92.regionX);
			int i_82_
			    = ((0xff & Class74.anIntArray1003[i_72_]) * 64
			       + -Class64.regionY + i_80_);
			Class66 class66
			    = (Class131_Sub41_Sub7.method1971
			       (stream.readUnsignedShort(8104), 89));
			if ((Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			     [i_76_]) == null
			    && (class66.aByte867 & 0x1) > 0
			    && (i_78_ ^ 0xffffffff) == (Class1_Sub8.anInt3600
							^ 0xffffffff)
			    && i_81_ >= 0
			    && (i_81_ + class66.anInt839
				< Class131_Sub41_Sub11_Sub1.anInt6546)
			    && (i_82_ ^ 0xffffffff) <= -1
			    && ((Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff)
				< (i_82_ - -class66.anInt839 ^ 0xffffffff))) {
			    Class23_Sub4_Sub2
				.aClass23_Sub4_Sub1_Sub1Array5379[i_76_]
				= new Class23_Sub4_Sub1_Sub1();
			    Class23_Sub4_Sub2
				.aClass23_Sub4_Sub1_Sub1Array5379[i_76_]
				.anInt5274
				= i_76_;
			    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
				= (Class23_Sub4_Sub2
				   .aClass23_Sub4_Sub1_Sub1Array5379[i_76_]);
			    Class131_Sub41_Sub12.anIntArray6316
				[Class131_Sub41_Sub2.anInt6186++]
				= i_76_;
			    class23_sub4_sub1_sub1.anInt5285
				= Class125.anInt1632;
			    class23_sub4_sub1_sub1.method349(81, class66);
			    class23_sub4_sub1_sub1.method340
				(!arg0, (class23_sub4_sub1_sub1.aClass66_6474
					 .anInt839));
			    class23_sub4_sub1_sub1.anInt5310
				= (class23_sub4_sub1_sub1.aClass66_6474
				   .anInt853) << -2006589821;
			    if ((class23_sub4_sub1_sub1.anInt5310 ^ 0xffffffff)
				!= -1)
				class23_sub4_sub1_sub1.method338
				    (-127, (Class138.anIntArray1857
					    [-1 + (class23_sub4_sub1_sub1
						   .aClass66_6474.aByte838)]));
			    else
				class23_sub4_sub1_sub1.method338(-110, 0);
			    class23_sub4_sub1_sub1.method328
				(i_81_, true, 16383,
				 class23_sub4_sub1_sub1.method335((byte) -43),
				 i_78_, i_82_);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nr.LG(" + arg0 + ')');
	}
    }
    
    public abstract void method1211(Rectangle[] rectangles, int i);
    
    public abstract void method1212(int i, int i_83_);
    
    public abstract boolean method1213();
    
    public abstract int method1214();
    
    public abstract void method1215(Class105 class105);
    
    public abstract boolean method1216();
    
    public abstract void method1217(int i, Class131_Sub8[] class131_sub8s);
    
    public abstract Class154 method1218(Class116 class116, int i, int i_84_,
					int i_85_, int i_86_);
    
    public abstract void method1219(int i, int i_87_, int i_88_, int i_89_,
				    int i_90_, int i_91_, int i_92_, int i_93_,
				    int i_94_, int i_95_);
    
    public abstract boolean method1220();
    
    public abstract void method1221();
    
    public static void method1222(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	try {
	    Class204.anInt2976 = arg0;
	    Class131_Sub2_Sub30.anInt5993 = arg6;
	    Class131_Sub41_Sub17.anInt6393 = arg3;
	    Class14.anInt156 = arg4;
	    Class159.anInt2120 = arg1;
	    if (arg2 < -81) {
		anInt1776++;
		Class127_Sub1.anInt4009 = arg5;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nr.UG(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ',' + arg6 + ')'));
	}
    }
    
    public abstract boolean method1223();
    
    public abstract Class44 method1224(Class55 class55, Class124[] class124s,
				       boolean bool);
    
    public void method1225(int arg0, int arg1, byte arg2, int arg3, int arg4) {
	try {
	    if (arg2 >= -88)
		method1232(-44, -1.0097278F, -0.11255237F, -0.7604761F,
			   0.68191385F, -0.032201126F);
	    anInt1773++;
	    method1176(arg0, arg4, arg3, arg1, 1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nr.MG(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public void finalize() {
	try {
	    method1167(-31586);
	    anInt1770++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nr.finalize(" + ')');
	}
    }
    
    public abstract void method1226(int i, int i_96_, int i_97_, int i_98_,
				    int i_99_, int i_100_, Class183 class183,
				    int i_101_, int i_102_);
    
    public abstract void method1227(int i, int i_103_, int i_104_, int i_105_,
				    int i_106_, int i_107_, int i_108_);
    
    public abstract void method1228(int[] is);
    
    public abstract void method1229(int i);
    
    public abstract void method1230(int i, int i_109_);
    
    public abstract void method1231(Class131_Sub27 class131_sub27);
    
    public abstract void method1232(int i, float f, float f_110_, float f_111_,
				    float f_112_, float f_113_);
    
    public abstract void method1233(int i, int i_114_, int i_115_);
    
    public abstract void method1234(Class154[] class154s, Class105 class105,
				    Class9 class9, Class1_Sub5[] class1_sub5s,
				    int i);
    
    public abstract int method1235();
    
    public abstract void method1236(int i, int i_116_, int i_117_);
    
    public abstract Class68 method1237(int i, int i_118_, int[][] is,
				       int[][] is_119_, int i_120_, int i_121_,
				       int i_122_);
    
    public abstract Class9 method1238();
    
    public abstract float method1239();
    
    public abstract void method1240(int i, int i_123_, int i_124_, int[] is);
    
    public abstract boolean method1241();
    
    public abstract void method1242();
    
    public void method1243(int arg0, int arg1, int arg2, int arg3, byte arg4) {
	try {
	    method1207(arg2, arg0, arg3, arg1, 1);
	    anInt1767++;
	    int i = 89 / ((arg4 - -67) / 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nr.RG(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public abstract void method1244();
    
    public abstract boolean method1245();
    
    public abstract void method1246(float f, float f_125_, float f_126_);
    
    public abstract Class152 method1247(int[] is, int i, int i_127_,
					int i_128_, int i_129_);
    
    public abstract void method1248(int i, int i_130_, int i_131_, int i_132_);
    
    public abstract int method1249();
    
    public abstract void method1250();
    
    public abstract void method1251();
    
    public abstract void method1252(float f, float f_133_);
    
    public void method1253(boolean arg0, int arg1, int arg2, int arg3,
			   int arg4) {
	try {
	    method1160(arg3, arg1, arg4, arg2, 1);
	    if (arg0 != true)
		method1234(null, null, null, null, -10);
	    anInt1774++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nr.KG(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public static void method1254(boolean arg0, int arg1) {
	try {
	    Class131_Sub9.aBoolean4213 = arg0;
	    anInt1779++;
	    if (arg1 > -29)
		anInt1769 = 105;
	    Class23.aBoolean258 = !Class9.method182((byte) 124);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nr.JG(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public abstract boolean method1255();
    
    public abstract Class131_Sub27 method1256(int i);
    
    public abstract Class9 method1257();
    
    public static void method1258(int arg0, int arg1, int arg2, Class130 arg3,
				  int arg4, Class183 arg5, int arg6, int arg7,
				  Class173 arg8) {
	do {
	    try {
		anInt1766++;
		if (arg4 == 2) {
		    Class94 class94
			= Class131_Sub2_Sub32.method1626(arg2, (byte) 1);
		    if (class94 == null || !class94.aBoolean1243
			|| !class94.method861(arg4 + -3))
			break;
		    if (class94.anIntArray1269 != null) {
			int[] is = new int[class94.anIntArray1269.length];
			for (int i = 0;
			     (i ^ 0xffffffff) > (is.length / 2 ^ 0xffffffff);
			     i++) {
			    int i_134_;
			    if ((Class131_Sub2_Sub34.anInt6035 ^ 0xffffffff)
				!= -5)
				i_134_
				    = (Class148.anInt1982
				       + (int) Class120.aFloat1578) & 0x3fff;
			    else
				i_134_ = (int) Class120.aFloat1578 & 0x3fff;
			    int i_135_ = Class31.anIntArray434[i_134_];
			    int i_136_ = Class31.anIntArray425[i_134_];
			    if (Class131_Sub2_Sub34.anInt6035 != 4) {
				i_135_
				    = 256 * i_135_ / (256
						      + Class1_Sub7.anInt3590);
				i_136_
				    = i_136_ * 256 / (256
						      + Class1_Sub7.anInt3590);
			    }
			    is[2 * i]
				= ((((i_136_
				      * (arg1
					 + class94.anIntArray1269[i * 2] * 4))
				     + (class94.anIntArray1269[1 + i * 2] * 4
					+ arg6) * i_135_)
				    >> -642431153)
				   + (arg8.anInt2411 / 2 + arg7));
			    is[1 + 2 * i]
				= -(((4 * class94.anIntArray1269[i * 2 + 1]
				      + arg6) * i_136_
				     - (4 * class94.anIntArray1269[i * 2]
					+ arg1) * i_135_)
				    >> 2000279151) + arg0 + arg8.anInt2437 / 2;
			}
			Class123.method1070(arg3, is, class94.anInt1247,
					    arg8.anIntArray2478,
					    arg8.anIntArray2310);
			for (int i = 0; -1 + is.length / 2 > i; i++)
			    arg3.method1226(is[2 * i], is[2 * i - -1],
					    is[(1 + i) * 2],
					    is[1 + (i * 2 + 2)],
					    class94.anInt1263, 1, arg5, arg7,
					    arg0);
			arg3.method1226(is[is.length - 2], is[is.length - 1],
					is[0], is[1], class94.anInt1263, 1,
					arg5, arg7, arg0);
		    }
		    Class152 class152 = null;
		    if ((class94.anInt1266 ^ 0xffffffff) != 0) {
			class152 = class94.method855(-4379, false, arg3);
			if (class152 != null)
			    Class131_Sub2_Sub3.method1487(arg7, arg6, arg5, 2,
							  class152, arg0, arg8,
							  arg1);
		    }
		    if (class94.aString1235 == null)
			break;
		    int i = 0;
		    if (class152 != null)
			i = class152.method2204();
		    Class44 class44 = Class204.aClass44_2982;
		    Class55 class55 = Class169.aClass55_2269;
		    if ((class94.anInt1256 ^ 0xffffffff) == -2) {
			class55 = Class131_Sub24.aClass55_4469;
			class44 = Class184.aClass44_2633;
		    }
		    if ((class94.anInt1256 ^ 0xffffffff) == -3) {
			class55 = Class89.aClass55_3259;
			class44 = Class93.aClass44_1222;
		    }
		    Class131_Sub2_Sub1.method1472(arg8, arg1, class55, class44,
						  arg5, i, class94.aString1235,
						  arg7, arg6, (byte) 45, arg0,
						  class94.anInt1232);
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495
			  (runtimeexception,
			   ("nr.PG(" + arg0 + ',' + arg1 + ',' + arg2 + ','
			    + (arg3 != null ? "{...}" : "null") + ',' + arg4
			    + ',' + (arg5 != null ? "{...}" : "null") + ','
			    + arg6 + ',' + arg7 + ','
			    + (arg8 != null ? "{...}" : "null") + ')'));
	    }
	    break;
	} while (false);
    }
    
    public abstract boolean method1259();
    
    public abstract void method1260(Class9 class9);
    
    public abstract int method1261();
    
    public void method1262(int arg0, int arg1, int arg2, boolean arg3,
			   int arg4, int arg5) {
	try {
	    if (arg3 != false)
		anInt1781 = -23;
	    anInt1775++;
	    method1168(arg1, arg4, arg2, arg0, arg5, 1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nr.NG(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ',' + arg5
						 + ')'));
	}
    }
    
    public abstract Class152 method1263(int i, int i_137_, int i_138_,
					int i_139_, boolean bool);
}
