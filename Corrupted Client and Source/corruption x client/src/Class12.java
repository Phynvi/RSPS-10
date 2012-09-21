/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class12
{
    public static int anInt129;
    public static String aString130 = "Select";
    public static int anInt131;
    public static int[] anIntArray132 = new int[128];
    public static int anInt133;
    public static int anInt134;
    
    public static void method209
	(Class130 arg0, int arg1, int arg2, Class9 arg3, int arg4, int arg5,
	 int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10,
	 int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16,
	 boolean arg17) {
	Class131_Sub2_Sub35.aClass130_6044 = arg0;
	Class121_Sub3.anInt4001 = arg1;
	Class131_Sub2_Sub22.aClass9_5859 = arg3;
	Class23_Sub2.aBoolean3709
	    = Class131_Sub2_Sub35.aClass130_6044.method1165() > 0;
	Class210.anInt3063 = arg4 >> 7;
	Class47.anInt643 = arg6 >> 7;
	Class50.anInt668 = arg4;
	Class176.anInt2513 = arg6;
	Class104.anInt1355 = arg5;
	Class52.anInt695 = Class210.anInt3063 - Class131_Sub2_Sub32.anInt6011;
	if (Class52.anInt695 < 0) {
	    Class131_Sub31.anInt4546 = -Class52.anInt695;
	    Class52.anInt695 = 0;
	} else
	    Class131_Sub31.anInt4546 = 0;
	Class23_Sub1.anInt3702
	    = Class47.anInt643 - Class131_Sub2_Sub32.anInt6011;
	if (Class23_Sub1.anInt3702 < 0) {
	    Class138.anInt1855 = -Class23_Sub1.anInt3702;
	    Class23_Sub1.anInt3702 = 0;
	} else
	    Class138.anInt1855 = 0;
	Class120_Sub2.anInt3976
	    = Class210.anInt3063 + Class131_Sub2_Sub32.anInt6011;
	if (Class120_Sub2.anInt3976 > Class210.anInt3068)
	    Class120_Sub2.anInt3976 = Class210.anInt3068;
	Stream.anInt4350
	    = Class47.anInt643 + Class131_Sub2_Sub32.anInt6011;
	if (Stream.anInt4350 > Class131_Sub8_Sub1.anInt6099)
	    Stream.anInt4350 = Class131_Sub8_Sub1.anInt6099;
	for (int i = 0; i < (Class131_Sub2_Sub32.anInt6011
			     + Class131_Sub2_Sub32.anInt6011 + 2); i++) {
	    for (int i_0_ = 0;
		 i_0_ < (Class131_Sub2_Sub32.anInt6011
			 + Class131_Sub2_Sub32.anInt6011 + 2);
		 i_0_++) {
		int i_1_
		    = Class210.anInt3063 - Class131_Sub2_Sub32.anInt6011 + i;
		int i_2_
		    = Class47.anInt643 - Class131_Sub2_Sub32.anInt6011 + i_0_;
		if (i_1_ >= 0 && i_2_ >= 0 && i_1_ < Class210.anInt3068
		    && i_2_ < Class131_Sub8_Sub1.anInt6099) {
		    int i_3_ = i_1_ << 7;
		    int i_4_ = i_2_ << 7;
		    int i_5_ = (Class131_Sub2_Sub37.aClass68Array6057[3]
				    .method712(i_1_, i_2_)
				- 1000);
		    int i_6_
			= (Class85.aClass68Array1116 != null
			   ? Class85.aClass68Array1116[0].method712(i_1_,
								    i_2_) + 128
			   : Class131_Sub2_Sub37.aClass68Array6057[0]
				 .method712(i_1_, i_2_) + 128);
		    Class23_Sub5_Sub2.aBooleanArrayArray5059[i][i_0_]
			= Class131_Sub2_Sub35.aClass130_6044
			      .method1209(i_3_, i_5_, i_4_, i_3_, i_6_, i_4_);
		} else
		    Class23_Sub5_Sub2.aBooleanArrayArray5059[i][i_0_] = false;
	    }
	}
	for (int i = 0; i < (Class131_Sub2_Sub32.anInt6011
			     + Class131_Sub2_Sub32.anInt6011 + 1); i++) {
	    for (int i_7_ = 0;
		 i_7_ < (Class131_Sub2_Sub32.anInt6011
			 + Class131_Sub2_Sub32.anInt6011 + 1);
		 i_7_++)
		Class68.aBooleanArrayArray920[i][i_7_]
		    = (Class23_Sub5_Sub2.aBooleanArrayArray5059[i][i_7_]
		       || Class23_Sub5_Sub2.aBooleanArrayArray5059[i + 1][i_7_]
		       || Class23_Sub5_Sub2.aBooleanArrayArray5059[i][i_7_ + 1]
		       || (Class23_Sub5_Sub2.aBooleanArrayArray5059[i + 1]
			   [i_7_ + 1]));
	}
	Class67.anIntArray905 = arg8;
	Class47.anIntArray642 = arg9;
	Class131_Sub35.anIntArray4578 = arg10;
	Class215.anIntArray3152 = arg11;
	Class116.anIntArray1518 = arg12;
	Class71.method745();
	Class155.method2337((byte) -97);
	for (Class1_Sub2 class1_sub2
		 = (Class1_Sub2) Class134.aClass50_1807.method586((byte) 42);
	     class1_sub2 != null;
	     class1_sub2
		 = (Class1_Sub2) Class134.aClass50_1807.method589(90)) {
	    class1_sub2.method95((byte) 71);
	    Class131_Sub2_Sub17.method1555(class1_sub2, true);
	}
	if (Class23_Sub2.aBoolean3709) {
	    for (int i = 0; i < Class172.anInt2293; i++)
		Class131_Sub2_Sub11.aClass131_Sub8_Sub1Array5707[i]
		    .method1679(arg17, arg1, 1536);
	}
	if (arg2 > 1) {
	    Class131_Sub2_Sub35.aClass130_6044.method1187(0);
	    if (Class153_Sub1.aClass120_4757 == null
		|| Class153_Sub1.aClass120_4757 instanceof Class120_Sub2)
		Class153_Sub1.aClass120_4757 = new Class120_Sub1();
	} else if (Class153_Sub1.aClass120_4757 == null
		   || Class153_Sub1.aClass120_4757 instanceof Class120_Sub1)
	    Class153_Sub1.aClass120_4757 = new Class120_Sub2();
	Class153_Sub1.aClass120_4757.method1022(arg2, (byte) 126);
	Class153_Sub1.aClass120_4757.method1028(-46);
	if (Class82.aClass147ArrayArrayArray1092 != null) {
	    Class128.method1140(true);
	    Class153_Sub1.aClass120_4757.method1021(22, (byte) -127);
	    Class188.method2596(arg2, null, 0, (byte) 0, arg15, arg16);
	    Class153_Sub1.aClass120_4757.method1028(124);
	    Class153_Sub1.aClass120_4757.method1021(23, (byte) -128);
	    Class128.method1140(false);
	}
	Class188.method2596(arg2, arg7, arg13, arg14, arg15, arg16);
	Class153_Sub1.aClass120_4757.method1028(-76);
	Class153_Sub1.aClass120_4757.method1027(15226);
	Class153_Sub1.aClass120_4757.method1028(-103);
	if (arg2 > 1)
	    Class131_Sub2_Sub35.aClass130_6044.method1183(0);
	Class131_Sub2_Sub35.aClass130_6044.method1217(0, null);
    }
    
    public static String method210(byte arg0, Throwable arg1)
	throws IOException {
	try {
	    anInt134++;
	    String string;
	    if (!(arg1 instanceof RuntimeException_Sub1))
		string = "";
	    else {
		RuntimeException_Sub1 runtimeexception_sub1
		    = (RuntimeException_Sub1) arg1;
		string = runtimeexception_sub1.aString3245 + " | ";
		arg1 = runtimeexception_sub1.aThrowable3237;
	    }
	    StringWriter stringwriter = new StringWriter();
	    PrintWriter printwriter = new PrintWriter(stringwriter);
	    arg1.printStackTrace(printwriter);
	    printwriter.close();
	    String string_8_ = stringwriter.toString();
	    BufferedReader bufferedreader
		= new BufferedReader(new StringReader(string_8_));
	    String string_9_ = bufferedreader.readLine();
	    if (arg0 <= 99)
		anIntArray132 = null;
	    for (;;) {
		String string_10_ = bufferedreader.readLine();
		if (string_10_ == null)
		    break;
		int i = string_10_.indexOf('(');
		int i_11_ = string_10_.indexOf(')', 1 + i);
		String string_12_;
		if ((i ^ 0xffffffff) != 0)
		    string_12_ = string_10_.substring(0, i);
		else
		    string_12_ = string_10_;
		string_12_ = string_12_.trim();
		string_12_
		    = string_12_.substring(string_12_.lastIndexOf(' ') - -1);
		string_12_
		    = string_12_.substring(1 + string_12_.lastIndexOf('\t'));
		string += string_12_;
		if (i != -1 && i_11_ != -1) {
		    int i_13_ = string_10_.indexOf(".java:", i);
		    if (i_13_ >= 0)
			string += string_10_.substring(5 + i_13_, i_11_);
		}
		string += ' ';
	    }
	    string += "| " + (String) string_9_;
	    return string;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public static void method211(byte arg0) {
	try {
	    anInt129++;
	    synchronized (Class23_Sub4_Sub2.aClass214_5366) {
		if (arg0 != 40)
		    method212(44);
		Class23_Sub4_Sub2.aClass214_5366.method2783(arg0 + -115);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ba.E(" + arg0 + ')');
	}
    }
    
    public static void method212(int arg0) {
	try {
	    aString130 = null;
	    if (arg0 != 1)
		aString130 = null;
	    anIntArray132 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ba.D(" + arg0 + ')');
	}
    }
    
    public static void method213(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	anInt133++;
	for (int i = 0;
	     (Class131_Sub29.anInt4514 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    Rectangle rectangle = Class98.aRectangleArray1305[i];
	    if (rectangle.width + rectangle.x > arg0
		&& rectangle.x < arg3 + arg0
		&& arg2 < rectangle.height + rectangle.y
		&& (arg1 + arg2 ^ 0xffffffff) < (rectangle.y ^ 0xffffffff))
		Class131_Sub41_Sub16.aBooleanArray6371[i] = true;
	}
	if (arg4 >= -71)
	    method209(null, -113, 99, null, 41, 122, 85, null, null, null,
		      null, null, null, 21, (byte) 58, 5, 67, false);
    }
}
