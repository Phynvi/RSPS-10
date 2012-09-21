/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class150
{
    public int anInt1992;
    public Class83 aClass83_1993;
    public static Class158 aClass158_1994;
    public int anInt1995;
    public static int anInt1996;
    public int anInt1997;
    public float aFloat1998;
    public int anInt1999;
    public float aFloat2000 = 1.0F;
    public int anInt2001;
    public static int anInt2002;
    public int anInt2003;
    public float aFloat2004;
    public static int anInt2005;
    public static int anInt2006;
    public float aFloat2007 = 0.25F;
    public float aFloat2008;
    public float aFloat2009;
    
    public boolean method2186(Class150 arg0, byte arg1) {
	try {
	    anInt1996++;
	    if (arg1 != -7)
		anInt1992 = -32;
	    if (arg0.anInt1992 != anInt1992 || arg0.aFloat2008 != aFloat2008
		|| arg0.aFloat2009 != aFloat2009
		|| arg0.aFloat2004 != aFloat2004
		|| aFloat2007 != arg0.aFloat2007
		|| arg0.aFloat2000 != aFloat2000
		|| arg0.aFloat1998 != aFloat1998 || anInt1999 != arg0.anInt1999
		|| anInt2001 != arg0.anInt2001
		|| arg0.aClass83_1993 != aClass83_1993)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pp.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public void method2187(int arg0, Stream arg1) {
	try {
	    aFloat2000 = (float) (arg1.readUnsignedByte(112) * 8) / 255.0F;
	    anInt2006++;
	    aFloat2007 = (float) (arg1.readUnsignedByte(-122) * 8) / 255.0F;
	    aFloat1998 = (float) (arg1.readUnsignedByte(123) * arg0) / 255.0F;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pp.C(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static int method2188(byte arg0) {
	try {
	    if (arg0 != 21)
		method2188((byte) -11);
	    anInt2002++;
	    return 6;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pp.A(" + arg0 + ')');
	}
    }
    
    public static void method2189(int arg0) {
	aClass158_1994 = null;
	if (arg0 < 71)
	    method2188((byte) -24);
    }
    
    public Class150() {
	aFloat1998 = 1.0F;
	try {
	    anInt2003 = -60;
	    anInt1997 = -50;
	    anInt1999 = Class131_Sub25.anInt4479;
	    anInt1995 = -50;
	    aClass83_1993 = Class88.aClass83_1170;
	    aFloat2004 = 1.2F;
	    aFloat2008 = 1.1523438F;
	    anInt2001 = 0;
	    anInt1992 = Class131_Sub41_Sub8.anInt6268;
	    aFloat2009 = 0.69921875F;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"pp.<init>(" + ')');
	}
    }
    
    public Class150(Stream arg0) {
	aFloat1998 = 1.0F;
	try {
	    int i = arg0.readUnsignedByte(122);
	    if (Class167.aBoolean2235
		&& (Class214.aClass130_3128.method1165() ^ 0xffffffff) < -1) {
		if ((i & 0x1) != 0)
		    anInt1992 = arg0.readUnsignedInt(-2);
		else
		    anInt1992 = Class131_Sub41_Sub8.anInt6268;
		if ((0x2 & i) == 0)
		    aFloat2008 = 1.1523438F;
		else
		    aFloat2008 = (float) arg0.readUnsignedShort(8104) / 256.0F;
		if ((0x4 & i ^ 0xffffffff) != -1)
		    aFloat2009 = (float) arg0.readUnsignedShort(8104) / 256.0F;
		else
		    aFloat2009 = 0.69921875F;
		if ((i & 0x8 ^ 0xffffffff) == -1)
		    aFloat2004 = 1.2F;
		else
		    aFloat2004 = (float) arg0.readUnsignedShort(8104) / 256.0F;
	    } else {
		if ((i & 0x1 ^ 0xffffffff) != -1)
		    arg0.readUnsignedInt(-2);
		if ((0x2 & i) != 0)
		    arg0.readUnsignedShort(8104);
		if ((i & 0x4 ^ 0xffffffff) != -1)
		    arg0.readUnsignedShort(8104);
		if ((i & 0x8) != 0)
		    arg0.readUnsignedShort(8104);
		aFloat2004 = 1.2F;
		aFloat2009 = 0.69921875F;
		anInt1992 = Class131_Sub41_Sub8.anInt6268;
		aFloat2008 = 1.1523438F;
	    }
	    if ((0x10 & i ^ 0xffffffff) != -1) {
		anInt1995 = arg0.readSignedShort(1625554944);
		anInt2003 = arg0.readSignedShort(1625554944);
		anInt1997 = arg0.readSignedShort(1625554944);
	    } else {
		anInt1995 = -50;
		anInt2003 = -60;
		anInt1997 = -50;
	    }
	    if ((0x20 & i ^ 0xffffffff) != -1)
		anInt1999 = arg0.readUnsignedInt(-2);
	    else
		anInt1999 = Class131_Sub25.anInt4479;
	    if ((i & 0x40 ^ 0xffffffff) != -1)
		anInt2001 = arg0.readUnsignedShort(8104);
	    else
		anInt2001 = 0;
	    if ((0x80 & i) == 0)
		aClass83_1993 = Class88.aClass83_1170;
	    else
		aClass83_1993
		    = Class135.method2101((byte) -17, arg0.readUnsignedShort(8104),
					  arg0.readUnsignedShort(8104),
					  arg0.readUnsignedShort(8104),
					  arg0.readUnsignedShort(8104),
					  arg0.readUnsignedShort(8104),
					  arg0.readUnsignedShort(8104));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("pp.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
}
