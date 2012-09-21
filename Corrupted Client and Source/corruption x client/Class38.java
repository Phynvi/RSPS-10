/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class38
{
    public Class130_Sub2 aClass130_Sub2_507;
    public ByteBuffer aByteBuffer508;
    
    public Class38(Class130_Sub2 arg0, byte[] arg1, int arg2) {
	aClass130_Sub2_507 = arg0;
	aByteBuffer508 = ByteBuffer.allocateDirect(arg2);
	if (arg1 != null)
	    aByteBuffer508.put(arg1, 0, arg2);
	aByteBuffer508.flip();
    }
    
    public void method500(byte[] arg0, int arg1) {
	if (aByteBuffer508 == null || aByteBuffer508.capacity() < arg1)
	    aByteBuffer508 = ByteBuffer.allocateDirect(arg1);
	else
	    aByteBuffer508.clear();
	aByteBuffer508.put(arg0, 0, arg1);
	aByteBuffer508.flip();
    }
    
    public Class38(Class130_Sub2 arg0, ByteBuffer arg1) {
	aClass130_Sub2_507 = arg0;
	aByteBuffer508 = arg1;
    }
}
