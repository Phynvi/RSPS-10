/* Class131_Sub41_Sub21_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class131_Sub41_Sub21_Sub1 extends Class131_Sub41_Sub21
{
    public byte aByte6575;
    public Stream aStream_6576;
    public static int anInt6577;
    public static int anInt6578;
    public static int anInt6579;
    public static CRC32 aCRC32_6580 = new CRC32();
    public static int anInt6581;
    public int anInt6582;
    public static Class158 aClass158_6583;

    public int method2075(int arg0) {
	try {
	    anInt6581++;
	    if (aStream_6576 == null)
		return 0;
	    if (arg0 != 2)
		return -75;
	    return (100 * aStream_6576.offset
		    / (aStream_6576.data.length
		       - aByte6575));
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ag.A(" + arg0 + ')');
	}
    }
    
    public static void method2078(int arg0, int arg1, int arg2) {
	Class147 class147 = (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972
			     [arg0][arg1][arg2]);
	if (class147 != null) {
	    if (class147.aClass23_Sub2_1972 != null)
		class147.aClass23_Sub2_1972 = null;
	    if (class147.aClass23_Sub2_1951 != null)
		class147.aClass23_Sub2_1951 = null;
	}
    }
    
    public static void method2079(int arg0) {
	try {
	    aCRC32_6580 = null;
	    if (arg0 == 0)
		aClass158_6583 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ag.D(" + arg0 + ')');
	}
    }
    
    public byte[] method2073(int arg0) {
	try {
	    anInt6579++;
	    if (aBoolean6440
		|| ((aStream_6576.offset ^ 0xffffffff)
		    > (-aByte6575 + aStream_6576.data.length
		       ^ 0xffffffff)))
		throw new RuntimeException();
	    if (arg0 != 6)
		anInt6582 = 10;
	    return aStream_6576.data;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"ag.C(" + arg0 + ')');
	}
    }
    
    public static String method2080(int arg0, long arg1) {
	try {
	    anInt6578++;
	    if ((arg1 ^ 0xffffffffffffffffL) >= -1L
		|| (arg1 ^ 0xffffffffffffffffL) <= -6582952005840035282L)
		return null;
	    if (arg1 % 37L == 0L)
		return null;
	    int i = 0;
	    if (arg0 != 31013)
		return null;
	    for (long l = arg1; (l ^ 0xffffffffffffffffL) != -1L; l /= 37L)
		i++;
	    StringBuffer stringbuffer = new StringBuffer(i);
	    while (arg1 != 0L) {
		long l = arg1;
		arg1 /= 37L;
		stringbuffer.append(Class131_Sub9.aCharArray4215
				    [(int) (-(arg1 * 37L) + l)]);
	    }
	    return stringbuffer.reverse().toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("ag.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
