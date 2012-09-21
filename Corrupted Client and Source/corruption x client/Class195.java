/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class195
{
    public static short[] aShortArray2841;
    public short[] aShortArray2842;
    public short[] aShortArray2843;
    public static short[] aShortArray2844 = new short[500];
    public boolean aBoolean2845 = false;
    public static short[] aShortArray2846 = new short[500];
    public static byte[] aByteArray2847;
    public short[] aShortArray2848;
    public Class131_Sub17 aClass131_Sub17_2849 = null;
    public byte[] aByteArray2850;
    public short[] aShortArray2851;
    public short[] aShortArray2852;
    public static short[] aShortArray2853;
    public boolean aBoolean2854 = false;
    public static short[] aShortArray2855;
    public int anInt2856 = 0;
    
    public static void method2662() {
	aShortArray2855 = null;
	aShortArray2841 = null;
	aShortArray2853 = null;
	aShortArray2844 = null;
	aShortArray2846 = null;
	aByteArray2847 = null;
    }
    
    public Class195(byte[] arg0, Class131_Sub17 arg1) {
	aClass131_Sub17_2849 = arg1;
	try {
	    Stream stream = new Stream(arg0);
	    Stream stream_0_ = new Stream(arg0);
	    stream.offset = 2;
	    int i = stream.readUnsignedByte(-72);
	    int i_1_ = 0;
	    int i_2_ = -1;
	    int i_3_ = -1;
	    stream_0_.offset = stream.offset + i;
	    for (int i_4_ = 0; i_4_ < i; i_4_++) {
		int i_5_ = aClass131_Sub17_2849.anIntArray4375[i_4_];
		if (i_5_ == 0)
		    i_2_ = i_4_;
		int i_6_ = stream.readUnsignedByte(-122);
		if (i_6_ > 0) {
		    if (i_5_ == 0)
			i_3_ = i_4_;
		    aShortArray2855[i_1_] = (short) i_4_;
		    short i_7_ = 0;
		    if (i_5_ == 3)
			i_7_ = (short) 128;
		    if ((i_6_ & 0x1) != 0)
			aShortArray2841[i_1_]
			    = (short) stream_0_.method1775((byte) 35);
		    else
			aShortArray2841[i_1_] = i_7_;
		    if ((i_6_ & 0x2) != 0)
			aShortArray2853[i_1_]
			    = (short) stream_0_.method1775((byte) 35);
		    else
			aShortArray2853[i_1_] = i_7_;
		    if ((i_6_ & 0x4) != 0)
			aShortArray2844[i_1_]
			    = (short) stream_0_.method1775((byte) 35);
		    else
			aShortArray2844[i_1_] = i_7_;
		    aByteArray2847[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
		    if (i_5_ == 2) {
			aShortArray2841[i_1_]
			    = (short) (((aShortArray2841[i_1_] & 0xff) << 3)
				       + (aShortArray2841[i_1_] >> 8 & 0x7));
			aShortArray2853[i_1_]
			    = (short) (((aShortArray2853[i_1_] & 0xff) << 3)
				       + (aShortArray2853[i_1_] >> 8 & 0x7));
			aShortArray2844[i_1_]
			    = (short) (((aShortArray2844[i_1_] & 0xff) << 3)
				       + (aShortArray2844[i_1_] >> 8 & 0x7));
			aShortArray2841[i_1_] <<= 3;
			aShortArray2853[i_1_] <<= 3;
			aShortArray2844[i_1_] <<= 3;
		    }
		    aShortArray2846[i_1_] = (short) -1;
		    if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
			if (i_2_ > i_3_) {
			    aShortArray2846[i_1_] = (short) i_2_;
			    i_3_ = i_2_;
			}
		    } else if (i_5_ == 5)
			aBoolean2845 = true;
		    else if (i_5_ == 7)
			aBoolean2854 = true;
		    i_1_++;
		}
	    }
	    if (stream_0_.offset != arg0.length)
		throw new RuntimeException();
	    anInt2856 = i_1_;
	    aShortArray2843 = new short[i_1_];
	    aShortArray2851 = new short[i_1_];
	    aShortArray2842 = new short[i_1_];
	    aShortArray2848 = new short[i_1_];
	    aShortArray2852 = new short[i_1_];
	    aByteArray2850 = new byte[i_1_];
	    for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
		aShortArray2843[i_8_] = aShortArray2855[i_8_];
		aShortArray2851[i_8_] = aShortArray2841[i_8_];
		aShortArray2842[i_8_] = aShortArray2853[i_8_];
		aShortArray2848[i_8_] = aShortArray2844[i_8_];
		aShortArray2852[i_8_] = aShortArray2846[i_8_];
		aByteArray2850[i_8_] = aByteArray2847[i_8_];
	    }
	} catch (Exception exception) {
	    anInt2856 = 0;
	    aBoolean2845 = false;
	    aBoolean2854 = false;
	}
    }
    
    static {
	aShortArray2841 = new short[500];
	aShortArray2853 = new short[500];
	aByteArray2847 = new byte[500];
	aShortArray2855 = new short[500];
    }
}
