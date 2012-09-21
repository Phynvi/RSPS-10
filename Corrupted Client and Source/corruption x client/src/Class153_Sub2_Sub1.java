/* Class153_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class153_Sub2_Sub1 extends Class153_Sub2
{
    public byte[] aByteArray6454;
    
    public Class153_Sub2_Sub1() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    public void method2239(int arg0, byte arg1) {
	int i = arg0 * 2;
	int i_0_ = arg1 & 0xff;
	aByteArray6454[i++] = (byte) (3 * i_0_ >> 5);
	aByteArray6454[i] = (byte) (3 * i_0_ >> 5);
    }
    
    public byte[] method2241(int arg0, int arg1, int arg2) {
	aByteArray6454 = new byte[arg0 * arg1 * arg2 * 2];
	method2229(arg2, false, arg1, arg0);
	return aByteArray6454;
    }
}
