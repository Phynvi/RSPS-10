/* Class131_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub12_Sub1 extends Class131_Sub12
{
    public byte[] aByteArray6113;
    public int anInt6114;
    public int anInt6115;
    public boolean aBoolean6116;
    public int anInt6117;
    
    public Class131_Sub12_Sub1 method1700(Class71 arg0) {
	aByteArray6113 = arg0.method742(82, aByteArray6113);
	anInt6115 = arg0.method744(anInt6115, -73);
	if (anInt6117 == anInt6114)
	    anInt6117 = anInt6114 = arg0.method746(anInt6117, -128);
	else {
	    anInt6117 = arg0.method746(anInt6117, -128);
	    anInt6114 = arg0.method746(anInt6114, -128);
	    if (anInt6117 == anInt6114)
		anInt6117--;
	}
	return this;
    }
    
    public Class131_Sub12_Sub1(int arg0, byte[] arg1, int arg2, int arg3) {
	anInt6115 = arg0;
	aByteArray6113 = arg1;
	anInt6117 = arg2;
	anInt6114 = arg3;
    }
    
    public Class131_Sub12_Sub1(int arg0, byte[] arg1, int arg2, int arg3,
			       boolean arg4) {
	anInt6115 = arg0;
	aByteArray6113 = arg1;
	anInt6117 = arg2;
	anInt6114 = arg3;
	aBoolean6116 = arg4;
    }
}
