/* Class1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class1_Sub2 extends Class1
{
    public static int anInt3497;
    public static Clipboard aClipboard3498;
    public static int anInt3499;
    public Class1_Sub5[] aClass1_Sub5Array3500;
    public int anInt3501;
    public static int anInt3502;
    public Class23 aClass23_3503;
    public int anInt3504;
    public static int anInt3505;
    public static int anInt3506;
    public static int anInt3507;
    public int anInt3508;
    public static String[] aStringArray3509 = new String[5];
    public static String aString3510 = "level: ";
    public static int anInt3511 = 0;
    
    public static void method97(byte arg0) {
	try {
	    if (arg0 != 26)
		method104(null, 64, 23, -17);
	    aStringArray3509 = null;
	    aClipboard3498 = null;
	    aString3510 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"g.G(" + arg0 + ')');
	}
    }
    
    public static void method98(int arg0, int arg1, byte arg2) {
	try {
	    anInt3499++;
	    Class146.anInt1940 = arg1 - Class127.anInt1728;
	    if (arg2 < 93)
		method97((byte) -34);
	    Class189.anInt2768 = -Class127.anInt1725 + arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("g.A(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public static boolean method99(int arg0, byte arg1) {
	try {
	    anInt3507++;
	    if (arg1 >= -101)
		method100(true);
	    if ((arg0 ^ 0xffffffff) == -38 || arg0 == 45
		|| (arg0 ^ 0xffffffff) == -48 || arg0 == 33
		|| (arg0 ^ 0xffffffff) == -1012)
		return true;
	    if (arg0 == 12 || (arg0 ^ 0xffffffff) == -45 || arg0 == 1009)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("g.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method100(boolean arg0) {
	if ((Class84.anInt1101 ^ 0xffffffff) > -103)
	    Class84.anInt1101 += 6;
	anInt3497++;
	if (anInt3511 != 0) {
	    Class157.anInt2077 -= anInt3511 * 5;
	    anInt3511 = 0;
	    if (Class110.anInt1431 > Class157.anInt2077) {
		if ((Class157.anInt2077 ^ 0xffffffff) > -1)
		    Class157.anInt2077 = 0;
	    } else
		Class157.anInt2077 = -1 + Class110.anInt1431;
	}
	for (int i = 0; Class22.anInt246 > i; i++) {
	    int i_0_ = Class131_Sub2_Sub7.anIntArray5640[i];
	    char c = (char) Class60.anIntArray789[i];
	    if ((i_0_ ^ 0xffffffff) == -85)
		Class131_Sub1_Sub1.method1370(0);
	    else if (Class131_Sub2_Sub39.aBooleanArray6080[82] && i_0_ == 66) {
		if (aClipboard3498 != null) {
		    String string = "";
		    for (int i_1_ = -1 + (Class131_Sub41_Sub7
					  .aStringArray6253).length;
			 i_1_ >= 0; i_1_--) {
			if (Class131_Sub41_Sub7.aStringArray6253[i_1_] != null
			    && (Class131_Sub41_Sub7.aStringArray6253[i_1_]
				    .length()
				^ 0xffffffff) < -1)
			    string
				+= (Class131_Sub41_Sub7.aStringArray6253[i_1_]
				    + '\n');
		    }
		    aClipboard3498.setContents(new StringSelection(string),
					       null);
		}
	    } else if (Class131_Sub2_Sub39.aBooleanArray6080[82]
		       && i_0_ == 67) {
		if (aClipboard3498 != null) {
		    Transferable transferable
			= aClipboard3498.getContents(null);
		    if (transferable != null) {
			try {
			    String string
				= (String) (transferable.getTransferData
					    (DataFlavor.stringFlavor));
			    if (string != null) {
				String[] strings
				    = (Class131_Sub41_Sub21.method2077
				       ((byte) 102, string, '\n'));
				if ((strings.length ^ 0xffffffff) < -2) {
				    for (int i_2_ = 0;
					 ((i_2_ ^ 0xffffffff)
					  > (strings.length ^ 0xffffffff));
					 i_2_++) {
					Class23_Sub1_Sub1.aString5085
					    = strings[i_2_];
					Class131_Sub1_Sub1.method1370(0);
				    }
				} else
				    Class23_Sub1_Sub1.aString5085
					+= (String) string;
			    }
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		}
	    } else if (i_0_ == 85 && Class128_Sub1.anInt4014 > 0) {
		Class23_Sub1_Sub1.aString5085
		    = (Class23_Sub1_Sub1.aString5085
			   .substring(0, -1 + Class128_Sub1.anInt4014)
		       + Class23_Sub1_Sub1.aString5085
			     .substring(Class128_Sub1.anInt4014));
		Class128_Sub1.anInt4014--;
	    } else if ((i_0_ ^ 0xffffffff) != -102
		       || ((Class128_Sub1.anInt4014 ^ 0xffffffff)
			   <= (Class23_Sub1_Sub1.aString5085.length()
			       ^ 0xffffffff))) {
		if ((i_0_ ^ 0xffffffff) == -97
		    && (Class128_Sub1.anInt4014 ^ 0xffffffff) < -1)
		    Class128_Sub1.anInt4014--;
		else if ((i_0_ ^ 0xffffffff) != -98
			 || (Class128_Sub1.anInt4014
			     >= Class23_Sub1_Sub1.aString5085.length())) {
		    if ((i_0_ ^ 0xffffffff) != -103) {
			if (i_0_ == 103)
			    Class128_Sub1.anInt4014
				= Class23_Sub1_Sub1.aString5085.length();
			else if ((i_0_ ^ 0xffffffff) != -105
				 || ((Class131_Sub41_Sub7
				      .aStringArray6253).length
				     <= Class131_Sub41_Sub4.anInt6204)) {
			    if (i_0_ == 105 && (Class131_Sub41_Sub4.anInt6204
						^ 0xffffffff) < -1) {
				Class131_Sub41_Sub4.anInt6204--;
				Class64.method674(0);
				Class128_Sub1.anInt4014
				    = Class23_Sub1_Sub1.aString5085.length();
			    } else if (Class63.method661(c, 18768)
				       || (c ^ 0xffffffff) == -59
				       || (c ^ 0xffffffff) == -45 || c == 32
				       || c == 95 || (c ^ 0xffffffff) == -46
				       || (c ^ 0xffffffff) == -44) {
				Class23_Sub1_Sub1.aString5085
				    = ((Class23_Sub1_Sub1.aString5085.substring
					(0, Class128_Sub1.anInt4014))
				       + (char) Class60.anIntArray789[i]
				       + (Class23_Sub1_Sub1.aString5085
					      .substring
					  (Class128_Sub1.anInt4014)));
				Class128_Sub1.anInt4014++;
			    }
			} else {
			    Class131_Sub41_Sub4.anInt6204++;
			    Class64.method674(0);
			    Class128_Sub1.anInt4014
				= Class23_Sub1_Sub1.aString5085.length();
			}
		    } else
			Class128_Sub1.anInt4014 = 0;
		} else
		    Class128_Sub1.anInt4014++;
	    } else
		Class23_Sub1_Sub1.aString5085
		    = (Class23_Sub1_Sub1.aString5085
			   .substring(0, Class128_Sub1.anInt4014)
		       + Class23_Sub1_Sub1.aString5085
			     .substring(1 + Class128_Sub1.anInt4014));
	}
	Class22.anInt246 = 0;
	for (int i = 0; i < 100; i++) {
	    if (!Class197.aBooleanArray2880[i]) {
		Class131_Sub2_Sub1.anIntArray5571[i]--;
		if (Class131_Sub2_Sub1.anIntArray5571[i] < 0) {
		    Class131_Sub30.anIntArray4517[i]
			= (int) ((double) Class131_Sub1_Sub1.anInt5499
				 * Math.random());
		    Class23_Sub2_Sub2.anIntArray5167[i]
			= (int) (Math.random() * 350.0);
		    Class131_Sub2_Sub1.anIntArray5571[i] = 0;
		    Class197.aBooleanArray2880[i] = true;
		}
	    } else {
		Class131_Sub2_Sub1.anIntArray5571[i]++;
		if (Class131_Sub2_Sub1.anIntArray5571[i] > 102)
		    Class197.aBooleanArray2880[i] = false;
	    }
	}
	Class131_Sub2_Sub16.method1548((byte) -125);
	if (arg0 != false)
	    method98(121, 83, (byte) -6);
    }
    
    public static void method101(int arg0, int arg1, int arg2) {
	boolean bool
	    = ((Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[0][arg1][arg2]
		!= null)
	       && (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[0][arg1]
		   [arg2].aClass147_1952) != null);
	for (int i = arg0; i >= 0; i--) {
	    if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[i][arg1][arg2]
		== null) {
		Class147 class147
		    = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972[i]
			   [arg1][arg2]
		       = new Class147(i, arg1, arg2));
		if (bool)
		    class147.aByte1965++;
	    }
	}
    }
    
    public boolean method102(Class130 arg0, byte arg1, int arg2, int arg3) {
	try {
	    if (arg1 <= 62)
		method101(68, -35, 106);
	    anInt3505++;
	    if (aClass1_Sub5Array3500 != null) {
		for (int i = 0; i < aClass1_Sub5Array3500.length; i++) {
		    if (aClass1_Sub5Array3500[i].method110(arg2, arg3)
			&& aClass23_3503.method287(arg3, arg0, arg2, 26))
			return true;
		}
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("g.B("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method103(Class138 arg0, int arg1, int arg2, int arg3) {
	int i = Class64.anIntArrayArrayArray810[arg1][arg2][arg3];
	int i_3_ = 0;
	arg0.anInt1852 = 0;
	for (/**/; i_3_ <= 24; i_3_ += 8) {
	    int i_4_ = i >> i_3_ & 0xff;
	    if (i_4_ <= 0)
		break;
	    arg0.aClass131_Sub8_Sub1Array1851[arg0.anInt1852++]
		= Class131_Sub2_Sub11.aClass131_Sub8_Sub1Array5707[i_4_ - 1];
	}
	for (int i_5_ = arg0.anInt1852; i_5_ < 4; i_5_++)
	    arg0.aClass131_Sub8_Sub1Array1851[i_5_] = null;
    }
    
    public static void method104(Class173 arg0, int arg1, int arg2, int arg3) {
	anInt3502++;
	if (Class22_Sub1.aClass173_3666 == null
	    && !Class131_Sub2_Sub24.aBoolean5890
	    && (arg0 != null
		&& Class131_Sub2.method1465((byte) -128, arg0) != null)) {
	    Class22_Sub1.aClass173_3666 = arg0;
	    Class23_Sub4_Sub1_Sub2.aClass173_6520
		= Class131_Sub2.method1465((byte) 64, arg0);
	    Class9.anInt120 = 0;
	    Class1_Sub7_Sub1.anInt5212 = arg2;
	    RuntimeException_Sub1.anInt3243 = arg1;
	    Class131_Sub9.aBoolean4216 = false;
	    if (arg3 >= -68)
		aClipboard3498 = null;
	}
    }
}
