/* Class153_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class153_Sub1_Sub1 extends Class153_Sub1
{
    public byte[] aByteArray6453;
    
    public Class153_Sub1_Sub1() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    public byte[] method2236(int arg0, int arg1, int arg2) {
	aByteArray6453 = new byte[arg0 * arg1 * arg2 * 2];
	method2229(arg2, false, arg1, arg0);
	return aByteArray6453;
    }
    
    public void method2232(int arg0, byte arg1) {
	int i = arg0 * 2;
	arg1 = (byte) (127 + ((arg1 & 0xff) >> 1));
	aByteArray6453[i++] = arg1;
	aByteArray6453[i] = arg1;
    }
}
