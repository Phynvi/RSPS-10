/* Class131_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub26 extends Class131
{
    public Class180 aClass180_4481;
    public byte[] aByteArray4482;
    
    public static Class131_Sub26 method1832(Class158 arg0, int arg1,
					    int arg2) {
	byte[] is = arg0.method2364(arg2, arg1, 0);
	if (is == null)
	    return null;
	return new Class131_Sub26(new Stream(is));
    }
    
    public void method1833() {
	if (aClass180_4481 == null) {
	    aClass180_4481 = new Class180(16);
	    int[] is = new int[16];
	    int[] is_0_ = new int[16];
	    is[9] = is_0_[9] = 128;
	    Class114 class114 = new Class114(aByteArray4482);
	    int i = class114.method973();
	    for (int i_1_ = 0; i_1_ < i; i_1_++) {
		class114.method976(i_1_);
		class114.method971(i_1_);
		class114.method972(i_1_);
	    }
	while_215_:
	    for (;;) {
		int i_2_ = class114.method975();
		int i_3_ = class114.anIntArray1468[i_2_];
		while (class114.anIntArray1468[i_2_] == i_3_) {
		    class114.method976(i_2_);
		    int i_4_ = class114.method970(i_2_);
		    if (i_4_ == 1) {
			class114.method967();
			class114.method972(i_2_);
			if (!class114.method966())
			    break;
			break while_215_;
		    }
		    int i_5_ = i_4_ & 0xf0;
		    if (i_5_ == 176) {
			int i_6_ = i_4_ & 0xf;
			int i_7_ = i_4_ >> 8 & 0x7f;
			int i_8_ = i_4_ >> 16 & 0x7f;
			if (i_7_ == 0)
			    is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
			if (i_7_ == 32)
			    is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
		    }
		    if (i_5_ == 192) {
			int i_9_ = i_4_ & 0xf;
			int i_10_ = i_4_ >> 8 & 0x7f;
			is_0_[i_9_] = is[i_9_] + i_10_;
		    }
		    if (i_5_ == 144) {
			int i_11_ = i_4_ & 0xf;
			int i_12_ = i_4_ >> 8 & 0x7f;
			int i_13_ = i_4_ >> 16 & 0x7f;
			if (i_13_ > 0) {
			    int i_14_ = is_0_[i_11_];
			    Class131_Sub22 class131_sub22
				= ((Class131_Sub22)
				   aClass180_4481.method2521(-43,
							     (long) i_14_));
			    if (class131_sub22 == null) {
				class131_sub22
				    = new Class131_Sub22(new byte[128]);
				aClass180_4481.method2523(false, (long) i_14_,
							  class131_sub22);
			    }
			    class131_sub22.aByteArray4447[i_12_] = (byte) 1;
			}
		    }
		    class114.method971(i_2_);
		    class114.method972(i_2_);
		}
	    }
	}
    }
    
    public Class131_Sub26(Stream arg0) {
	arg0.offset = arg0.data.length - 3;
	int i = arg0.readUnsignedByte(-120);
	int i_15_ = arg0.readUnsignedShort(8104);
	int i_16_ = 14 + i * 10;
	arg0.offset = 0;
	int i_17_ = 0;
	int i_18_ = 0;
	int i_19_ = 0;
	int i_20_ = 0;
	int i_21_ = 0;
	int i_22_ = 0;
	int i_23_ = 0;
	int i_24_ = 0;
    while_213_:
	for (int i_25_ = 0; i_25_ < i; i_25_++) {
	    int i_26_ = -1;
	    for (;;) {
		int i_27_ = arg0.readUnsignedByte(-90);
		if (i_27_ != i_26_)
		    i_16_++;
		i_26_ = i_27_ & 0xf;
		if (i_27_ == 7)
		    continue while_213_;
		if (i_27_ == 23)
		    i_17_++;
		else if (i_26_ == 0)
		    i_19_++;
		else if (i_26_ == 1)
		    i_20_++;
		else if (i_26_ == 2)
		    i_18_++;
		else if (i_26_ == 3)
		    i_21_++;
		else if (i_26_ == 4)
		    i_22_++;
		else if (i_26_ == 5)
		    i_23_++;
		else {
		    if (i_26_ != 6)
			break;
		    i_24_++;
		}
	    }
	    throw new RuntimeException();
	}
	i_16_ += 5 * i_17_;
	i_16_ += 2 * (i_19_ + i_20_ + i_18_ + i_21_ + i_23_);
	i_16_ += i_22_ + i_24_;
	int i_28_ = arg0.offset;
	int i_29_ = (i + i_17_ + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_
		     + i_24_);
	for (int i_30_ = 0; i_30_ < i_29_; i_30_++)
	    arg0.method1739(true);
	i_16_ += arg0.offset - i_28_;
	int i_31_ = arg0.offset;
	int i_32_ = 0;
	int i_33_ = 0;
	int i_34_ = 0;
	int i_35_ = 0;
	int i_36_ = 0;
	int i_37_ = 0;
	int i_38_ = 0;
	int i_39_ = 0;
	int i_40_ = 0;
	int i_41_ = 0;
	int i_42_ = 0;
	int i_43_ = 0;
	int i_44_ = 0;
	for (int i_45_ = 0; i_45_ < i_18_; i_45_++) {
	    i_44_ = i_44_ + arg0.readUnsignedByte(99) & 0x7f;
	    if (i_44_ == 0 || i_44_ == 32)
		i_24_++;
	    else if (i_44_ == 1)
		i_32_++;
	    else if (i_44_ == 33)
		i_33_++;
	    else if (i_44_ == 7)
		i_34_++;
	    else if (i_44_ == 39)
		i_35_++;
	    else if (i_44_ == 10)
		i_36_++;
	    else if (i_44_ == 42)
		i_37_++;
	    else if (i_44_ == 99)
		i_38_++;
	    else if (i_44_ == 98)
		i_39_++;
	    else if (i_44_ == 101)
		i_40_++;
	    else if (i_44_ == 100)
		i_41_++;
	    else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120 || i_44_ == 121
		     || i_44_ == 123)
		i_42_++;
	    else
		i_43_++;
	}
	int i_46_ = 0;
	int i_47_ = arg0.offset;
	arg0.offset += i_42_;
	int i_48_ = arg0.offset;
	arg0.offset += i_23_;
	int i_49_ = arg0.offset;
	arg0.offset += i_22_;
	int i_50_ = arg0.offset;
	arg0.offset += i_21_;
	int i_51_ = arg0.offset;
	arg0.offset += i_32_;
	int i_52_ = arg0.offset;
	arg0.offset += i_34_;
	int i_53_ = arg0.offset;
	arg0.offset += i_36_;
	int i_54_ = arg0.offset;
	arg0.offset += i_19_ + i_20_ + i_23_;
	int i_55_ = arg0.offset;
	arg0.offset += i_19_;
	int i_56_ = arg0.offset;
	arg0.offset += i_43_;
	int i_57_ = arg0.offset;
	arg0.offset += i_20_;
	int i_58_ = arg0.offset;
	arg0.offset += i_33_;
	int i_59_ = arg0.offset;
	arg0.offset += i_35_;
	int i_60_ = arg0.offset;
	arg0.offset += i_37_;
	int i_61_ = arg0.offset;
	arg0.offset += i_24_;
	int i_62_ = arg0.offset;
	arg0.offset += i_21_;
	int i_63_ = arg0.offset;
	arg0.offset += i_38_;
	int i_64_ = arg0.offset;
	arg0.offset += i_39_;
	int i_65_ = arg0.offset;
	arg0.offset += i_40_;
	int i_66_ = arg0.offset;
	arg0.offset += i_41_;
	int i_67_ = arg0.offset;
	arg0.offset += i_17_ * 3;
	aByteArray4482 = new byte[i_16_];
	Stream stream = new Stream(aByteArray4482);
	stream.writeInt(1297377380);
	stream.writeInt(6);
	stream.writeShort(i > 1 ? 1 : 0);
	stream.writeShort(i);
	stream.writeShort(i_15_);
	arg0.offset = i_28_;
	int i_68_ = 0;
	int i_69_ = 0;
	int i_70_ = 0;
	int i_71_ = 0;
	int i_72_ = 0;
	int i_73_ = 0;
	int i_74_ = 0;
	int[] is = new int[128];
	i_44_ = 0;
	for (int i_75_ = 0; i_75_ < i; i_75_++) {
	    stream.writeInt(1297379947);
	    stream.offset += 4;
	    int i_76_ = stream.offset;
	    int i_77_ = -1;
	while_214_:
	    do {
		for (;;) {
		    int i_78_ = arg0.method1739(true);
		    stream.method1781((byte) -55, i_78_);
		    int i_79_ = arg0.data[i_46_++] & 0xff;
		    boolean bool = i_79_ != i_77_;
		    i_77_ = i_79_ & 0xf;
		    if (i_79_ == 7) {
			if (bool)
			    stream.writeByte(255);
			stream.writeByte(47);
			stream.writeByte(0);
			break while_214_;
		    }
		    if (i_79_ == 23) {
			if (bool)
			    stream.writeByte(255);
			stream.writeByte(81);
			stream.writeByte(3);
			stream
			    .writeByte(arg0.data[i_67_++]);
			stream
			    .writeByte(arg0.data[i_67_++]);
			stream
			    .writeByte(arg0.data[i_67_++]);
		    } else {
			i_68_ ^= i_79_ >> 4;
			if (i_77_ == 0) {
			    if (bool)
				stream.writeByte(144 + i_68_);
			    i_69_ += arg0.data[i_54_++];
			    i_70_ += arg0.data[i_55_++];
			    stream.writeByte(i_69_ & 0x7f);
			    stream.writeByte(i_70_ & 0x7f);
			} else if (i_77_ == 1) {
			    if (bool)
				stream.writeByte(128 + i_68_);
			    i_69_ += arg0.data[i_54_++];
			    i_71_ += arg0.data[i_57_++];
			    stream.writeByte(i_69_ & 0x7f);
			    stream.writeByte(i_71_ & 0x7f);
			} else if (i_77_ == 2) {
			    if (bool)
				stream.writeByte(176 + i_68_);
			    i_44_
				= i_44_ + arg0.data[i_31_++] & 0x7f;
			    stream.writeByte(i_44_);
			    int i_80_;
			    if (i_44_ == 0 || i_44_ == 32)
				i_80_ = arg0.data[i_61_++];
			    else if (i_44_ == 1)
				i_80_ = arg0.data[i_51_++];
			    else if (i_44_ == 33)
				i_80_ = arg0.data[i_58_++];
			    else if (i_44_ == 7)
				i_80_ = arg0.data[i_52_++];
			    else if (i_44_ == 39)
				i_80_ = arg0.data[i_59_++];
			    else if (i_44_ == 10)
				i_80_ = arg0.data[i_53_++];
			    else if (i_44_ == 42)
				i_80_ = arg0.data[i_60_++];
			    else if (i_44_ == 99)
				i_80_ = arg0.data[i_63_++];
			    else if (i_44_ == 98)
				i_80_ = arg0.data[i_64_++];
			    else if (i_44_ == 101)
				i_80_ = arg0.data[i_65_++];
			    else if (i_44_ == 100)
				i_80_ = arg0.data[i_66_++];
			    else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120
				     || i_44_ == 121 || i_44_ == 123)
				i_80_ = arg0.data[i_47_++];
			    else
				i_80_ = arg0.data[i_56_++];
			    i_80_ += is[i_44_];
			    is[i_44_] = i_80_;
			    stream.writeByte(i_80_ & 0x7f);
			} else if (i_77_ == 3) {
			    if (bool)
				stream.writeByte(224 + i_68_);
			    i_72_ += arg0.data[i_62_++];
			    i_72_ += arg0.data[i_50_++] << 7;
			    stream.writeByte(i_72_ & 0x7f);
			    stream.writeByte(i_72_ >> 7 & 0x7f);
			} else if (i_77_ == 4) {
			    if (bool)
				stream.writeByte(208 + i_68_);
			    i_73_ += arg0.data[i_49_++];
			    stream.writeByte(i_73_ & 0x7f);
			} else if (i_77_ == 5) {
			    if (bool)
				stream.writeByte(160 + i_68_);
			    i_69_ += arg0.data[i_54_++];
			    i_74_ += arg0.data[i_48_++];
			    stream.writeByte(i_69_ & 0x7f);
			    stream.writeByte(i_74_ & 0x7f);
			} else {
			    if (i_77_ != 6)
				break;
			    if (bool)
				stream.writeByte(192 + i_68_);
			    stream
				.writeByte(arg0.data[i_61_++]);
			}
		    }
		}
		throw new RuntimeException();
	    } while (false);
	    stream.method1744(stream.offset - i_76_, 65280);
	}
    }
    
    public void method1834() {
	aClass180_4481 = null;
    }
}
