/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class170
{
    public Class36_Sub2 aClass36_Sub2_2270 = null;
    public Class36_Sub2 aClass36_Sub2_2271 = null;
    public Class36_Sub1[] aClass36_Sub1Array2272 = null;
    public static ByteBuffer aByteBuffer2273;
    public static ByteBuffer aByteBuffer2274;
    public Class36_Sub1[] aClass36_Sub1Array2275 = null;
    public boolean aBoolean2276;
    
    public static void method2440() {
	if (aByteBuffer2273 == null) {
	    Class153_Sub2_Sub1 class153_sub2_sub1 = new Class153_Sub2_Sub1();
	    byte[] is = class153_sub2_sub1.method2241(128, 128, 16);
	    aByteBuffer2273 = ByteBuffer.allocateDirect(is.length);
	    aByteBuffer2273.position(0);
	    aByteBuffer2273.put(is);
	    aByteBuffer2273.flip();
	}
	if (aByteBuffer2274 == null) {
	    Class153_Sub1_Sub1 class153_sub1_sub1 = new Class153_Sub1_Sub1();
	    byte[] is = class153_sub1_sub1.method2236(128, 128, 16);
	    aByteBuffer2274 = ByteBuffer.allocateDirect(is.length);
	    aByteBuffer2274.position(0);
	    aByteBuffer2274.put(is);
	    aByteBuffer2274.flip();
	}
    }
    
    public Class170(Class130_Sub2 arg0) {
	aBoolean2276 = arg0.aBoolean3333;
	method2440();
	if (!aBoolean2276) {
	    byte[] is = new byte[32768];
	    aClass36_Sub1Array2272 = new Class36_Sub1[16];
	    for (int i = 0; i < 16; i++) {
		aByteBuffer2273.get(is, 0, 32768);
		aClass36_Sub1Array2272[i]
		    = new Class36_Sub1(arg0, 3553, 6410, 128, 128, true, is,
				       6410, false);
	    }
	    aByteBuffer2273.position(0);
	    aClass36_Sub1Array2275 = new Class36_Sub1[16];
	    for (int i = 0; i < 16; i++) {
		aByteBuffer2274.get(is, 0, 32768);
		aClass36_Sub1Array2275[i]
		    = new Class36_Sub1(arg0, 3553, 6410, 128, 128, true, is,
				       6410, false);
	    }
	    aByteBuffer2274.position(0);
	} else {
	    byte[] is = new byte[524288];
	    aByteBuffer2273.get(is);
	    aByteBuffer2273.position(0);
	    aClass36_Sub2_2271
		= new Class36_Sub2(arg0, 6410, 128, 128, 16, is, 6410);
	    aByteBuffer2274.get(is);
	    aByteBuffer2274.position(0);
	    aClass36_Sub2_2270
		= new Class36_Sub2(arg0, 6410, 128, 128, 16, is, 6410);
	}
    }
}
