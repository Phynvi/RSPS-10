/* Class131_Sub41_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub3 extends Class131_Sub41
{
    public Class23_Sub4_Sub4 aClass23_Sub4_Sub4_6192;
    public static int anInt6193 = -1;
    public static int anInt6194;
    
    public static void method1935(int arg0, String arg1) {
	try {
	    anInt6194++;
	    if (arg0 == 17923 && arg1 != null) {
		if (((Class33.anInt469 ^ 0xffffffff) <= -101
		     && !Class131_Sub2_Sub1.aBoolean5570)
		    || (Class33.anInt469 ^ 0xffffffff) <= -201)
		    Class186.method2562(Class131_Sub18.aString4387, (byte) 53);
		else {
		    String string = Class192.method2622((byte) 106, arg1);
		    if (string != null) {
			for (int i = 0; i < Class33.anInt469; i++) {
			    String string_0_
				= Class192.method2622((byte) 96,
						      (Class23_Sub2
						       .aStringArray3707[i]));
			    if (string_0_ != null
				&& string_0_.equals(string)) {
				Class186.method2562(arg1 + (Class121_Sub2
							    .aString3989),
						    (byte) 53);
				return;
			    }
			    if (Class131_Sub25.aStringArray4477[i] != null) {
				String string_1_
				    = Class192.method2622((byte) 82,
							  (Class131_Sub25
							   .aStringArray4477
							   [i]));
				if (string_1_ != null
				    && string_1_.equals(string)) {
				    Class186.method2562(arg1 + (Class121_Sub2
								.aString3989),
							(byte) 53);
				    return;
				}
			    }
			}
			for (int i = 0;
			     ((i ^ 0xffffffff)
			      > (Class118.anInt1551 ^ 0xffffffff));
			     i++) {
			    String string_2_
				= Class192.method2622((byte) 118,
						      (Class89.aStringArray3255
						       [i]));
			    if (string_2_ != null
				&& string_2_.equals(string)) {
				Class186.method2562((Class131_Sub8.aString4184
						     + arg1
						     + (Class131_Sub11
							.aString4238)),
						    (byte) 53);
				return;
			    }
			    if (Class23_Sub1_Sub1.aStringArray5090[i]
				!= null) {
				String string_3_
				    = Class192.method2622((byte) 47,
							  (Class23_Sub1_Sub1
							   .aStringArray5090
							   [i]));
				if (string_3_ != null
				    && string_3_.equals(string)) {
				    Class186.method2562(((Class131_Sub8
							  .aString4184)
							 + arg1
							 + (Class131_Sub11
							    .aString4238)),
							(byte) 53);
				    return;
				}
			    }
			}
			if (Class192.method2622((byte) 109, (Class166.aClass23_Sub4_Sub1_Sub2_2216.aString6491)).equals(string))
			    Class186.method2562(Class53.aString706, (byte) 53);
			else {
			    Class131_Sub23.anInt4453++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(226);
			    Class93.aClass131_Sub15_Sub2_1226.writeByte(Class131_Sub30.method1856((byte) -115, arg1));
			    Class93.aClass131_Sub15_Sub2_1226.writeString(arg1, (byte) 40);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("eo.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public Class131_Sub41_Sub3(Class23_Sub4_Sub4 arg0) {
	try {
	    aClass23_Sub4_Sub4_6192 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("eo.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
