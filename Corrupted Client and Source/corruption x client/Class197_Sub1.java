/* Class197_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class197_Sub1 extends Class197
{
    public ByteBuffer aByteBuffer4967;
    
    public byte[] method2678(byte arg0) {
	byte[] is;
	try {
	    if (arg0 != -45)
		return null;
	    byte[] is_0_ = new byte[aByteBuffer4967.capacity()];
	    aByteBuffer4967.position(0);
	    aByteBuffer4967.get(is_0_);
	    is = is_0_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return is;
    }
    
    public void method2676(byte[] arg0, int arg1) {
	aByteBuffer4967 = ByteBuffer.allocateDirect(arg0.length);
	if (arg1 > 76) {
	    aByteBuffer4967.position(0);
	    aByteBuffer4967.put(arg0);
	}
    }
}
