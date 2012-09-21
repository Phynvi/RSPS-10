/* PacketParser - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class PacketParser extends Class131_Sub2
{
    public int anInt5868;
    public int anInt5869 = 12288;
    public static int anInt5870;
    public static long aLong5871;
    public static int anInt5872;
    public static int anInt5873;
    public int anInt5874;
    public int anInt5875;
    public static Class9 aClass9_5876;
    public static int anInt5877;
    public static int anInt5878 = 0;
    public int anInt5879 = 2048;
    public static int anInt5880;
    public static int anInt5881;
    public int anInt5882;
    public static int anInt5883;
    public static int anInt5884;
    public static int anInt5885;
    public static int anInt5886;
    public int anInt5887;
    public static int anInt5888;
    public static void dumpClipping() {
    	
    }
    
    public static void dumpClipping(int lol)
    {
        try {
      //Stream localStream = new Stream(new byte[1000000]);
      for (int i = 0; i < 3; ++i) {
        int[][] arrayOfInt =  Class131_Sub2_Sub9.aClass19Array5682[i].clipping;

        for (int j = 0; j < arrayOfInt.length; ++j)
          for (int k = 0; k < arrayOfInt[j].length; ++k) {
           /* localStream.writeByte(i);
            localStream.writeShort(j);
            localStream.writeShort(k);
            localStream.writeInt(arrayOfInt[j][k]);*/
        	  int objectx = j+Class92.regionX;
        	  int objecty = k+Class64.regionY;
          	  File file = new File("objects/" + objectx + "_" + objecty+"_"+i+".txt");
              if (!file.exists()) {
              BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
					bw.write("["+objectx+"]["+objecty+"]["+i+"] = "+arrayOfInt[j][k]+";");
                  bw.newLine();
                  bw.flush();
                  bw.close();
                  client.sendMessage("Dumped ["+objectx+"]["+objecty+"]["+i+"] = "+arrayOfInt[j][k]+";");
              }
        	  //client.sendMessage("["+objectx+"]["+objecty+"]["+i+"] = "+arrayOfInt[j][k]+";");
          }
      }
      try
      {
    /*    FileOutputStream localFileOutputStream = new FileOutputStream("RegionDump/map_" + Class92.regionX + "_" + Class64.regionY + ".dat");
        localFileOutputStream.write(localStream.data, 0, localStream.offset);
        localFileOutputStream.flush();
        localFileOutputStream.close();
        client.sendMessage("Done!");*/
      } catch (Exception localException) {
        client.sendMessage(localException.toString());
      }
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    public static void method1577(int arg0) {
	try {
	    if (arg0 <= 74)
		anInt5878 = -27;
	    aClass9_5876 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nh.K(" + arg0 + ')');
	}
    }
    
    public boolean method1578(int arg0, int arg1, boolean arg2) {
	try {
	    anInt5873++;
	    int i = (arg0 - arg1) * anInt5869 >> 134389036;
	    int i_0_ = (Class153_Sub1.anIntArray4763
			[(0xff16f & 255 * i) >> 572042828]);
	    i_0_ = (i_0_ << -1858518388) / anInt5869;
	    i_0_ = (i_0_ << 1681278732) / anInt5882;
	    if (arg2 != true)
		method1577(82);
	    i_0_ = i_0_ * anInt5887 >> 777738636;
	    if ((arg1 - -arg0 ^ 0xffffffff) <= (i_0_ ^ 0xffffffff)
		|| (-i_0_ ^ 0xffffffff) <= (arg0 + arg1 ^ 0xffffffff))
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nh.I(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public int[] method1466(int arg0, int arg1) {
	try {
	    anInt5877++;
	    int[] is = aClass200_4087.method2714(arg1, (byte) -69);
	    if (aClass200_4087.aBoolean2927) {
		int i = -2048 + Class1_Sub7_Sub1.anIntArray5206[arg1];
		for (int i_1_ = 0;
		     ((i_1_ ^ 0xffffffff)
		      > (Class131_Sub2_Sub7.anInt5637 ^ 0xffffffff));
		     i_1_++) {
		    int i_2_ = Class1_Sub4.anIntArray3551[i_1_] - 2048;
		    int i_3_ = anInt5868 + i_2_;
		    i_3_ = (i_3_ ^ 0xffffffff) <= 2047 ? i_3_ : i_3_ - -4096;
		    i_3_ = i_3_ > 2048 ? -4096 + i_3_ : i_3_;
		    int i_4_ = i - -anInt5875;
		    i_4_ = (i_4_ ^ 0xffffffff) > 2047 ? i_4_ - -4096 : i_4_;
		    i_4_ = (i_4_ ^ 0xffffffff) >= -2049 ? i_4_ : -4096 + i_4_;
		    int i_5_ = i_2_ - -anInt5874;
		    i_5_ = (i_5_ ^ 0xffffffff) > 2047 ? i_5_ + 4096 : i_5_;
		    i_5_ = (i_5_ ^ 0xffffffff) >= -2049 ? i_5_ : i_5_ + -4096;
		    int i_6_ = i + anInt5879;
		    i_6_ = i_6_ < -2048 ? 4096 + i_6_ : i_6_;
		    i_6_ = (i_6_ ^ 0xffffffff) < -2049 ? -4096 + i_6_ : i_6_;
		    is[i_1_] = (method1578(i_4_, i_3_, true)
				|| method1579(-80, i_5_, i_6_)) ? 4096 : 0;
		}
	    }
	    if (arg0 != -11543)
		return null;
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nh.E(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public boolean method1579(int arg0, int arg1, int arg2) {
	try {
	    anInt5870++;
	    int i = (arg1 + arg2) * anInt5869 >> 1577423948;
	    int i_7_
		= Class153_Sub1.anIntArray4763[255 * i >> -531870196 & 0xff];
	    i_7_ = (i_7_ << -1908783220) / anInt5869;
	    i_7_ = (i_7_ << 2097711980) / anInt5882;
	    int i_8_ = 52 / ((45 - arg0) / 55);
	    i_7_ = anInt5887 * i_7_ >> 423629868;
	    if ((-arg1 + arg2 ^ 0xffffffff) <= (i_7_ ^ 0xffffffff)
		|| arg2 - arg1 <= -i_7_)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("nh.B(" + arg0 + ',' + arg1
						 + ',' + arg2 + ')'));
	}
    }
    
    public PacketParser() {
	super(0, true);
	anInt5874 = 0;
	anInt5875 = 0;
	anInt5882 = 8192;
	anInt5887 = 4096;
	anInt5868 = 2048;
    }
    
    public static void method1580(boolean arg0) {
	Class22_Sub1.method271(Class131_Sub2_Sub15.aCanvas5768, (byte) 2);
	anInt5885++;
	Class131_Sub37.method1886(Class131_Sub2_Sub15.aCanvas5768, 1023);
	if (Class164.aClass34_2189 != null)
	    Class164.aClass34_2189.method459(255,
					     Class131_Sub2_Sub15.aCanvas5768);
	Class131_Sub2_Sub39.aClient6084.method42(-15896);
	Class131_Sub2_Sub15.aCanvas5768.setBackground(Color.black);
	Class63.anInt807 = -1;
	Class131_Sub3.method1647(66, Class131_Sub2_Sub15.aCanvas5768);
	Class104.method910(-12951, Class131_Sub2_Sub15.aCanvas5768);
	if (arg0 != true)
	    aLong5871 = 58L;
	if (Class164.aClass34_2189 != null)
	    Class164.aClass34_2189.method456((byte) -43,
					     Class131_Sub2_Sub15.aCanvas5768);
    }
    
    public void method1471(int arg0) {
	try {
	    anInt5888++;
	    Class103.method904(arg0 + arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nh.J(" + arg0 + ')');
	}
    }
    
    public void method1455(int arg0, byte arg1, Stream arg2) {
	anInt5884++;
	if (arg1 != -49)
	    method1471(-120);
	int i = arg0;
    while_141_:
	do {
	while_140_:
	    do {
	    while_139_:
		do {
		while_138_:
		    do {
		    while_137_:
			do {
			    do {
				if (i != 0) {
				    if ((i ^ 0xffffffff) != -2) {
					if (i != 2) {
					    if ((i ^ 0xffffffff) != -4) {
						if ((i ^ 0xffffffff) != -5) {
						    if (i != 5) {
							if ((i ^ 0xffffffff)
							    == -7)
							    break while_140_;
							break while_141_;
						    }
						} else
						    break while_138_;
						break while_139_;
					    }
					} else
					    break;
					break while_137_;
				    }
				} else {
				    anInt5868
					= arg2.readUnsignedShort(arg1 ^ ~0x1f98);
				    return;
				}
				anInt5875 = arg2.readUnsignedShort(8104);
				return;
			    } while (false);
			    anInt5874 = arg2.readUnsignedShort(8104);
			    return;
			} while (false);
			anInt5879 = arg2.readUnsignedShort(arg1 + 8153);
			return;
		    } while (false);
		    anInt5869 = arg2.readUnsignedShort(8104);
		    return;
		} while (false);
		anInt5887 = arg2.readUnsignedShort(arg1 + 8153);
		return;
	    } while (false);
	    anInt5882 = arg2.readUnsignedShort(8104);
	} while (false);
    }
    
    public static void method1581(boolean arg0) {
	if (Class160.anInt2129 > 1) {
	    Class131_Sub2_Sub39.anInt6079 = Class23_Sub5.anInt3758;
	    Class160.anInt2129--;
	}
	if (Class33.anInt480 > 0)
	    Class33.anInt480--;
	anInt5883++;
	if (Class143.aBoolean1903) {
	    Class143.aBoolean1903 = false;
	    Class138.method2121(true);
	} else {
	    if (!Class131_Sub2_Sub24.aBoolean5890)
		Class131_Sub41.method1915((byte) 81);
	    for (int i = 0; i < 100; i++) {
		if (!Class131_Sub2_Sub16.method1549(9316))
		    break;
	    }
	    if (Class133.anInt1803 == 30) {
		Class131_Sub32
		    .method1867(-19, Class93.aClass131_Sub15_Sub2_1226, 218);
		synchronized (Class6.aClass56_96.anObject732) {
		    if (Class155.aBoolean2063) {
			if (Class131_Sub23.anInt4458 != 0
			    || Class6.aClass56_96.anInt744 >= 40) {
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(158);
			    Class14.anInt160++;
			    Class93.aClass131_Sub15_Sub2_1226.writeByte(0);
			    int i
				= Class93.aClass131_Sub15_Sub2_1226.offset;
			    int i_9_ = 0;
			    for (int i_10_ = 0; ((i_10_ ^ 0xffffffff)
						 > (Class6.aClass56_96.anInt744
						    ^ 0xffffffff)); i_10_++) {
				if ((Class93.aClass131_Sub15_Sub2_1226
				     .offset) + -i
				    >= 240)
				    break;
				i_9_++;
				int i_11_
				    = Class6.aClass56_96.anIntArray741[i_10_];
				if ((i_11_ ^ 0xffffffff) <= -1) {
				    if (i_11_ > 65534)
					i_11_ = 65534;
				} else
				    i_11_ = 0;
				int i_12_
				    = Class6.aClass56_96.anIntArray742[i_10_];
				if ((i_12_ ^ 0xffffffff) <= -1) {
				    if ((i_12_ ^ 0xffffffff) < -65535)
					i_12_ = 65534;
				} else
				    i_12_ = 0;
				boolean bool = false;
				if ((Class6.aClass56_96.anIntArray741[i_10_]
				     == -1)
				    && (Class6.aClass56_96.anIntArray742[i_10_]
					^ 0xffffffff) == 0) {
				    bool = true;
				    i_12_ = -1;
				    i_11_ = -1;
				}
				if ((Class131_Sub41_Sub17_Sub1.anInt6566
				     ^ 0xffffffff) == (i_12_ ^ 0xffffffff)
				    && (Class131_Sub2_Sub10_Sub1.anInt6538
					== i_11_)) {
				    if ((Class58.anInt763 ^ 0xffffffff)
					> -2048)
					Class58.anInt763++;
				} else {
				    int i_13_
					= i_12_ + -(Class131_Sub41_Sub17_Sub1
						    .anInt6566);
				    Class131_Sub41_Sub17_Sub1.anInt6566
					= i_12_;
				    int i_14_
					= i_11_ + -(Class131_Sub2_Sub10_Sub1
						    .anInt6538);
				    Class131_Sub2_Sub10_Sub1.anInt6538 = i_11_;
				    if ((Class58.anInt763 ^ 0xffffffff) > -9
					&& (i_13_ ^ 0xffffffff) <= 31
					&& (i_13_ ^ 0xffffffff) >= -32
					&& i_14_ >= -32 && i_14_ <= 31) {
					i_14_ += 32;
					i_13_ += 32;
					Class93.aClass131_Sub15_Sub2_1226
					    .writeShort
					    (i_14_ + ((Class58.anInt763
						       << 1732649260)
						      - -(i_13_
							  << 1616285734)));
					Class58.anInt763 = 0;
				    } else if (((Class58.anInt763 ^ 0xffffffff)
						> -33)
					       && (i_13_ ^ 0xffffffff) <= 127
					       && i_13_ <= 127 && i_14_ >= -128
					       && ((i_14_ ^ 0xffffffff)
						   >= -128)) {
					Class93.aClass131_Sub15_Sub2_1226
					    .writeByte
					    (128 + Class58.anInt763);
					i_13_ += 128;
					i_14_ += 128;
					Class93.aClass131_Sub15_Sub2_1226
					    .writeShort
					    (i_14_ + (i_13_ << 1987047816));
					Class58.anInt763 = 0;
				    } else if ((Class58.anInt763 ^ 0xffffffff)
					       > -33) {
					Class93.aClass131_Sub15_Sub2_1226
					    .writeByte
					    (192 + Class58.anInt763);
					if (!bool)
					    Class93
						.aClass131_Sub15_Sub2_1226
						.writeInt
						(i_12_ | i_11_ << -1706082032);
					else
					    Class93
						.aClass131_Sub15_Sub2_1226
						.writeInt
						(-2147483648);
					Class58.anInt763 = 0;
				    } else {
					Class93.aClass131_Sub15_Sub2_1226
					    .writeShort
					    (57344 - -Class58.anInt763);
					if (bool)
					    Class93
						.aClass131_Sub15_Sub2_1226
						.writeInt
						(-2147483648);
					else
					    Class93
						.aClass131_Sub15_Sub2_1226
						.writeInt
						(i_12_ | i_11_ << -1019057648);
					Class58.anInt763 = 0;
				    }
				}
			    }
			    Class93.aClass131_Sub15_Sub2_1226.method1727
				((Class93.aClass131_Sub15_Sub2_1226.offset
				  + -i),
				 (byte) -42);
			    if ((i_9_ ^ 0xffffffff)
				> (Class6.aClass56_96.anInt744 ^ 0xffffffff)) {
				Class6.aClass56_96.anInt744 -= i_9_;
				for (int i_15_ = 0;
				     i_15_ < Class6.aClass56_96.anInt744;
				     i_15_++) {
				    Class6.aClass56_96.anIntArray742[i_15_]
					= (Class6.aClass56_96.anIntArray742
					   [i_15_ + i_9_]);
				    Class6.aClass56_96.anIntArray741[i_15_]
					= (Class6.aClass56_96.anIntArray741
					   [i_15_ + i_9_]);
				}
			    } else
				Class6.aClass56_96.anInt744 = 0;
			}
		    } else
			Class6.aClass56_96.anInt744 = 0;
		}
		if (Class131_Sub23.anInt4458 != 0) {
		    long l
			= (aLong5871 + -Class131_Sub2_Sub36.aLong6048) / 50L;
		    Class131_Sub2_Sub36.aLong6048 = aLong5871;
		    if ((l ^ 0xffffffffffffffffL) < -32768L)
			l = 32767L;
		    int i = Class131_Sub11.anInt4246;
		    if (i < 0)
			i = 0;
		    else if (i > 65535)
			i = 65535;
		    int i_16_ = Class207.anInt3022;
		    if (i_16_ >= 0) {
			if (i_16_ > 65535)
			    i_16_ = 65535;
		    } else
			i_16_ = 0;
		    int i_17_ = 0;
		    if (Class131_Sub23.anInt4458 == 2)
			i_17_ = 1;
		    int i_18_ = (int) l;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(87);
		    Class45.anInt627++;
		    Class93.aClass131_Sub15_Sub2_1226
			.writeLEShort(i_17_ << -1186835345 | i_18_, (byte) -115);
		    Class93.aClass131_Sub15_Sub2_1226
			.writeInt2(113414280, i_16_ | i << 884715376);
		}
		if ((Login.anInt1763 ^ 0xffffffff) < -1)
		    Login.anInt1763--;
		if (Class209.aBoolean3053
		    && (Login.anInt1763 ^ 0xffffffff) >= -1) {
		    Class75.anInt1029++;
		    Login.anInt1763 = 20;
		    Class209.aBoolean3053 = false;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(235);
		    Class93.aClass131_Sub15_Sub2_1226.writeShort
			((int) Class120.aFloat1578 >> 1574258115);
		    Class93.aClass131_Sub15_Sub2_1226.writeLEShort
			((int) Class23_Sub1_Sub1.aFloat5082 >> -1322207389,
			 (byte) -115);
		}
		if (arg0 != Class77.aBoolean1046
		    && !Class131_Sub41_Sub17.aBoolean6387 != false) {
		    Class131_Sub41_Sub17.aBoolean6387 = true;
		    Class131_Sub31.anInt4544++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(4);
		    Class93.aClass131_Sub15_Sub2_1226.writeByte(1);
		}
		if (Class77.aBoolean1046 != true
		    && Class131_Sub41_Sub17.aBoolean6387 == true) {
		    Class131_Sub41_Sub17.aBoolean6387 = false;
		    Class131_Sub31.anInt4544++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(4);
		    Class93.aClass131_Sub15_Sub2_1226.writeByte(0);
		}
		if (!Class131_Sub38.aBoolean4627) {
		    Class131_Sub41_Sub12.anInt6308++;
		    Class93.aClass131_Sub15_Sub2_1226.createPacket(41);
		    Class93.aClass131_Sub15_Sub2_1226
			.writeInt2(113414280, Class104.method909((byte) 59));
		    Class131_Sub38.aBoolean4627 = true;
		}
		if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972 != null) {
		    if (Class131_Sub2_Sub34.anInt6035 == 2)
			Class20.method258(-2511);
		    else if (Class131_Sub2_Sub34.anInt6035 == 3)
			Class69.method737((byte) 112);
		}
		if (!Class131_Sub22.aBoolean4446)
		    Cryption.aFloat1825 /= 2.0F;
		else
		    Class131_Sub22.aBoolean4446 = false;
		if (Class81.aBoolean1075)
		    Class81.aBoolean1075 = false;
		else
		    Class131_Sub18.aFloat4378 /= 2.0F;
		Class56.method623((byte) -82);
		if (Class133.anInt1803 == 30) {
		    Class88.method824(-3);
		    Class87.method820(-39);
		    Class131_Sub2_Sub3.method1486(121);
		    Class131_Sub23.anInt4451++;
		    if (Class131_Sub23.anInt4451 > 750)
			Class138.method2121(true);
		    else {
			Class100.method879(-8822);
			Class131_Sub31.method1863(-7830);
			Class214.method2776((byte) -61);
			for (int i = PacketStream.method1784(-57, true);
			     (i ^ 0xffffffff) != 0;
			     i = PacketStream.method1784(-101, false)) {
			    Class131_Sub8_Sub1.method1683((byte) 36, i);
			    Class159.anIntArray2124
				[Class90.method841(31, Class212.anInt3113++)]
				= i;
			}
			for (Class131_Sub41_Sub6 class131_sub41_sub6
				 = Class87.method817(true);
			     class131_sub41_sub6 != null;
			     class131_sub41_sub6 = Class87.method817(true)) {
			    int i
				= class131_sub41_sub6.method1963(-1255099360);
			    int i_19_
				= class131_sub41_sub6.method1965((byte) -68);
			    if (i == 1) {
				Class131_Sub2_Sub33.anIntArray6025[i_19_]
				    = class131_sub41_sub6.anInt6244;
				Class131_Sub6.aBoolean4156
				    |= Class43.aBooleanArray586[i_19_];
				Class1_Sub7_Sub1.anIntArray5213
				    [Class90.method841(31,
						       Class193.anInt2838++)]
				    = i_19_;
			    } else if ((i ^ 0xffffffff) == -3) {
				Class76.aStringArray1036[i_19_]
				    = class131_sub41_sub6.aString6241;
				Class131_Sub41_Sub8.anIntArray6269
				    [Class90.method841(Class131_Sub2_Sub24
							   .anInt5892++,
						       31)]
				    = i_19_;
			    } else if ((i ^ 0xffffffff) != -4) {
				if (i != 4) {
				    if (i != 5) {
					if ((i ^ 0xffffffff) != -7) {
					    if (i != 7) {
						if ((i ^ 0xffffffff) == -9) {
						    Class173 class173
							= (Class190.method2615
							   (i_19_, -61));
						    if (((class131_sub41_sub6
							  .anInt6244)
							 != class173.anInt2461)
							|| ((class131_sub41_sub6
							     .anInt6234)
							    != (class173
								.anInt2482))
							|| ((class173.anInt2403
							     ^ 0xffffffff)
							    != ((class131_sub41_sub6
								 .anInt6236)
								^ 0xffffffff))) {
							class173.anInt2461
							    = (class131_sub41_sub6
							       .anInt6244);
							class173.anInt2403
							    = (class131_sub41_sub6
							       .anInt6236);
							class173.anInt2482
							    = (class131_sub41_sub6
							       .anInt6234);
							if (class173.anInt2421
							    != -1) {
							    if (((class173
								  .anInt2423)
								 ^ 0xffffffff)
								< -1)
								class173
								    .anInt2403
								    = (32
								       * (class173
									  .anInt2403)
								       / (class173
									  .anInt2423));
							    else if ((class173
								      .anInt2440)
								     > 0)
								class173
								    .anInt2403
								    = ((class173
									.anInt2403)
								       * 32
								       / (class173
									  .anInt2440));
							}
							Class23_Sub4_Sub4
							    .method383
							    (-96, class173);
						    }
						} else if (i == 9) {
						    Class173 class173
							= (Class190.method2615
							   (i_19_, -124));
						    if ((class173.anInt2421
							 != (class131_sub41_sub6
							     .anInt6244))
							|| ((class173.anInt2305
							     ^ 0xffffffff)
							    != ((class131_sub41_sub6
								 .anInt6234)
								^ 0xffffffff))) {
							class173.anInt2421
							    = (class131_sub41_sub6
							       .anInt6244);
							class173.anInt2305
							    = (class131_sub41_sub6
							       .anInt6234);
							Class23_Sub4_Sub4
							    .method383
							    (-75, class173);
						    }
						} else if (i != 10) {
						    if ((i ^ 0xffffffff)
							== -12) {
							Class173 class173
							    = (Class190
								   .method2615
							       (i_19_, -83));
							class173.aByte2469
							    = (byte) 0;
							class173.anInt2343
							    = class173
								  .anInt2432
							    = (class131_sub41_sub6
							       .anInt6234);
							class173.anInt2442
							    = class173
								  .anInt2445
							    = (class131_sub41_sub6
							       .anInt6244);
							class173.aByte2311
							    = (byte) 0;
							Class23_Sub4_Sub4
							    .method383
							    (-124, class173);
						    } else if ((i ^ 0xffffffff)
							       != -13) {
							if (i != 13) {
							    if ((i
								 ^ 0xffffffff)
								!= -15) {
								if (i == 15) {
								    Class169
									.LocalY
									= (class131_sub41_sub6
									   .anInt6234);
								    Class78
									.aBoolean1051
									= true;
								    Class131_Sub2_Sub6
									.LocalX
									= (class131_sub41_sub6
									   .anInt6244);
								}
							    } else {
								Class173 class173
								    = (Class190
									   .method2615
								       (i_19_,
									-17));
								class173
								    .anInt2377
								    = (class131_sub41_sub6
								       .anInt6244);
							    }
							} else {
							    Class173 class173
								= (Class190
								       .method2615
								   (i_19_,
								    -18));
							    class173.anInt2450
								= (class131_sub41_sub6
								   .anInt6244);
							}
						    } else {
							Class173 class173
							    = (Class190
								   .method2615
							       (i_19_, -98));
							int i_20_
							    = (class131_sub41_sub6
							       .anInt6244);
							if (class173 != null
							    && (((class173
								  .anInt2470)
								 ^ 0xffffffff)
								== -1)) {
							    if (((class173
								  .anInt2479)
								 - (class173
								    .anInt2437))
								< i_20_)
								i_20_
								    = (-(class173
									 .anInt2437)
								       + (class173
									  .anInt2479));
							    if ((i_20_
								 ^ 0xffffffff)
								> -1)
								i_20_ = 0;
							    if ((class173
								 .anInt2415)
								!= i_20_) {
								class173
								    .anInt2415
								    = i_20_;
								Class23_Sub4_Sub4
								    .method383
								    (-99,
								     class173);
							    }
							}
						    }
						} else {
						    Class173 class173
							= (Class190.method2615
							   (i_19_, -31));
						    if ((((class131_sub41_sub6
							   .anInt6244)
							  ^ 0xffffffff)
							 != (class173.anInt2412
							     ^ 0xffffffff))
							|| ((class173.anInt2390
							     ^ 0xffffffff)
							    != ((class131_sub41_sub6
								 .anInt6234)
								^ 0xffffffff))
							|| ((class173.anInt2308
							     ^ 0xffffffff)
							    != ((class131_sub41_sub6
								 .anInt6236)
								^ 0xffffffff))) {
							class173.anInt2412
							    = (class131_sub41_sub6
							       .anInt6244);
							class173.anInt2308
							    = (class131_sub41_sub6
							       .anInt6236);
							class173.anInt2390
							    = (class131_sub41_sub6
							       .anInt6234);
							Class23_Sub4_Sub4
							    .method383
							    (-86, class173);
						    }
						}
					    } else {
						Class173 class173
						    = (Class190.method2615
						       (i_19_, -53));
						boolean bool
						    = ((class131_sub41_sub6
							.anInt6244)
						       == 1);
						if (class173.aBoolean2404
						    != bool) {
						    class173.aBoolean2404
							= bool;
						    Class23_Sub4_Sub4.method383
							(-105, class173);
						}
					    }
					} else {
					    int i_21_ = (class131_sub41_sub6
							 .anInt6244);
					    int i_22_ = ((i_21_ & 0x7f5c)
							 >> 1918038474);
					    int i_23_
						= i_21_ >> -863803835 & 0x1f;
					    int i_24_ = i_21_ & 0x1f;
					    int i_25_
						= ((i_24_ << -744845757)
						   + (i_23_ << 900258827)
						   + (i_22_ << 492633683));
					    Class173 class173
						= Class190.method2615(i_19_,
								      -126);
					    if ((class173.anInt2467
						 ^ 0xffffffff)
						!= (i_25_ ^ 0xffffffff)) {
						class173.anInt2467 = i_25_;
						Class23_Sub4_Sub4
						    .method383(-125, class173);
					    }
					}
				    } else {
					Class173 class173
					    = Class190.method2615(i_19_, -53);
					if ((class173.anInt2443
					     != class131_sub41_sub6.anInt6244)
					    || (class131_sub41_sub6.anInt6244
						^ 0xffffffff) == 0) {
					    class173.anInt2443
						= (class131_sub41_sub6
						   .anInt6244);
					    class173.anInt2481 = 1;
					    class173.anInt2484 = 0;
					    class173.anInt2338 = 0;
					    Class23_Sub4_Sub4
						.method383(-89, class173);
					}
				    }
				} else {
				    Class173 class173
					= Class190.method2615(i_19_, -11);
				    int i_26_ = class131_sub41_sub6.anInt6244;
				    int i_27_ = class131_sub41_sub6.anInt6234;
				    int i_28_ = class131_sub41_sub6.anInt6236;
				    if (class173.anInt2416 != i_26_
					|| ((i_27_ ^ 0xffffffff)
					    != (class173.anInt2359
						^ 0xffffffff))
					|| class173.anInt2457 != i_28_) {
					class173.anInt2416 = i_26_;
					class173.anInt2359 = i_27_;
					class173.anInt2457 = i_28_;
					Class23_Sub4_Sub4.method383(-120,
								    class173);
				    }
				}
			    } else {
				Class173 class173
				    = Class190.method2615(i_19_, -105);
				if (!class131_sub41_sub6.aString6241
					 .equals(class173.aString2357)) {
				    class173.aString2357
					= class131_sub41_sub6.aString6241;
				    Class23_Sub4_Sub4.method383(-79, class173);
				}
			    }
			}
			Class42.anInt563++;
			if (Class91.anInt1181 != 0) {
			    Class23_Sub4_Sub4.anInt5400 += 20;
			    if ((Class23_Sub4_Sub4.anInt5400 ^ 0xffffffff)
				<= -401)
				Class91.anInt1181 = 0;
			}
			if (Class131_Sub41_Sub12.aClass173_6321 != null) {
			    Class131_Sub2_Sub1.anInt5561++;
			    if ((Class131_Sub2_Sub1.anInt5561 ^ 0xffffffff)
				<= -16) {
				Class23_Sub4_Sub4.method383
				    (-110,
				     Class131_Sub41_Sub12.aClass173_6321);
				Class131_Sub41_Sub12.aClass173_6321 = null;
			    }
			}
			Class173 class173 = Class1_Sub7.aClass173_3585;
			Class1_Sub7.aClass173_3585 = null;
			Class173 class173_29_ = Class18.aClass173_193;
			Class18.aClass173_193 = null;
			Class131_Sub3.aBoolean4125 = false;
			Class33.aClass173_465 = null;
			Class22.anInt246 = 0;
			Class33.aBoolean471 = false;
			while (Class138_Sub1.method2123(92)
			       && (Class22.anInt246 ^ 0xffffffff) > -129) {
			    if (Class144.method2155(14848)
				&& (Class23_Sub5_Sub1.aChar5038 == '`'
				    || (Class23_Sub5_Sub1.aChar5038
					== '\u00a7'))) {
				if (!Class134.method2099(0))
				    Class149.method2182(100);
				else
				    Class75.method763(false);
			    } else {
				Class131_Sub2_Sub7.anIntArray5640[(Class22
								   .anInt246)]
				    = Class131_Sub2_Sub1.anInt5563;
				Class60.anIntArray789[Class22.anInt246]
				    = Class23_Sub5_Sub1.aChar5038;
				Class22.anInt246++;
			    }
			}
			if (Class134.method2099(0))
			    Class1_Sub2.method100(false);
			Class121_Sub3.aClass173_4000 = null;
			Class60.method650(-1, null, -1, (byte) 88);
			Class131_Sub41_Sub19.method2058(null, true, -1, -1);
			Class131_Sub41_Sub14.method2024(121);
			Class23_Sub5.anInt3758++;
			if (Class17.aBoolean181) {
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(148);
			    anInt5881++;
			    Class93.aClass131_Sub15_Sub2_1226.writeInt1
				((byte) -105,
				 (Class131_Sub8.anInt4190
				  | ((Class131_Sub41_Sub15.anInt6351
				      << 1914499054)
				     | Class69.anInt927 << 464755548)));
			    Class17.aBoolean181 = false;
			}
			for (;;) {
			    Class131_Sub14 class131_sub14
				= (Class131_Sub14) Class172.aClass119_2289
						       .method1005((byte) 93);
			    if (class131_sub14 == null)
				break;
			    Class173 class173_30_
				= class131_sub14.aClass173_4276;
			    if ((class173_30_.anInt2350 ^ 0xffffffff) <= -1) {
				Class173 class173_31_
				    = Class190.method2615((class173_30_
							   .anInt2456),
							  -71);
				if (class173_31_ == null
				    || class173_31_.aClass173Array2326 == null
				    || ((class173_31_.aClass173Array2326.length
					 ^ 0xffffffff)
					>= (class173_30_.anInt2350
					    ^ 0xffffffff))
				    || ((class173_31_.aClass173Array2326
					 [class173_30_.anInt2350])
					!= class173_30_))
				    continue;
			    }
			    Class168.method2437(class131_sub14);
			}
			for (;;) {
			    Class131_Sub14 class131_sub14
				= ((Class131_Sub14)
				   Class131_Sub24.aClass119_4467
				       .method1005((byte) 93));
			    if (class131_sub14 == null)
				break;
			    Class173 class173_32_
				= class131_sub14.aClass173_4276;
			    if (class173_32_.anInt2350 >= 0) {
				Class173 class173_33_
				    = Class190.method2615((class173_32_
							   .anInt2456),
							  -119);
				if (class173_33_ == null
				    || class173_33_.aClass173Array2326 == null
				    || ((class173_33_.aClass173Array2326.length
					 ^ 0xffffffff)
					>= (class173_32_.anInt2350
					    ^ 0xffffffff))
				    || ((class173_33_.aClass173Array2326
					 [class173_32_.anInt2350])
					!= class173_32_))
				    continue;
			    }
			    Class168.method2437(class131_sub14);
			}
			for (;;) {
			    Class131_Sub14 class131_sub14
				= (Class131_Sub14) Class87.aClass119_1138
						       .method1005((byte) 93);
			    if (class131_sub14 == null)
				break;
			    Class173 class173_34_
				= class131_sub14.aClass173_4276;
			    if ((class173_34_.anInt2350 ^ 0xffffffff) <= -1) {
				Class173 class173_35_
				    = Class190.method2615((class173_34_
							   .anInt2456),
							  -26);
				if (class173_35_ == null
				    || class173_35_.aClass173Array2326 == null
				    || (class173_34_.anInt2350
					>= (class173_35_
					    .aClass173Array2326).length)
				    || (class173_34_
					!= (class173_35_.aClass173Array2326
					    [class173_34_.anInt2350])))
				    continue;
			    }
			    Class168.method2437(class131_sub14);
			}
			if (Class121_Sub3.aClass173_4000 == null)
			    Class23_Sub5_Sub2.anInt5063 = 0;
			if (Class22_Sub1.aClass173_3666 != null)
			    Class130.method1200(97);
			if ((Class56.anInt745 ^ 0xffffffff) < -1
			    && Class131_Sub2_Sub39.aBooleanArray6080[82]
			    && Class131_Sub2_Sub39.aBooleanArray6080[81]
			    && Class1_Sub2.anInt3511 != 0) {
			    int i = -Class1_Sub2.anInt3511 + Class29.anInt300;
			    if (i < 0)
				i = 0;
			    else if ((i ^ 0xffffffff) < -4)
				i = 3;
			    Class120_Sub2.method1035
				(i,
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5331[0]) + Class64.regionY,
				 (Class166.aClass23_Sub4_Sub1_Sub2_2216
				  .anIntArray5328[0]) + Class92.regionX,
				 63);
			}
			Class175.method2483(2);
			if (Class131_Sub2_Sub24.aClass173_5906 != null) {
			    Class23_Sub4_Sub4.method383(-78,
							(Class131_Sub2_Sub24
							 .aClass173_5906));
			    if (((Class144.anInt1914 ^ 0xffffffff)
				 < (Class143.anInt1908 - -5 ^ 0xffffffff))
				|| Class144.anInt1914 < -5 + Class143.anInt1908
				|| ((5 + Class89.anInt3248 ^ 0xffffffff)
				    > (Class23_Sub4_Sub3.anInt5005
				       ^ 0xffffffff))
				|| (Class23_Sub4_Sub3.anInt5005
				    < -5 + Class89.anInt3248))
				Class131_Sub2_Sub10.aBoolean5697 = true;
			    Class121_Sub2_Sub1.anInt5428++;
			    if ((Class147.anInt1949 ^ 0xffffffff) == -1) {
				if (!Class131_Sub2_Sub10.aBoolean5697
				    || (Class121_Sub2_Sub1.anInt5428
					^ 0xffffffff) > -6) {
				    if ((Class131_Sub27.anInt4491 != 1
					 && !Class131_Sub41_Sub20
						 .method2064(121))
					|| ((Class147.anInt1946 ^ 0xffffffff)
					    >= -3)) {
					if (Class98.method864(17762))
					    Applet_Sub1.method37((byte) 63);
				    } else
					Class188.method2597(Class144.anInt1914,
							    (Class23_Sub4_Sub3
							     .anInt5005),
							    (byte) -121);
				} else if ((Class131_Sub2_Sub24.aClass173_5906
					    == Class131_Sub13.aClass173_4263)
					   && ((Class34.anInt489 ^ 0xffffffff)
					       != (Class177.anInt2531
						   ^ 0xffffffff))) {
				    Class173 class173_36_
					= Class131_Sub2_Sub24.aClass173_5906;
				    int i = 0;
				    if (Class220.anInt3231 == 1
					&& (class173_36_.anInt2441
					    ^ 0xffffffff) == -207)
					i = 1;
				    if ((class173_36_.anIntArray2400
					 [Class34.anInt489])
					<= 0)
					i = 0;
				    if (i == 1) {
					int i_37_ = Class177.anInt2531;
					int i_38_ = Class34.anInt489;
					while (i_37_ != i_38_) {
					    if ((i_37_ ^ 0xffffffff)
						< (i_38_ ^ 0xffffffff)) {
						class173_36_.method2469
						    (-1 + i_37_, -112, i_37_);
						i_37_--;
					    } else if (i_37_ < i_38_) {
						class173_36_.method2469((i_37_
									 + 1),
									89,
									i_37_);
						i_37_++;
					    }
					}
				    } else
					class173_36_.method2469((Class34
								 .anInt489),
								-71,
								(Class177
								 .anInt2531));
				    Class155.anInt2062++;
				    Class93.aClass131_Sub15_Sub2_1226
					.createPacket(253);
				    Class93.aClass131_Sub15_Sub2_1226
					.writeInt
					((Class131_Sub2_Sub24.aClass173_5906
					  .anInt2455));
				    Class93.aClass131_Sub15_Sub2_1226
					.writeByteC(-29012, i);
				    Class93.aClass131_Sub15_Sub2_1226
					.writeShortA
					(Class34.anInt489, (byte) -127);
				    Class93.aClass131_Sub15_Sub2_1226
					.writeShortA
					(Class177.anInt2531, (byte) -125);
				}
				Class131_Sub2_Sub24.aClass173_5906 = null;
				Class131_Sub23.anInt4458 = 0;
				Class131_Sub2_Sub1.anInt5561 = 10;
			    }
			}
			if (class173 != Class1_Sub7.aClass173_3585) {
			    if (class173 != null)
				Class23_Sub4_Sub4.method383(-88, class173);
			    if (Class1_Sub7.aClass173_3585 != null)
				Class23_Sub4_Sub4.method383(-94,
							    (Class1_Sub7
							     .aClass173_3585));
			}
			if (class173_29_ != Class18.aClass173_193
			    && Class197.anInt2879 == Class88.anInt1163) {
			    if (class173_29_ != null)
				Class23_Sub4_Sub4.method383(-91, class173_29_);
			    if (Class18.aClass173_193 != null)
				Class23_Sub4_Sub4
				    .method383(-81, Class18.aClass173_193);
			}
			if (Class18.aClass173_193 == null) {
			    if ((Class88.anInt1163 ^ 0xffffffff) < -1)
				Class88.anInt1163--;
			} else if (Class197.anInt2879 > Class88.anInt1163) {
			    Class88.anInt1163++;
			    if ((Class88.anInt1163 ^ 0xffffffff)
				== (Class197.anInt2879 ^ 0xffffffff))
				Class23_Sub4_Sub4
				    .method383(-108, Class18.aClass173_193);
			}
			for (int i = 0; (i ^ 0xffffffff) > -6; i++)
			    Class167.anIntArray2236[i]++;
			int i = Class88.method826((byte) 65);
			int i_39_ = Class23.method291(-1);
			if (i > 15000 && i_39_ > 15000) {
			    Class33.anInt480 = 250;
			    client.anInt3474++;
			    Class131_Sub2_Sub20.method1571(14500, 606422945);
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(244);
			}
			if (Class131_Sub6.aBoolean4156
			    && ((-60000L + Class208.method2749(-3913)
				 ^ 0xffffffffffffffffL)
				< (Class131_Sub41_Sub2.aLong6180
				   ^ 0xffffffffffffffffL)))
			    Class131_Sub38.method1891(6);
			Class104.anInt1364++;
			if (Class104.anInt1364 > 500) {
			    Class104.anInt1364 = 0;
			    int i_40_ = (int) (Math.random() * 8.0);
			    if ((0x4 & i_40_) == 4)
				Class47.anInt647
				    += Class121_Sub3_Sub1.anInt5430;
			    if ((i_40_ & 0x2) == 2)
				Class131_Sub2_Sub25.anInt5919
				    += Class131_Sub4.anInt4135;
			    if ((0x1 & i_40_) == 1)
				Class213.anInt3118 += Class177.anInt2525;
			}
			if (Class213.anInt3118 < -50)
			    Class177.anInt2525 = 2;
			if (Class131_Sub2_Sub25.anInt5919 < -55)
			    Class131_Sub4.anInt4135 = 2;
			if ((Class213.anInt3118 ^ 0xffffffff) < -51)
			    Class177.anInt2525 = -2;
			if ((Class131_Sub2_Sub25.anInt5919 ^ 0xffffffff) < -56)
			    Class131_Sub4.anInt4135 = -2;
			if (Class47.anInt647 < -40)
			    Class121_Sub3_Sub1.anInt5430 = 1;
			Class28.anInt275++;
			if (Class47.anInt647 > 40)
			    Class121_Sub3_Sub1.anInt5430 = -1;
			if (Class28.anInt275 > 500) {
			    Class28.anInt275 = 0;
			    int i_41_ = (int) (Math.random() * 8.0);
			    if ((i_41_ & 0x1 ^ 0xffffffff) == -2)
				Class148.anInt1982 += Class88.anInt1164;
			    if ((i_41_ & 0x2) == 2)
				Class1_Sub7.anInt3590 += Class186.anInt2645;
			}
			if ((Class148.anInt1982 ^ 0xffffffff) > 59)
			    Class88.anInt1164 = 2;
			if ((Class1_Sub7.anInt3590 ^ 0xffffffff) > 19)
			    Class186.anInt2645 = 1;
			if (Class148.anInt1982 > 60)
			    Class88.anInt1164 = -2;
			Class131_Sub2_Sub34.anInt6032++;
			if (Class1_Sub7.anInt3590 > 10)
			    Class186.anInt2645 = -1;
			if (Class131_Sub2_Sub34.anInt6032 > 50) {
			    Class220.anInt3220++;
			    Class93.aClass131_Sub15_Sub2_1226.createPacket(255);
			}
			if (Class183.aBoolean2612) {
			    Class128.method1142(-11983);
			    Class183.aBoolean2612 = false;
			}
			do {
			    try {
				if (Class128_Sub1.aClass33_4013 == null
				    || ((Class93.aClass131_Sub15_Sub2_1226
					 .offset)
					^ 0xffffffff) >= -1)
				    break;
				Class128_Sub1.aClass33_4013.method454
				    (110,
				     (Class93.aClass131_Sub15_Sub2_1226
				      .offset),
				     0,
				     (Class93.aClass131_Sub15_Sub2_1226
				      .data));
				Class131_Sub2_Sub34.anInt6032 = 0;
				Class93.aClass131_Sub15_Sub2_1226.offset
				    = 0;
			    } catch (IOException ioexception) {
				Class138.method2121(!arg0);
				break;
			    }
			    break;
			} while (false);
		    }
		}
	    }
	}
    }
    
    public static boolean method1582(int arg0) throws IOException {
	try {
	    anInt5886++;
	    if (Class128_Sub1.aClass33_4013 == null)
		return false;
	    int i = Class128_Sub1.aClass33_4013.method450((byte) 17);
	    if ((i ^ 0xffffffff) == -1)
		return false;
	    if (Class131_Sub35.anInt4583 == -1) {
		Class128_Sub1.aClass33_4013.method451
		    (114, 0, (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .data), 1);
		Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.offset = 0;
		Class131_Sub35.anInt4583
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .method1793(5663);
		Class131_Sub8_Sub1.anInt6100
		    = Class103.anIntArray1339[Class131_Sub35.anInt4583];
		if (Class131_Sub35.anInt4583 == 255)
			Class131_Sub8_Sub1.anInt6100 = Class103.anIntArray1339[21];
		i--;
	    }
	    if (Class131_Sub8_Sub1.anInt6100 == -1) {
		if (i > 0) {
		    Class128_Sub1.aClass33_4013.method451
			(116, 0, (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .data), 1);
		    Class131_Sub8_Sub1.anInt6100
			= 0xff & (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .data[0]);
		    i--;
		} else
		    return false;
	    }
	    if ((Class131_Sub8_Sub1.anInt6100 ^ 0xffffffff) == 1) {
		if ((i ^ 0xffffffff) < -2) {
		    Class128_Sub1.aClass33_4013.method451
			(101, 0, (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .data), 2);
		    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.offset = 0;
		    i -= 2;
		    Class131_Sub8_Sub1.anInt6100
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readUnsignedShort(8104);
		} else
		    return false;
	    }
	    if (Class131_Sub8_Sub1.anInt6100 > i)
		return false;
	    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.offset = 0;
	    Class128_Sub1.aClass33_4013.method451(89, 0,
						  (Class23_Sub3_Sub1
						   .aClass131_Sub15_Sub2_5231
						   .data),
						  (Class131_Sub8_Sub1
						   .anInt6100));
	    Class131_Sub41_Sub19.anInt6414 = Class56.anInt738;
	    Class131_Sub23.anInt4451 = 0;
	    Class56.anInt738 = Class91.anInt1179;
	    Class91.anInt1179 = Class131_Sub35.anInt4583;
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -234) {
		int i_42_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedInt(-2);
		Class173 class173 = Class190.method2615(i_42_, -21);
		for (int i_43_ = 0;
		     ((i_43_ ^ 0xffffffff)
		      > (class173.anIntArray2400.length ^ 0xffffffff));
		     i_43_++) {
		    class173.anIntArray2400[i_43_] = -1;
		    class173.anIntArray2400[i_43_] = 0;
		}
		Class23_Sub4_Sub4.method383(-99, class173);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 38) {
		Class131_Sub2_Sub38.method1645((byte) -113);
		int i_44_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByteA((byte) -121);
		int i_45_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedInt1(65280);
		int i_46_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByteC(4095);
		Class131_Sub2_Sub10_Sub1.anIntArray6539[i_46_] = i_45_;
		Class2.anIntArray86[i_46_] = i_44_;
		Class131_Sub2_Sub29.anIntArray5975[i_46_] = 1;
		int i_47_ = RuntimeException_Sub1.anIntArray3233[i_46_] - 1;
		for (int i_48_ = 0; i_47_ > i_48_; i_48_++) {
		    if (i_45_ >= Class23_Sub4_Sub1_Sub2.anIntArray6505[i_48_])
			Class131_Sub2_Sub29.anIntArray5975[i_46_] = 2 + i_48_;
		}
		Class131_Sub2_Sub36.anIntArray6050
		    [Class90.method841(31, Class131_Sub2.anInt4104++)]
		    = i_46_;
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -165) {
		int i_49_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedLEShortA(-1);
		byte i_50_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readSignedByte((byte) 127);
		int i_51_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedLEShort((byte) 79);
		if (Class23_Sub1_Sub1.method299(-25976, i_49_))
		    Class131_Sub2_Sub22.method1576(1, i_50_, i_51_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -110) {
		int i_52_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedLEShortA(-1);
		int i_53_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedLEInt(-16777216);
		int i_54_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShortA(false);
		int i_55_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedLEShortA(-1);
		if ((i_53_ >> -1894042274 ^ 0xffffffff) != -1) {
		    int i_56_ = 0x3 & i_53_ >> 443535132;
		    int i_57_ = (((0xffff868 & i_53_) >> 431058414)
				 + -Class92.regionX);
		    int i_58_ = -Class64.regionY + (i_53_ & 0x3fff);
		    if (i_57_ >= 0 && i_58_ >= 0
			&& Class131_Sub41_Sub11_Sub1.anInt6546 > i_57_
			&& ((Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff)
			    < (i_58_ ^ 0xffffffff))) {
			int i_59_ = 128 * i_57_ + 64;
			int i_60_ = 128 * i_58_ + 64;
			Class23_Sub4_Sub4 class23_sub4_sub4
			    = (new Class23_Sub4_Sub4
			       (i_54_, 0, Class125.anInt1632, i_56_, i_59_,
				(RuntimeException_Sub1.method2833(i_60_, -16,
								  i_59_, i_56_)
				 + -i_52_),
				i_60_, i_57_, i_57_, i_58_, i_58_));
			Class131_Sub2_Sub9.aClass119_5676.method1018
			    ((byte) -125,
			     new Class131_Sub41_Sub3(class23_sub4_sub4));
		    }
		} else if ((i_53_ >> 308499133 ^ 0xffffffff) == -1) {
		    if ((i_53_ >> 936304924 ^ 0xffffffff) != -1) {
			int i_61_ = i_53_ & 0xffff;
			Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2;
			if (Class110.anInt1433 != i_61_)
			    class23_sub4_sub1_sub2
				= (Class105.aClass23_Sub4_Sub1_Sub2Array1373
				   [i_61_]);
			else
			    class23_sub4_sub1_sub2
				= Class166.aClass23_Sub4_Sub1_Sub2_2216;
			if (class23_sub4_sub1_sub2 != null) {
			    if ((i_54_ ^ 0xffffffff) == -65536)
				i_54_ = -1;
			    boolean bool = true;
			    if (i_54_ != -1
				&& class23_sub4_sub1_sub2.anInt5253 != -1) {
				if ((i_54_ ^ 0xffffffff)
				    != (class23_sub4_sub1_sub2.anInt5253
					^ 0xffffffff)) {
				    Class112 class112
					= Class151.method2194(i_54_, -6861);
				    Class112 class112_62_
					= (Class151.method2194
					   (class23_sub4_sub1_sub2.anInt5253,
					    -6861));
				    if (class112.anInt1450 != -1
					&& class112_62_.anInt1450 != -1) {
					Class161 class161
					    = Class145.method2159((class112
								   .anInt1450),
								  (byte) -111);
					Class161 class161_63_
					    = Class145.method2159((class112_62_
								   .anInt1450),
								  (byte) -98);
					if ((class161.anInt2142 ^ 0xffffffff)
					    > (class161_63_.anInt2142
					       ^ 0xffffffff))
					    bool = false;
				    }
				} else {
				    Class112 class112
					= Class151.method2194(i_54_, -6861);
				    if (class112.aBoolean1448
					&& ((class112.anInt1450 ^ 0xffffffff)
					    != 0)) {
					Class161 class161
					    = Class145.method2159((class112
								   .anInt1450),
								  (byte) -126);
					int i_64_ = class161.anInt2155;
					if (i_64_ == 0 || i_64_ == 2)
					    bool = false;
					else if ((i_64_ ^ 0xffffffff) == -2)
					    bool = true;
				    }
				}
			    }
			    if (bool) {
				class23_sub4_sub1_sub2.anInt5288 = 0;
				class23_sub4_sub1_sub2.anInt5253 = i_54_;
				class23_sub4_sub1_sub2.anInt5251 = 1;
				class23_sub4_sub1_sub2.anInt5262 = 0;
				class23_sub4_sub1_sub2.anInt5287
				    = i_55_ + Class125.anInt1632;
				class23_sub4_sub1_sub2.anInt5286 = i_52_;
				if ((class23_sub4_sub1_sub2.anInt5253
				     ^ 0xffffffff)
				    == -65536)
				    class23_sub4_sub1_sub2.anInt5253 = -1;
				if ((Class125.anInt1632 ^ 0xffffffff)
				    > (class23_sub4_sub1_sub2.anInt5287
				       ^ 0xffffffff))
				    class23_sub4_sub1_sub2.anInt5262 = -1;
				if (class23_sub4_sub1_sub2.anInt5253 != -1
				    && (class23_sub4_sub1_sub2.anInt5287
					== Class125.anInt1632)) {
				    int i_65_
					= (Class151.method2194
					   (class23_sub4_sub1_sub2.anInt5253,
					    -6861)
					   .anInt1450);
				    if ((i_65_ ^ 0xffffffff) != 0) {
					Class161 class161
					    = Class145.method2159(i_65_,
								  (byte) -105);
					if (class161 != null
					    && class161.anIntArray2139 != null)
					    Login.method1153
						((class23_sub4_sub1_sub2
						  .anInt3733),
						 21155,
						 (class23_sub4_sub1_sub2
						  == (Class166
						      .aClass23_Sub4_Sub1_Sub2_2216)),
						 0,
						 (class23_sub4_sub1_sub2
						  .anInt3747),
						 class161);
				    }
				}
			    }
			}
		    }
		} else {
		    int i_66_ = i_53_ & 0xffff;
		    Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
			= (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			   [i_66_]);
		    if (class23_sub4_sub1_sub1 != null) {
			if (i_54_ == 65535)
			    i_54_ = -1;
			boolean bool = true;
			if (i_54_ != -1
			    && class23_sub4_sub1_sub1.anInt5253 != -1) {
			    if (i_54_ != class23_sub4_sub1_sub1.anInt5253) {
				Class112 class112
				    = Class151.method2194(i_54_, -6861);
				Class112 class112_67_
				    = (Class151.method2194
				       (class23_sub4_sub1_sub1.anInt5253,
					-6861));
				if (class112.anInt1450 != -1
				    && class112_67_.anInt1450 != -1) {
				    Class161 class161
					= Class145.method2159((class112
							       .anInt1450),
							      (byte) -103);
				    Class161 class161_68_
					= Class145.method2159((class112_67_
							       .anInt1450),
							      (byte) -122);
				    if (class161_68_.anInt2142
					> class161.anInt2142)
					bool = false;
				}
			    } else {
				Class112 class112
				    = Class151.method2194(i_54_, -6861);
				if (class112.aBoolean1448
				    && ((class112.anInt1450 ^ 0xffffffff)
					!= 0)) {
				    Class161 class161
					= Class145.method2159((class112
							       .anInt1450),
							      (byte) -95);
				    int i_69_ = class161.anInt2155;
				    if ((i_69_ ^ 0xffffffff) != -1
					&& i_69_ != 2) {
					if (i_69_ == 1)
					    bool = true;
				    } else
					bool = false;
				}
			    }
			}
			if (bool) {
			    class23_sub4_sub1_sub1.anInt5287
				= Class125.anInt1632 - -i_55_;
			    class23_sub4_sub1_sub1.anInt5253 = i_54_;
			    class23_sub4_sub1_sub1.anInt5262 = 0;
			    class23_sub4_sub1_sub1.anInt5286 = i_52_;
			    class23_sub4_sub1_sub1.anInt5251 = 1;
			    class23_sub4_sub1_sub1.anInt5288 = 0;
			    if ((Class125.anInt1632 ^ 0xffffffff)
				> (class23_sub4_sub1_sub1.anInt5287
				   ^ 0xffffffff))
				class23_sub4_sub1_sub1.anInt5262 = -1;
			    if (class23_sub4_sub1_sub1.anInt5253 != -1
				&& ((Class125.anInt1632 ^ 0xffffffff)
				    == (class23_sub4_sub1_sub1.anInt5287
					^ 0xffffffff))) {
				int i_70_ = (Class151.method2194
					     (class23_sub4_sub1_sub1.anInt5253,
					      -6861)
					     .anInt1450);
				if ((i_70_ ^ 0xffffffff) != 0) {
				    Class161 class161
					= Class145.method2159(i_70_,
							      (byte) -103);
				    if (class161 != null
					&& class161.anIntArray2139 != null)
					Login.method1153
					    (class23_sub4_sub1_sub1.anInt3733,
					     21155, false, 0,
					     class23_sub4_sub1_sub1.anInt3747,
					     class161);
				}
			    }
			}
		    }
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 50) {
		int i_71_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShortA(false);
		int i_72_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		int i_73_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByteS(14684);
		if (Class23_Sub1_Sub1.method299(-25976, i_72_)) {
		    if (i_73_ == 2)
			Class131_Sub41_Sub20.method2068((byte) -21);
		    Class187.anInt2674 = i_71_;
		    Class121.method1040((byte) -74, i_71_);
		    Class120_Sub2.method1036(-125, false);
		    Class168.method2433(Class187.anInt2674);
		    for (int i_74_ = 0; (i_74_ ^ 0xffffffff) > -101; i_74_++)
			Class131_Sub41_Sub16.aBooleanArray6371[i_74_] = true;
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -199) {
		for (int i_75_ = 0;
		     Class131_Sub2_Sub13.anIntArray5735.length > i_75_;
		     i_75_++) {
		    if (Class131_Sub2_Sub13.anIntArray5735[i_75_]
			!= Class79.anIntArray1062[i_75_]) {
			Class131_Sub2_Sub13.anIntArray5735[i_75_]
			    = Class79.anIntArray1062[i_75_];
			Class131_Sub8_Sub1.method1683((byte) 127, i_75_);
			Class159.anIntArray2124
			    [Class90.method841(31, Class212.anInt3113++)]
			    = i_75_;
		    }
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -27) {
		boolean bool = ((Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-71)
				 ^ 0xffffffff)
				== -2);
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		String string_76_ = string;
		if (bool)
		    string_76_ = Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231
				     .readString(false);
		long l = (long) Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readUnsignedShort(8104);
		long l_77_ = (long) Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.read3Bytes(false);
		int i_78_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByte(-42);
		int i_79_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		long l_80_ = l_77_ + (l << -1616765728);
		boolean bool_81_ = false;
	    while_142_:
		do {
		    for (int i_82_ = 0; i_82_ < 100; i_82_++) {
			if (Class131_Sub2_Sub35.aLongArray6042[i_82_]
			    == l_80_) {
			    bool_81_ = true;
			    break while_142_;
			}
		    }
		    if (i_78_ <= 1 && Class214.method2787(string_76_, -77))
			bool_81_ = true;
		} while (false);
		if (!bool_81_ && Class203.anInt2967 == 0) {
		    Class131_Sub2_Sub35.aLongArray6042[(Class121_Sub2_Sub1
							.anInt5427)]
			= l_80_;
		    Class121_Sub2_Sub1.anInt5427
			= (Class121_Sub2_Sub1.anInt5427 + 1) % 100;
		    String string_83_
			= (Class14.method215(i_79_, (byte) -99).method1984
			   (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231,
			    -8507));
		    if ((i_78_ ^ 0xffffffff) != -3) {
			if ((i_78_ ^ 0xffffffff) != -2)
			    Class23_Sub4_Sub3.method376(string, string_76_,
							-23645, 18, string_83_,
							0, null, i_79_);
			else
			    Class23_Sub4_Sub3.method376("<img=0>" + string,
							"<img=0>" + string_76_,
							-23645, 18, string_83_,
							0, null, i_79_);
		    } else
			Class23_Sub4_Sub3.method376("<img=1>" + string,
						    "<img=1>" + string_76_,
						    -23645, 18, string_83_, 0,
						    null, i_79_);
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 120) {
		int i_84_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedInt(-2);
		int i_85_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		if (i_84_ < -70000)
		    i_85_ += 32768;
		Class173 class173;
		if ((i_84_ ^ 0xffffffff) > -1)
		    class173 = null;
		else
		    class173 = Class190.method2615(i_84_, -65);
		if (class173 != null) {
		    for (int i_86_ = 0;
			 ((i_86_ ^ 0xffffffff)
			  > (class173.anIntArray2400.length ^ 0xffffffff));
			 i_86_++) {
			class173.anIntArray2400[i_86_] = 0;
			class173.anIntArray2418[i_86_] = 0;
		    }
		}
		Class166.method2420(i_85_, (byte) 60);
		int i_87_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		for (int i_88_ = 0;
		     (i_87_ ^ 0xffffffff) < (i_88_ ^ 0xffffffff); i_88_++) {
		    int i_89_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readUnsignedByteC(4095);
		    if (i_89_ == 255)
			i_89_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readUnsignedInt1(65280);
		    int i_90_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readUnsignedLEShort((byte) 79);
		    if (class173 != null
			&& class173.anIntArray2400.length > i_88_) {
			class173.anIntArray2400[i_88_] = i_90_;
			class173.anIntArray2418[i_88_] = i_89_;
		    }
		    Class35.method467(i_89_, i_85_, i_88_, i_90_ + -1, -21180);
		}
		if (class173 != null)
		    Class23_Sub4_Sub4.method383(-105, class173);
		Class131_Sub2_Sub38.method1645((byte) -76);
		Class190.anIntArray2809
		    [Class90.method841(31, Class131_Sub43.anInt4696++)]
		    = Class90.method841(32767, i_85_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -40) {
		for (int i_91_ = 0;
		     i_91_ < Class105.aClass23_Sub4_Sub1_Sub2Array1373.length;
		     i_91_++) {
		    if (Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_91_]
			!= null)
			Class105.aClass23_Sub4_Sub1_Sub2Array1373[i_91_]
			    .anInt5247
			    = -1;
		}
		for (int i_92_ = 0;
		     (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379.length
		      > i_92_);
		     i_92_++) {
		    if ((Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			 [i_92_])
			!= null)
			Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
			    [i_92_].anInt5247
			    = -1;
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 186) {
		byte i_93_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readSignedByteS(-6266);
		int i_94_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedLEShortA(-1);
		Class193.method2624(i_94_, 66, i_93_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 235) {
		int i_95_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		if ((i_95_ ^ 0xffffffff) == -65536)
		    i_95_ = -1;
		int i_96_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedInt1(65280);
		int i_97_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedShort(8104);
		if (Class23_Sub1_Sub1.method299(-25976, i_97_))
		    Class220.method2830(-1, 1, (byte) 67, i_96_, i_95_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 21) {
		int i_98_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedLEShortA(-1);
		int i_99_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedInt1(65280);
		int i_100_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		if (Class23_Sub1_Sub1.method299(-25976, i_100_))
		    Class131_Sub2_Sub22.method1576(1, i_99_, i_98_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 255) { //walk to a place or folow player and npc
	    	
	    		    	int LocalX = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
	    				.readUnsignedLEShortA(-1);
			    	int LocalY = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
					.readUnsignedInt1(65280);
			    	int Size = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
					 .readUnsignedShort(8104);
if (Size == 0) {
LocalX = LocalX - Class92.regionX;
LocalY = LocalY -  Class64.regionY;
				    Class210.routeFinder(-4, LocalX, 0, 126, LocalY, 1,
							(Class166
							 .aClass23_Sub4_Sub1_Sub2_2216
							 .anIntArray5328[0]),
							(Class166
							 .aClass23_Sub4_Sub1_Sub2_2216
							 .anIntArray5331[0]),
							0, 1, true, 2);
				    Class210.Flag(-4, LocalX, 0, 126, LocalY, 1,
							(Class166
							 .aClass23_Sub4_Sub1_Sub2_2216
							 .anIntArray5328[0]),
							(Class166
							 .aClass23_Sub4_Sub1_Sub2_2216
							 .anIntArray5331[0]),
							0, 1, true, 0);
}else if (Size == 1) { //folow npc
	Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
    = (Class23_Sub4_Sub2
       .aClass23_Sub4_Sub1_Sub1Array5379[LocalX]);
if (class23_sub4_sub1_sub1 != null) {
    Class210.FlagNpcPlayer
	(-2, class23_sub4_sub1_sub1.anIntArray5328[0],
	 0, -87,
	 class23_sub4_sub1_sub1.anIntArray5331[0],
	 class23_sub4_sub1_sub1.method335((byte) -121),
	 (Class166.aClass23_Sub4_Sub1_Sub2_2216
	  .anIntArray5328[0]),
	 (Class166.aClass23_Sub4_Sub1_Sub2_2216
	  .anIntArray5331[0]),
	 0,
	 class23_sub4_sub1_sub1.method335((byte) -64),
	 true);
}
}else if (Size == 2) { //folow player
    Class23_Sub4_Sub1_Sub2 class23_sub4_sub1_sub2
	= Class105.aClass23_Sub4_Sub1_Sub2Array1373[LocalX];
    if (class23_sub4_sub1_sub2 != null) {
	Class210.FlagNpcPlayer
	    (-2, class23_sub4_sub1_sub2.anIntArray5328[0], 0,
	     -61, class23_sub4_sub1_sub2.anIntArray5331[0],
	     class23_sub4_sub1_sub2.method335((byte) -81),
	     (Class166.aClass23_Sub4_Sub1_Sub2_2216
	      .anIntArray5328[0]),
	     (Class166.aClass23_Sub4_Sub1_Sub2_2216
	      .anIntArray5331[0]),
	     0, class23_sub4_sub1_sub2.method335((byte) -85),
	     true);
    }
}else if (Size == 3) { //test
	client.sendMessage("StartingTest");
	Class23_Sub4_Sub1_Sub1 npc = (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379[LocalX]);
	 if (npc != null) {
	int x = npc.anIntArray5328[0];
	int y = npc.anIntArray5331[0];
	client.sendMessage("npc["+LocalX+"] - x: "+x+", y: "+y+";");
	 }
    Class23_Sub4_Sub1_Sub2 player = Class105.aClass23_Sub4_Sub1_Sub2Array1373[LocalY];
    if (player != null) {
   int x = player.anIntArray5328[0];
   int y = player.anIntArray5331[0];
   client.sendMessage("player["+LocalY+"] - x: "+x+", y: "+y+";");
    }
    int localX = Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5328[0];
    int localY = Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5331[0];
    
    client.sendMessage("LocalPlayer - x: "+localX+", y: "+localY+";");
    client.sendMessage("Finished Test");
}else if (Size == 4) { //test
	Class23_Sub4_Sub1_Sub1 npc = (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379[LocalX]);
if (npc != null) {
    Class210.NpcRoute
	(LocalX, -2, Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5328[0],
	 0, -87,
	 Class166.aClass23_Sub4_Sub1_Sub2_2216.anIntArray5331[0],
	 npc.method335((byte) -121),
	 (npc.anIntArray5328[0]),
	 (npc.anIntArray5331[0]),
	 0,
	 npc.method335((byte) -64),
	 true);
}
}
	     
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 151) {
		int i_101_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEInt(-16777216);
		int i_102_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		Class193.method2624(i_102_, 119, i_101_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 192) {
		int i_103_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt2(0);
		int i_104_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		int i_105_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		int i_106_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		int i_107_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShortA(false);
		if (Class23_Sub1_Sub1.method299(-25976, i_104_))
		    Class220.method2830(i_106_, 7, (byte) 67, i_103_,
					i_107_ | i_105_ << -1401570352);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -16
		|| (Class131_Sub35.anInt4583 ^ 0xffffffff) == -79
		|| (Class131_Sub35.anInt4583 ^ 0xffffffff) == -230
		|| Class131_Sub35.anInt4583 == 212
		|| Class131_Sub35.anInt4583 == 155
		|| Class131_Sub35.anInt4583 == 82
		|| Class131_Sub35.anInt4583 == 6
		|| (Class131_Sub35.anInt4583 ^ 0xffffffff) == -113
		|| Class131_Sub35.anInt4583 == 249
		|| (Class131_Sub35.anInt4583 ^ 0xffffffff) == -224
		|| Class131_Sub35.anInt4583 == 221
		|| (Class131_Sub35.anInt4583 ^ 0xffffffff) == -23
		|| Class131_Sub35.anInt4583 == 254
		|| (Class131_Sub35.anInt4583 ^ 0xffffffff) == -28
		|| (Class131_Sub35.anInt4583 ^ 0xffffffff) == -116) {
		Class131_Sub1_Sub4.method1453((byte) -93);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -249) {
		int i_108_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		int i_109_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		int i_110_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		if (Class23_Sub1_Sub1.method299(-25976, i_109_))
		    Class131_Sub43.method2092(i_108_, i_110_, 0, (byte) 62);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -203) {
		Class118.anInt1551  = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-124);
		for (int i_111_ = 0;
		     (Class118.anInt1551 ^ 0xffffffff) < (i_111_ ^ 0xffffffff);
		     i_111_++) {
		    Class89.aStringArray3255[i_111_]
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readString(false);
		    Class18.aStringArray194[i_111_]
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readString(false);
		    if (Class18.aStringArray194[i_111_].equals(""))
			Class18.aStringArray194[i_111_]
			    = Class89.aStringArray3255[i_111_];
		    Class23_Sub1_Sub1.aStringArray5090[i_111_]
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readString(false);
		    Class215.aStringArray3159[i_111_]
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readString(false);
		    if (Class215.aStringArray3159[i_111_].equals(""))
			Class215.aStringArray3159[i_111_]
			    = Class23_Sub1_Sub1.aStringArray5090[i_111_];
		    Class111.aBooleanArray3275[i_111_] = false;
		}
		Class131_Sub35.anInt4587 = Class23_Sub5.anInt3758;
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 231) {
		Class160.anInt2129
		    = 30 * Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			       .readUnsignedLEShort((byte) 79);
		Class131_Sub35.anInt4583 = -1;
		Class131_Sub2_Sub39.anInt6079 = Class23_Sub5.anInt3758;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -64) {
		Class131_Sub2_Sub38.method1645((byte) -121);
		Class183_Sub1.anInt4965 = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-26);
		Class131_Sub2_Sub39.anInt6079 = Class23_Sub5.anInt3758;
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 170) {
		int i_112_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt(-2);
		int i_113_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		if (Class23_Sub1_Sub1.method299(-25976, i_113_))
		    Class220.method2830(0, 5, (byte) 67, i_112_, 2047);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -251) {
		PacketStream.updateNPC((byte) -112);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 246) {
		if ((Class131_Sub8_Sub1.anInt6100 ^ 0xffffffff) != -1)
		    Class143.aString1910
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readString(false);
		else
		    Class143.aString1910
			= Class131_Sub41_Sub11_Sub1.aString6555;
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -190) {
		int i_114_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		int i_115_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		int i_116_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShortA(false);
		int i_117_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt1(65280);
		int i_118_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		if (Class23_Sub1_Sub1.method299(-25976, i_118_))
		    Class173.method2461(i_114_, i_115_, i_116_, i_117_, false);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -208) {
		Class131_Sub37.anInt4609
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByteS(14684);
		Class131_Sub41_Sub19.anInt6418  = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-10);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 226) {
		boolean bool = (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(69) == 1);
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		String string_119_ = string;
		if (bool)
		    string_119_ = Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readString(false);
		long l = (long) Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readUnsignedShort(8104);
		long l_120_
		    = (long) Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .read3Bytes(false);
		int i_121_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-89);
		long l_122_ = l_120_ + (l << 1879859424);
		boolean bool_123_ = false;
	    while_143_:
		do {
		    for (int i_124_ = 0; (i_124_ ^ 0xffffffff) > -101;
			 i_124_++) {
			if ((Class131_Sub2_Sub35.aLongArray6042[i_124_]
			     ^ 0xffffffffffffffffL)
			    == (l_122_ ^ 0xffffffffffffffffL)) {
			    bool_123_ = true;
			    break while_143_;
			}
		    }
		    if (i_121_ <= 1) {
			if (Class103.aBoolean1353 && !Class60.aBoolean786
			    || Class183_Sub1.aBoolean4956)
			    bool_123_ = true;
			else if (Class214.method2787(string_119_, -122))
			    bool_123_ = true;
		    }
		} while (false);
		if (!bool_123_ && Class203.anInt2967 == 0) {
		    Class131_Sub2_Sub35.aLongArray6042[(Class121_Sub2_Sub1
							.anInt5427)]
			= l_122_;
		    Class121_Sub2_Sub1.anInt5427
			= (Class121_Sub2_Sub1.anInt5427 - -1) % 100;
		    String string_125_
			= (Class115.method981
			   (0,
			    (Class211.method2764
			     (63,
			      Class101.method885((Class23_Sub3_Sub1
						  .aClass131_Sub15_Sub2_5231),
						 32767)))));
		    if (i_121_ != 2) {
			if (i_121_ != 1)
			    Class23_Sub4_Sub3.method376(string, string_119_,
							-23645, 3, string_125_,
							0, null, -1);
			else
			    Class23_Sub4_Sub3.method376("<img=0>" + string,
							("<img=0>"
							 + string_119_),
							-23645, 7, string_125_,
							0, null, -1);
		    } else
			Class23_Sub4_Sub3.method376("<img=1>" + string,
						    "<img=1>" + string_119_,
						    -23645, 7, string_125_, 0,
						    null, -1);
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -74) {
		int i_126_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		if ((i_126_ ^ 0xffffffff) == -65536)
		    i_126_ = -1;
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		int i_127_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteC(4095);
		int i_128_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteS(14684);
		if ((i_128_ ^ 0xffffffff) <= -2
		    && (i_128_ ^ 0xffffffff) >= -9) {
		    if (string.equalsIgnoreCase("null"))
			string = null;
		    Class4.aStringArray3291[i_128_ - 1] = string;
		    Class23_Sub4_Sub5.anIntArray5114[i_128_ + -1] = i_126_;
		    Class42.aBooleanArray571[-1 + i_128_] = i_127_ == 0;
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -131) {
		int i_129_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEInt(-16777216);
		int i_130_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_131_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShortA(false);
		if (Class23_Sub1_Sub1.method299(-25976, i_130_))
		    Class23_Sub4_Sub4.method381((byte) -103, i_129_, i_131_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -92) {
		Class126.anInt1692 = Class23_Sub5.anInt3758;
		if ((Class131_Sub8_Sub1.anInt6100 ^ 0xffffffff) == -1) {
		    Class131_Sub27.aString4488 = null;
		    Class131_Sub35.anInt4583 = -1;
		    Class193.aString2840 = null;
		    Canvas_Sub1.aClass184Array46 = null;
		    Class74.anInt999 = 0;
		    return true;
		}
		Class131_Sub27.aString4488
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readString(false);
		boolean bool = ((Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231.readUnsignedByte(102)
				 ^ 0xffffffff)
				== -2);
		if (bool)
		    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			.readString(false);
		long l = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			     .readLong(114);
		Class193.aString2840
		    = Class131_Sub41_Sub21_Sub1.method2080(31013, l);
		Class207.aByte3023
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readSignedByte((byte) 127);
		int i_132_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(108);
		if (i_132_ == 255) {
		    Class131_Sub35.anInt4583 = -1;
		    return true;
		}
		Class74.anInt999 = i_132_;
		Class184[] class184s = new Class184[100];
		for (int i_133_ = 0;
		     (Class74.anInt999 ^ 0xffffffff) < (i_133_ ^ 0xffffffff);
		     i_133_++) {
		    class184s[i_133_] = new Class184();
		    class184s[i_133_].aString2628
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readString(false);
		    bool = (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				.readUnsignedByte(-123)
			    ^ 0xffffffff) == -2;
		    if (!bool)
			class184s[i_133_].aString2620
			    = class184s[i_133_].aString2628;
		    else
			class184s[i_133_].aString2620
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readString(false);
		    class184s[i_133_].anInt2632
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readUnsignedShort(8104);
		    class184s[i_133_].aByte2627
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readSignedByte((byte) 127);
		    class184s[i_133_].aString2634
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readString(false);
		    if (class184s[i_133_].aString2620.equals
			(Class166.aClass23_Sub4_Sub1_Sub2_2216.aString6491))
			Class85.aByte1118 = class184s[i_133_].aByte2627;
		}
		boolean bool_134_ = false;
		int i_135_ = Class74.anInt999;
		while (i_135_ > 0) {
		    i_135_--;
		    bool_134_ = true;
		    for (int i_136_ = 0;
			 (i_136_ ^ 0xffffffff) > (i_135_ ^ 0xffffffff);
			 i_136_++) {
			if ((class184s[i_136_].aString2628
				 .compareTo(class184s[1 + i_136_].aString2628)
			     ^ 0xffffffff)
			    < -1) {
			    Class184 class184 = class184s[i_136_];
			    class184s[i_136_] = class184s[i_136_ + 1];
			    class184s[1 + i_136_] = class184;
			    bool_134_ = false;
			}
		    }
		    if (bool_134_)
			break;
		}
		Canvas_Sub1.aClass184Array46 = class184s;
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -164) {
		int i_137_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		Class131_Sub27.method1836((byte) -121, i_137_);
		Class190.anIntArray2809
		    [Class90.method841(31, Class131_Sub43.anInt4696++)]
		    = Class90.method841(i_137_, 32767);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -146) {
		int i_138_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt(-2);
		int i_139_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt1(65280);
		int i_140_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		int i_141_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		if (i_141_ == 65535)
		    i_141_ = -1;
		if (Class23_Sub1_Sub1.method299(-25976, i_140_)) {
		    Class173 class173 = Class190.method2615(i_138_, -36);
		    if (!class173.aBoolean2355) {
			if ((i_141_ ^ 0xffffffff) == 0) {
			    class173.anInt2416 = 0;
			    Class131_Sub35.anInt4583 = -1;
			    return true;
			}
			Class29 class29
			    = Class131_Sub19.method1808(i_141_, false);
			class173.anInt2482 = class29.anInt303;
			class173.anInt2359 = i_141_;
			class173.anInt2416 = 4;
			class173.anInt2403 = class29.anInt337 * 100 / i_139_;
			class173.anInt2461 = class29.anInt317;
			Class23_Sub4_Sub4.method383(-77, class173);
		    } else {
			Class131_Sub2_Sub2.method1483(i_138_, i_139_, 94,
						      i_141_);
			Class29 class29
			    = Class131_Sub19.method1808(i_141_, false);
			Class173.method2461(class29.anInt303, class29.anInt337,
					    class29.anInt317, i_138_, false);
			Class131_Sub41_Sub17_Sub1.method2050(class29.anInt356,
							     class29.anInt367,
							     -124,
							     class29.anInt363,
							     i_138_);
		    }
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -140) {
		int i_142_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		int i_143_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		if (Class23_Sub1_Sub1.method299(-25976, i_143_))
		    Class131_Sub19.method1809(i_142_, true, string);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -55) {
		int i_144_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		if ((i_144_ ^ 0xffffffff) == -65536)
		    i_144_ = -1;
		int i_145_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteC(4095);
		int i_146_ = i_145_ >> 931451490;
		int i_147_ = 0x3 & i_145_;
		int i_148_ = Class23_Sub4_Sub1.anIntArray5244[i_146_];
		int i_149_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt1(65280);
		int i_150_ = 0x3 & i_149_ >> 642646012;
		int i_151_ = 0x3fff & i_149_ >> 386202990;
		i_151_ -= Class92.regionX;
		int i_152_ = i_149_ & 0x3fff;
		i_152_ -= Class64.regionY;
		OutputStream_Sub1.method92(8230, i_144_, i_146_, i_150_,
					   i_152_, i_147_, i_148_, i_151_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -67) {
		Class131_Sub37.anInt4609 = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-50);
		Class131_Sub41_Sub19.anInt6418  = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readUnsignedByteS(14684);
		for (Class131_Sub10 class131_sub10
			 = ((Class131_Sub10)
			    Class131_Sub24.aClass180_4468.method2520(0));
		     class131_sub10 != null;
		     class131_sub10
			 = ((Class131_Sub10)
			    Class131_Sub24.aClass180_4468.method2518(0))) {
		    int i_153_ = (int) (class131_sub10.aLong1791 & 0x3fffL);
		    int i_154_ = (int) (class131_sub10.aLong1791 >> 1795275854
					& 0x3fffL);
		    int i_155_
			= (int) (0x3L
				 & class131_sub10.aLong1791 >> -1109522980);
		    if (i_155_ == Class29.anInt300
			&& ((i_153_ ^ 0xffffffff)
			    <= (Class131_Sub41_Sub19.anInt6418 ^ 0xffffffff))
			&& i_153_ < 8 + Class131_Sub41_Sub19.anInt6418
			&& Class131_Sub37.anInt4609 <= i_154_
			&& i_154_ < Class131_Sub37.anInt4609 - -8) {
			class131_sub10.method1355((byte) 124);
			Class131.method1354(i_154_, -90, Class29.anInt300,
					    i_153_);
		    }
		}
		for (Class131_Sub3 class131_sub3
			 = ((Class131_Sub3)
			    Class131_Sub3.aClass119_4118.method1007(0));
		     class131_sub3 != null;
		     class131_sub3
			 = ((Class131_Sub3)
			    Class131_Sub3.aClass119_4118.method1014(0))) {
		    if (((Class131_Sub41_Sub19.anInt6418 ^ 0xffffffff)
			 >= (class131_sub3.anInt4113 ^ 0xffffffff))
			&& (class131_sub3.anInt4113
			    < 8 + Class131_Sub41_Sub19.anInt6418)
			&& Class131_Sub37.anInt4609 <= class131_sub3.anInt4105
			&& (class131_sub3.anInt4105
			    < 8 + Class131_Sub37.anInt4609)
			&& class131_sub3.anInt4122 == Class29.anInt300)
			class131_sub3.anInt4109 = 0;
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 137) {
		boolean bool = (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readUnsignedByte(-17)
				== 1);
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		String string_156_ = string;
		if (bool)
		    string_156_ = Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readString(false);
		long l = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			     .readLong(-11);
		long l_157_
		    = (long) Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		long l_158_
		    = (long) Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .read3Bytes(false);
		int i_159_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-101);
		long l_160_ = (l_157_ << -1297849952) - -l_158_;
		boolean bool_161_ = false;
	    while_144_:
		do {
		    for (int i_162_ = 0; (i_162_ ^ 0xffffffff) > -101;
			 i_162_++) {
			if ((Class131_Sub2_Sub35.aLongArray6042[i_162_]
			     ^ 0xffffffffffffffffL)
			    == (l_160_ ^ 0xffffffffffffffffL)) {
			    bool_161_ = true;
			    break while_144_;
			}
		    }
		    if (i_159_ <= 1) {
			if (Class103.aBoolean1353 && !Class60.aBoolean786
			    || Class183_Sub1.aBoolean4956)
			    bool_161_ = true;
			else if (Class214.method2787(string_156_, -121))
			    bool_161_ = true;
		    }
		} while (false);
		if (!bool_161_ && (Class203.anInt2967 ^ 0xffffffff) == -1) {
		    Class131_Sub2_Sub35.aLongArray6042[(Class121_Sub2_Sub1
							.anInt5427)]
			= l_160_;
		    Class121_Sub2_Sub1.anInt5427
			= (Class121_Sub2_Sub1.anInt5427 + 1) % 100;
		    String string_163_
			= (Class115.method981
			   (0,
			    (Class211.method2764
			     (63,
			      Class101.method885((Class23_Sub3_Sub1
						  .aClass131_Sub15_Sub2_5231),
						 32767)))));
		    if ((i_159_ ^ 0xffffffff) != -3 && i_159_ != 3) {
			if ((i_159_ ^ 0xffffffff) == -2)
			    Class23_Sub4_Sub3.method376
				("<img=0>" + string, "<img=0>" + string_156_,
				 -23645, 9, string_163_, 0,
				 Class51.method591(124, l), -1);
			else
			    Class23_Sub4_Sub3.method376(string, string_156_,
							-23645, 9, string_163_,
							0,
							Class51.method591(122,
									  l),
							-1);
		    } else
			Class23_Sub4_Sub3.method376("<img=1>" + string,
						    "<img=1>" + string_156_,
						    -23645, 9, string_163_, 0,
						    Class51.method591(124, l),
						    -1);
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -57) {
		int i_164_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_165_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteS(14684);
		int i_166_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_167_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEInt(-16777216);
		if (Class23_Sub1_Sub1.method299(-25976, i_166_)) {
		    Class131_Sub33 class131_sub33
			= ((Class131_Sub33)
			   Class83.aClass180_1096.method2521(-62,
							     (long) i_167_));
		    if (class131_sub33 != null)
			Class204.method2730(i_164_ != class131_sub33.anInt4556,
					    25697, class131_sub33, false);
		    Class131_Sub7.method1669(i_164_, i_165_, false, false,
					     i_167_);
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 140) {
		int i_168_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt1(65280);
		int i_169_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		int i_170_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShortA(false);
		if (i_170_ == 65535)
		    i_170_ = -1;
		int i_171_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		if (i_171_ == 65535)
		    i_171_ = -1;
		int i_172_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		if (Class23_Sub1_Sub1.method299(-25976, i_169_)) {
		    for (int i_173_ = i_171_;
			 (i_170_ ^ 0xffffffff) <= (i_173_ ^ 0xffffffff);
			 i_173_++) {
			long l
			    = (long) i_173_ + ((long) i_168_ << -1461868960);
			Class131_Sub37 class131_sub37
			    = ((Class131_Sub37)
			       Class172.aClass180_2290.method2521(68, l));
			Class131_Sub37 class131_sub37_174_;
			if (class131_sub37 == null) {
			    if ((i_173_ ^ 0xffffffff) == 0)
				class131_sub37_174_
				    = new Class131_Sub37((Class190.method2615
							  (i_168_, -59)
							  .aClass131_Sub37_2398
							  .anInt4601),
							 i_172_);
			    else
				class131_sub37_174_
				    = new Class131_Sub37(0, i_172_);
			} else {
			    class131_sub37_174_
				= new Class131_Sub37(class131_sub37.anInt4601,
						     i_172_);
			    class131_sub37.method1355((byte) 127);
			}
			Class172.aClass180_2290
			    .method2523(false, l, class131_sub37_174_);
		    }
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 128) {
		if (Class74.aFrame1014 != null)
		    Class148.method2177(Class91.anInt1184, -1, -1, false,
					true);
		byte[] is = new byte[Class131_Sub8_Sub1.anInt6100];
		Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
		    .method1787(0, Class131_Sub8_Sub1.anInt6100, 8156, is);
		String string
		    = Class131_Sub8_Sub1.method1682((Class131_Sub8_Sub1
						     .anInt6100),
						    0, 4238, is);
		Class169.method2438(false, string,
				    Stream.anInt4299 == 1,
				    Class23_Sub4.aSignLink_3734, true);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -125) {
		int i_175_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(59);
		int i_176_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShortA(false);
		OutputStream_Sub1.method93(i_176_, -70, i_175_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -76) {
		boolean bool = (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readUnsignedByte(103)
				== 1);
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		String string_177_ = string;
		if (bool)
		    string_177_ = Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readString(false);
		long l = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			     .readLong(94);
		long l_178_
		    = (long) Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		long l_179_
		    = (long) Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .read3Bytes(false);
		int i_180_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(62);
		int i_181_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		long l_182_ = (l_178_ << 930838624) - -l_179_;
		boolean bool_183_ = false;
	    while_145_:
		do {
		    for (int i_184_ = 0; (i_184_ ^ 0xffffffff) > -101;
			 i_184_++) {
			if ((Class131_Sub2_Sub35.aLongArray6042[i_184_]
			     ^ 0xffffffffffffffffL)
			    == (l_182_ ^ 0xffffffffffffffffL)) {
			    bool_183_ = true;
			    break while_145_;
			}
		    }
		    if ((i_180_ ^ 0xffffffff) >= -2
			&& Class214.method2787(string_177_, -116))
			bool_183_ = true;
		} while (false);
		if (!bool_183_ && (Class203.anInt2967 ^ 0xffffffff) == -1) {
		    Class131_Sub2_Sub35.aLongArray6042[(Class121_Sub2_Sub1
							.anInt5427)]
			= l_182_;
		    Class121_Sub2_Sub1.anInt5427
			= (1 + Class121_Sub2_Sub1.anInt5427) % 100;
		    String string_185_
			= (Class14.method215(i_181_, (byte) 92).method1984
			   (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231,
			    -8507));
		    if (i_180_ == 2)
			Class23_Sub4_Sub3.method376("<img=1>" + string,
						    "<img=1>" + string_177_,
						    -23645, 20, string_185_, 0,
						    Class51.method591(127, l),
						    i_181_);
		    else if (i_180_ == 1)
			Class23_Sub4_Sub3.method376("<img=0>" + string,
						    "<img=0>" + string_177_,
						    -23645, 20, string_185_, 0,
						    Class51.method591(123, l),
						    i_181_);
		    else
			Class23_Sub4_Sub3.method376(string, string_177_,
						    -23645, 20, string_185_, 0,
						    Class51.method591(125, l),
						    i_181_);
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -73) {
		int i_186_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShortA(false);
		int i_187_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_188_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt(-2);
		int i_189_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		if (Class23_Sub1_Sub1.method299(-25976, i_189_))
		    Class131_Sub6.method1657((i_186_ << -1850937360) - -i_187_,
					     13, i_188_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 158) {
		int i_190_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		if (i_190_ == 65535)
		    i_190_ = -1;
		int i_191_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_192_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt2(0);
		if (Class23_Sub1_Sub1.method299(-25976, i_191_))
		    Class220.method2830(-1, 2, (byte) 67, i_192_, i_190_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 203) {
		int i_193_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_194_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt(-2);
		if (Class23_Sub1_Sub1.method299(-25976, i_193_)) {
		    Class131_Sub33 class131_sub33
			= ((Class131_Sub33)
			   Class83.aClass180_1096.method2521(-63,
							     (long) i_194_));
		    if (class131_sub33 != null)
			Class204.method2730(true, 25697, class131_sub33,
					    false);
		    if (Class164.aClass173_2193 != null) {
			Class23_Sub4_Sub4.method383(-103,
						    Class164.aClass173_2193);
			Class164.aClass173_2193 = null;
		    }
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 228) {
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		boolean bool = ((Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231
				     .readUnsignedByte(-102)
				 ^ 0xffffffff)
				== -2);
		String string_195_;
		if (!bool)
		    string_195_ = string;
		else
		    string_195_ = Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readString(false);
		int i_196_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		byte i_197_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readSignedByte((byte) 127);
		boolean bool_198_ = false;
		if (i_197_ == -128)
		    bool_198_ = true;
		if (!bool_198_) {
		    String string_199_
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readString(false);
		    Class184 class184 = new Class184();
		    class184.aString2620 = string_195_;
		    class184.aByte2627 = i_197_;
		    class184.anInt2632 = i_196_;
		    class184.aString2634 = string_199_;
		    class184.aString2628 = string;
		    int i_200_;
		    for (i_200_ = -1 + Class74.anInt999;
			 (i_200_ ^ 0xffffffff) <= -1; i_200_--) {
			int i_201_
			    = Canvas_Sub1.aClass184Array46[i_200_]
				  .aString2620.compareTo(class184.aString2620);
			if ((i_201_ ^ 0xffffffff) == -1) {
			    Canvas_Sub1.aClass184Array46[i_200_].anInt2632
				= i_196_;
			    Canvas_Sub1.aClass184Array46[i_200_].aByte2627
				= i_197_;
			    Canvas_Sub1.aClass184Array46[i_200_].aString2634
				= string_199_;
			    if (string_195_.equals
				(Class166.aClass23_Sub4_Sub1_Sub2_2216
				 .aString6491))
				Class85.aByte1118 = i_197_;
			    Class126.anInt1692 = Class23_Sub5.anInt3758;
			    Class131_Sub35.anInt4583 = -1;
			    return true;
			}
			if (i_201_ < 0)
			    break;
		    }
		    if ((Class74.anInt999 ^ 0xffffffff)
			<= (Canvas_Sub1.aClass184Array46.length
			    ^ 0xffffffff)) {
			Class131_Sub35.anInt4583 = -1;
			return true;
		    }
		    for (int i_202_ = Class74.anInt999 + -1;
			 (i_202_ ^ 0xffffffff) < (i_200_ ^ 0xffffffff);
			 i_202_--)
			Canvas_Sub1.aClass184Array46[1 + i_202_]
			    = Canvas_Sub1.aClass184Array46[i_202_];
		    if ((Class74.anInt999 ^ 0xffffffff) == -1)
			Canvas_Sub1.aClass184Array46 = new Class184[100];
		    Canvas_Sub1.aClass184Array46[1 + i_200_] = class184;
		    Class74.anInt999++;
		    if (string_195_.equals(Class166
					   .aClass23_Sub4_Sub1_Sub2_2216
					   .aString6491))
			Class85.aByte1118 = i_197_;
		} else {
		    if ((Class74.anInt999 ^ 0xffffffff) == -1) {
			Class131_Sub35.anInt4583 = -1;
			return true;
		    }
		    boolean bool_203_ = false;
		    int i_204_;
		    for (i_204_ = 0; ((Class74.anInt999 ^ 0xffffffff)
				      < (i_204_ ^ 0xffffffff)); i_204_++) {
			if (Canvas_Sub1.aClass184Array46[i_204_]
				.aString2620.equals(string_195_)
			    && (Canvas_Sub1.aClass184Array46[i_204_].anInt2632
				^ 0xffffffff) == (i_196_ ^ 0xffffffff))
			    break;
		    }
		    if ((Class74.anInt999 ^ 0xffffffff)
			< (i_204_ ^ 0xffffffff)) {
			for (/**/;
			     ((i_204_ ^ 0xffffffff)
			      > (Class74.anInt999 + -1 ^ 0xffffffff));
			     i_204_++)
			    Canvas_Sub1.aClass184Array46[i_204_]
				= Canvas_Sub1.aClass184Array46[1 + i_204_];
			Class74.anInt999--;
			Canvas_Sub1.aClass184Array46[Class74.anInt999] = null;
		    }
		}
		Class126.anInt1692 = Class23_Sub5.anInt3758;
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -59) {
		int i_205_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt(-2);
		int i_206_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		if ((i_205_ ^ 0xffffffff) > 69999)
		    i_206_ += 32768;
		Class173 class173;
		if (i_205_ >= 0)
		    class173 = Class190.method2615(i_205_, -88);
		else
		    class173 = null;
		while (Class131_Sub8_Sub1.anInt6100
		       > (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .offset)) {
		    int i_207_ = Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231
				     .readSmart(-1647926640);
		    int i_208_ = Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231
				     .readUnsignedShort(8104);
		    int i_209_ = 0;
		    if (i_208_ != 0) {
			i_209_ = Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231.readUnsignedByte(86);
			if (i_209_ == 255)
			    i_209_
				= Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedInt(-2);
		    }
		    if (class173 != null && (i_207_ ^ 0xffffffff) <= -1
			&& ((i_207_ ^ 0xffffffff)
			    > (class173.anIntArray2400.length ^ 0xffffffff))) {
			class173.anIntArray2400[i_207_] = i_208_;
			class173.anIntArray2418[i_207_] = i_209_;
		    }
		    Class35.method467(i_209_, i_206_, i_207_, i_208_ + -1,
				      -21180);
		}
		if (class173 != null)
		    Class23_Sub4_Sub4.method383(-94, class173);
		Class131_Sub2_Sub38.method1645((byte) -87);
		Class190.anIntArray2809
		    [Class90.method841(Class131_Sub43.anInt4696++, 31)]
		    = Class90.method841(i_206_, 32767);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 107) {
		Class42.updatePlayer(124);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -107) {
		int i_210_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		int i_211_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt2(0);
		if (Class23_Sub1_Sub1.method299(-25976, i_210_))
		    Class23_Sub1_Sub2.method302(string, 17889, i_211_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -184) {
		int i_212_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt(-2);
		Class183_Sub1.aClass139_4955
		    = Class23_Sub4.aSignLink_3734.method2696((byte) -26,
							     i_212_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -8) {
		int i_213_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		int i_214_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		int i_215_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt2(0);
		if (Class23_Sub1_Sub1.method299(-25976, i_214_))
		    Class131_Sub29.method1849(i_215_, i_213_, 66);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -26) {
		int i_216_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-106);
		boolean bool = (i_216_ & 0x1 ^ 0xffffffff) == -2;
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		String string_217_
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readString(false);
		String string_218_
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readString(false);
		String string_219_
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readString(false);
		if (!bool) {
		    Class89.aStringArray3255[Class118.anInt1551] = string;
		    if (!string_217_.equals(""))
			Class18.aStringArray194[Class118.anInt1551]
			    = string_217_;
		    else
			Class18.aStringArray194[Class118.anInt1551] = string;
		    Class23_Sub1_Sub1.aStringArray5090[Class118.anInt1551]
			= string_218_;
		    if (!string_219_.equals(""))
			Class215.aStringArray3159[Class118.anInt1551]
			    = string_219_;
		    else
			Class215.aStringArray3159[Class118.anInt1551]
			    = string_218_;
		    Class111.aBooleanArray3275[Class118.anInt1551]
			= (Class90.method841(2, i_216_) ^ 0xffffffff) == -3;
		    Class118.anInt1551++;
		} else {
		    for (int i_220_ = 0; ((Class118.anInt1551 ^ 0xffffffff)
					  < (i_220_ ^ 0xffffffff)); i_220_++) {
			if (Class18.aStringArray194[i_220_]
				.equals(string_219_)) {
			    Class89.aStringArray3255[i_220_] = string;
			    if (!string_217_.equals(""))
				Class18.aStringArray194[i_220_] = string_217_;
			    else
				Class18.aStringArray194[i_220_] = string;
			    Class23_Sub1_Sub1.aStringArray5090[i_220_]
				= string_218_;
			    if (!string_219_.equals(""))
				Class215.aStringArray3159[i_220_]
				    = string_219_;
			    else
				Class215.aStringArray3159[i_220_]
				    = string_218_;
			    break;
			}
		    }
		}
		Class131_Sub35.anInt4587 = Class23_Sub5.anInt3758;
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -196) {
		if (Class187.anInt2674 != -1)
		    Class9.method185(Class187.anInt2674, 4095, 0);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 159) {
		Class42.method520(1,
				  Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readString(false));
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -66) {
		int i_221_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteC(4095);
		int i_222_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		if (Class23_Sub1_Sub1.method299(-25976, i_222_))
		    Class131_Sub2_Sub12.anInt5725 = i_221_;
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -245) {
		int i_223_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		if (Class23_Sub1_Sub1.method299(-25976, i_223_))
		    Class190.method2613(0);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 134) {
		int i_224_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(101);
		if (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.readUnsignedByte(-51)
		    != 0) {
		    Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.offset--;
		    Class23_Sub1.aClass52Array3699[i_224_]
			= new Class52(Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231);
		} else
		    Class23_Sub1.aClass52Array3699[i_224_] = new Class52();
		Class131_Sub35.anInt4583 = -1;
		Class131_Sub41_Sub20.anInt6424 = Class23_Sub5.anInt3758;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 157) {
		int i_225_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_226_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(83);
		int i_227_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(119);
		int i_228_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-78);
		int i_229_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-92);
		int i_230_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		if (Class23_Sub1_Sub1.method299(-25976, i_225_)) {
		    Class119.aBooleanArray1567[i_226_] = true;
		    Class189.anIntArray2764[i_226_] = i_227_;
		    Class151.anIntArray2020[i_226_] = i_228_;
		    Class23.anIntArray249[i_226_] = i_229_;
		    Class167.anIntArray2236[i_226_] = i_230_;
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -220) {
		int i_231_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShortA(false);
		int i_232_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt1(65280);
		if (Class23_Sub1_Sub1.method299(-25976, i_231_))
		    Class220.method2830(-1, 3, (byte) 67, i_232_, -1);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -123) {
		int i_233_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-124);
		int i_234_ = i_233_ >> -703486619;
		int i_235_ = 0x1f & i_233_;
		if ((i_235_ ^ 0xffffffff) == -1) {
		    Class131_Sub2_Sub5.aClass87Array5612[i_234_] = null;
		    Class131_Sub35.anInt4583 = -1;
		    return true;
		}
		Class87 class87 = new Class87();
		class87.anInt1135 = i_235_;
		class87.anInt1143 = Class23_Sub3_Sub1
					.aClass131_Sub15_Sub2_5231
					.readUnsignedByte(97);
		if (class87.anInt1143 >= 0
		    && (Class131_Sub35.aClass152Array4585.length
			> class87.anInt1143)) {
		    if (class87.anInt1135 == 1
			|| (class87.anInt1135 ^ 0xffffffff) == -11) {
			class87.anInt1126
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedShort(8104);
			Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.offset
			    += 5;
		    } else if ((class87.anInt1135 ^ 0xffffffff) <= -3
			       && class87.anInt1135 <= 6) {
			if (class87.anInt1135 == 2) {
			    class87.anInt1131 = 64;
			    class87.anInt1136 = 64;
			}
			if ((class87.anInt1135 ^ 0xffffffff) == -4) {
			    class87.anInt1136 = 64;
			    class87.anInt1131 = 0;
			}
			if ((class87.anInt1135 ^ 0xffffffff) == -5) {
			    class87.anInt1131 = 128;
			    class87.anInt1136 = 64;
			}
			if (class87.anInt1135 == 5) {
			    class87.anInt1131 = 64;
			    class87.anInt1136 = 0;
			}
			if (class87.anInt1135 == 6) {
			    class87.anInt1136 = 128;
			    class87.anInt1131 = 64;
			}
			class87.anInt1135 = 2;
			class87.anInt1127
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedShort(8104);
			class87.anInt1137
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedShort(8104);
			class87.anInt1132
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedByte(-127);
			class87.anInt1134
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readUnsignedShort(8104);
		    }
		    class87.anInt1139
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readUnsignedShort(8104);
		    if ((class87.anInt1139 ^ 0xffffffff) == -65536)
			class87.anInt1139 = -1;
		    Class131_Sub2_Sub5.aClass87Array5612[i_234_] = class87;
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 208) {
		Class131_Sub31.anInt4524
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readUnsignedByte(84);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 61) {
		int i_236_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt2(0);
		int i_237_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readSignedLEShort(-107);
		int i_238_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		if (Class23_Sub1_Sub1.method299(-25976, i_238_))
		    Class212.method2768(i_236_, i_237_, 5);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -75) {
		Class131_Sub41_Sub5.anInt6222
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readUnsignedByte(-106);
		Class145.anInt1930
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readUnsignedByte(-79);
		Class131_Sub2_Sub2.anInt5583
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readUnsignedByte(62);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 169) {
		Class131_Sub41_Sub2.method1929((byte) -112);
		Class131_Sub2_Sub38.method1645((byte) -127);
		Class212.anInt3113 += 32;
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 20) {
		boolean bool = (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readUnsignedByte(110)
				== 1);
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		String string_239_
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readString(false);
		int i_240_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_241_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(85);
		String string_242_ = "";
		boolean bool_243_ = false;
		if ((i_240_ ^ 0xffffffff) < -1) {
		    string_242_ = Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readString(false);
		    bool_243_ = (Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231.readUnsignedByte(-89)
				 ^ 0xffffffff) == -2;
		}
		for (int i_244_ = 0; Class33.anInt469 > i_244_; i_244_++) {
		    if (bool) {
			if (string_239_.equals(Class23_Sub2.aStringArray3707
					       [i_244_])) {
			    Class23_Sub2.aStringArray3707[i_244_] = string;
			    string = null;
			    Class131_Sub25.aStringArray4477[i_244_]
				= string_239_;
			    break;
			}
		    } else if (string.equals(Class23_Sub2.aStringArray3707
					     [i_244_])) {
			if ((Class143.anIntArray1906[i_244_] ^ 0xffffffff)
			    != (i_240_ ^ 0xffffffff)) {
			    Class143.anIntArray1906[i_244_] = i_240_;
			    if (i_240_ > 0)
				Class131_Sub2_Sub10_Sub1.method1519
				    ("", 5, -80, "", 0,
				     string + Class110_Sub1.aString3894);
			    if ((i_240_ ^ 0xffffffff) == -1)
				Class131_Sub2_Sub10_Sub1.method1519
				    ("", 5, -111, "", 0,
				     string + Class131_Sub2.aString4103);
			}
			Class131_Sub25.aStringArray4477[i_244_] = string_239_;
			Class89.aStringArray3267[i_244_] = string_242_;
			Class20.anIntArray234[i_244_] = i_241_;
			Class183_Sub1.aBooleanArray4952[i_244_] = bool_243_;
			string = null;
			break;
		    }
		}
		if (string != null && Class33.anInt469 < 200) {
		    Class23_Sub2.aStringArray3707[Class33.anInt469] = string;
		    Class131_Sub25.aStringArray4477[Class33.anInt469]
			= string_239_;
		    Class143.anIntArray1906[Class33.anInt469] = i_240_;
		    Class89.aStringArray3267[Class33.anInt469] = string_242_;
		    Class20.anIntArray234[Class33.anInt469] = i_241_;
		    Class183_Sub1.aBooleanArray4952[Class33.anInt469]
			= bool_243_;
		    Class33.anInt469++;
		}
		Class131_Sub35.anInt4587 = Class23_Sub5.anInt3758;
		boolean bool_245_ = false;
		int i_246_ = Class33.anInt469;
		while ((i_246_ ^ 0xffffffff) < -1) {
		    i_246_--;
		    bool_245_ = true;
		    for (int i_247_ = 0;
			 (i_247_ ^ 0xffffffff) > (i_246_ ^ 0xffffffff);
			 i_247_++) {
			if ((((Class110_Sub2.anInt3914 ^ 0xffffffff)
			      != (Class143.anIntArray1906[i_247_]
				  ^ 0xffffffff))
			     && ((Class110_Sub2.anInt3914 ^ 0xffffffff)
				 == (Class143.anIntArray1906[1 + i_247_]
				     ^ 0xffffffff)))
			    || (Class143.anIntArray1906[i_247_] == 0
				&& (Class143.anIntArray1906[i_247_ - -1]
				    != 0))) {
			    int i_248_ = Class143.anIntArray1906[i_247_];
			    Class143.anIntArray1906[i_247_]
				= Class143.anIntArray1906[1 + i_247_];
			    Class143.anIntArray1906[1 + i_247_] = i_248_;
			    String string_249_
				= Class89.aStringArray3267[i_247_];
			    Class89.aStringArray3267[i_247_]
				= Class89.aStringArray3267[i_247_ - -1];
			    Class89.aStringArray3267[1 + i_247_] = string_249_;
			    String string_250_
				= Class23_Sub2.aStringArray3707[i_247_];
			    Class23_Sub2.aStringArray3707[i_247_]
				= Class23_Sub2.aStringArray3707[1 + i_247_];
			    Class23_Sub2.aStringArray3707[i_247_ + 1]
				= string_250_;
			    String string_251_
				= Class131_Sub25.aStringArray4477[i_247_];
			    Class131_Sub25.aStringArray4477[i_247_]
				= Class131_Sub25.aStringArray4477[i_247_ + 1];
			    Class131_Sub25.aStringArray4477[1 + i_247_]
				= string_251_;
			    int i_252_ = Class20.anIntArray234[i_247_];
			    Class20.anIntArray234[i_247_]
				= Class20.anIntArray234[1 + i_247_];
			    Class20.anIntArray234[1 + i_247_] = i_252_;
			    boolean bool_253_
				= Class183_Sub1.aBooleanArray4952[i_247_];
			    Class183_Sub1.aBooleanArray4952[i_247_]
				= Class183_Sub1.aBooleanArray4952[i_247_ + 1];
			    Class183_Sub1.aBooleanArray4952[i_247_ + 1]
				= bool_253_;
			    bool_245_ = false;
			}
		    }
		    if (bool_245_)
			break;
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 206) {
		int i_254_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		int i_255_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEInt(-16777216);
		int i_256_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt2(0);
		if (Class23_Sub1_Sub1.method299(-25976, i_254_)) {
		    Class131_Sub33 class131_sub33
			= ((Class131_Sub33)
			   Class83.aClass180_1096.method2521(90,
							     (long) i_255_));
		    Class131_Sub33 class131_sub33_257_
			= ((Class131_Sub33)
			   Class83.aClass180_1096.method2521(108,
							     (long) i_256_));
		    if (class131_sub33_257_ != null)
			Class204.method2730((class131_sub33 == null
					     || (class131_sub33.anInt4556
						 != (class131_sub33_257_
						     .anInt4556))),
					    25697, class131_sub33_257_, false);
		    if (class131_sub33 != null) {
			class131_sub33.method1355((byte) 114);
			Class83.aClass180_1096.method2523(false, (long) i_256_,
							  class131_sub33);
		    }
		    Class173 class173 = Class190.method2615(i_255_, -31);
		    if (class173 != null)
			Class23_Sub4_Sub4.method383(-92, class173);
		    class173 = Class190.method2615(i_256_, -73);
		    if (class173 != null) {
			Class23_Sub4_Sub4.method383(-90, class173);
			Class89.method838(68, class173, true);
		    }
		    if ((Class187.anInt2674 ^ 0xffffffff) != 0)
			Class9.method185(Class187.anInt2674, 4095, 1);
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 127) {
		int i_258_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-73);
		int i_259_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-33);
		if ((i_258_ ^ 0xffffffff) == -256) {
		    i_258_ = -1;
		    i_259_ = -1;
		}
		Class47.method578(i_259_, i_258_, (byte) 126);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -82) {
		Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231.offset += 28;
		if (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			.method1780(-76))
		    Class131_Sub29.method1851((Class23_Sub3_Sub1
					       .aClass131_Sub15_Sub2_5231),
					      -28 + (Class23_Sub3_Sub1
						     .aClass131_Sub15_Sub2_5231
						     .offset),
					      20164);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -42) {
		int i_260_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteS(14684);
		int i_261_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		int i_262_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		Class23_Sub4_Sub1_Sub1 class23_sub4_sub1_sub1
		    = (Class23_Sub4_Sub2.aClass23_Sub4_Sub1_Sub1Array5379
		       [i_262_]);
		if (class23_sub4_sub1_sub1 != null)
		    Class131_Sub2_Sub13.method1534(0, class23_sub4_sub1_sub1,
						   i_261_, i_260_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -45) {
		int i_263_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_264_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-34);
		int i_265_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-122);
		int i_266_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_267_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(59);
		int i_268_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(64);
		if (Class23_Sub1_Sub1.method299(-25976, i_263_))
		    Class103.method906(i_265_, i_266_, i_268_, -1260, i_264_,
				       i_267_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -142) {
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		int i_269_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		String string_270_
		    = (Class14.method215(i_269_, (byte) 98).method1984
		       (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231, -8507));
		Class23_Sub4_Sub3.method376(string, string, -23645, 19,
					    string_270_, 0, null, i_269_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -147) {
		Class121_Sub2.readMapRegion(true, true);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -132) {
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		int i_271_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_272_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		if (Class23_Sub1_Sub1.method299(-25976, i_272_))
		    Class131_Sub19.method1809(i_271_, true, string);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 147) {
		int i_273_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_274_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_275_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_276_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		if (Class23_Sub1_Sub1.method299(-25976, i_273_)
		    && (Class131_Sub2_Sub9.aClass173ArrayArray5684[i_274_]
			!= null)) {
		    for (int i_277_ = i_275_; i_277_ < i_276_; i_277_++) {
			int i_278_
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .read3Bytes(false);
			if (((Class131_Sub2_Sub9.aClass173ArrayArray5684
			      [i_274_]).length
			     ^ 0xffffffff) < (i_277_ ^ 0xffffffff)
			    && (Class131_Sub2_Sub9.aClass173ArrayArray5684
				[i_274_][i_277_]) != null)
			    Class131_Sub2_Sub9.aClass173ArrayArray5684
				[i_274_][i_277_].anInt2340
				= i_278_;
		    }
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -4) {
		int i_279_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShortA(false);
		int i_280_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteS(14684);
		int i_281_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt2(0);
		if (Class23_Sub1_Sub1.method299(-25976, i_279_))
		    Class131_Sub41_Sub1.method1923(-1, i_280_, i_281_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -189) {
		int i_282_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		if ((i_282_ ^ 0xffffffff) == -65536)
		    i_282_ = -1;
		int i_283_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteS(14684);
		Class111.method954(true, i_282_, i_283_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -31) {
		int i_284_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(71);
		int i_285_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readLE3Bytes((byte) 100);
		int i_286_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		if ((i_286_ ^ 0xffffffff) == -65536)
		    i_286_ = -1;
		Class135.method2102(i_286_, i_284_, 1, i_285_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 104) {
		Class126.method1107((Class23_Sub3_Sub1
				     .aClass131_Sub15_Sub2_5231),
				    Class23_Sub4.aSignLink_3734,
				    Class131_Sub8_Sub1.anInt6100, (byte) 77);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 200) {
		int i_287_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		if (Class23_Sub1_Sub1.method299(-25976, i_287_))
		    Class209.method2751((byte) -58);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -54) {
		int i_288_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt2(0);
		int i_289_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShortA(false);
		int i_290_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		if (Class23_Sub1_Sub1.method299(-25976, i_289_))
		    Class131_Sub25.method1830(i_290_, i_288_, (byte) 61);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -84) {
		int i_291_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteA((byte) 99);
		int i_292_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByteA((byte) -125);
		int i_293_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-35);
		Class29.anInt300 = i_293_ >> 1069224001;
		Class166.aClass23_Sub4_Sub1_Sub2_2216.method358
		    ((i_293_ & 0x1) == 1, true, i_291_, Class29.anInt300,
		     i_292_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -119) {
		int i_294_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEInt(-16777216);
		int i_295_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt2(0);
		int i_296_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		int i_297_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		if (Class23_Sub1_Sub1.method299(-25976, i_297_))
		    Class220.method2830(i_295_, 5, (byte) 67, i_294_, i_296_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -71) {
		int i_298_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		Object[] objects = new Object[1 + string.length()];
		for (int i_299_ = -1 + string.length();
		     (i_299_ ^ 0xffffffff) <= -1; i_299_--) {
		    if (string.charAt(i_299_) != 's')
			objects[1 + i_299_]
			    = new Integer(Class23_Sub3_Sub1
					      .aClass131_Sub15_Sub2_5231
					      .readUnsignedInt(-2));
		    else
			objects[i_299_ + 1]
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readString(false);
		}
		objects[0]
		    = new Integer(Class23_Sub3_Sub1
				      .aClass131_Sub15_Sub2_5231
				      .readUnsignedInt(-2));
		if (Class23_Sub1_Sub1.method299(-25976, i_298_)) {
		    Class131_Sub14 class131_sub14 = new Class131_Sub14();
		    class131_sub14.anObjectArray4281 = objects;
		    Class168.method2437(class131_sub14);
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 160) {
		int i_300_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		int i_301_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEInt(-16777216);
		int i_302_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readSignedLEShort(-112);
		int i_303_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readSignedShortA((byte) -34);
		if (Class23_Sub1_Sub1.method299(-25976, i_300_))
		    Class131_Sub27.method1839(i_303_, 64, i_302_, i_301_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 76) {
		Class121_Sub2.readMapRegion(false, true);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -244) {
		int i_304_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEInt(-16777216);
		int i_305_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		OutputStream_Sub1.method93(i_305_, 113, i_304_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -137) {
		int i_306_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		if ((i_306_ ^ 0xffffffff) == -65536)
		    i_306_ = -1;
		int i_307_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(77);
		int i_308_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_309_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-16);
		Class131_Sub2_Sub13.method1535(0, i_309_, i_308_, i_306_,
					       i_307_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -93) {
		String string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				    .readString(false);
		String string_310_
		    = (Class115.method981
		       (0,
			(Class211.method2764
			 (63, Class101.method885((Class23_Sub3_Sub1
						  .aClass131_Sub15_Sub2_5231),
						 32767)))));
		Class131_Sub2_Sub10_Sub1.method1519(string, 6, -50, string, 0,
						    string_310_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 2) {
		Class131_Sub37.anInt4609
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readUnsignedByteS(14684);
		Class131_Sub41_Sub19.anInt6418
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readUnsignedByteS(14684);
		while (Class131_Sub8_Sub1.anInt6100
		       > (Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .offset)) {
		    Class131_Sub35.anInt4583
			= Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			      .readUnsignedByte(126);
		    Class131_Sub1_Sub4.method1453((byte) -93);
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 193) {
		int i_311_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readSmart(-1647926640);
		int i_312_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt(-2);
		int i_313_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(94);
		String string = "";
		String string_314_ = string;
		if ((i_313_ & 0x1 ^ 0xffffffff) != -1) {
		    string = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readString(false);
		    if ((i_313_ & 0x2) == 0)
			string_314_ = string;
		    else
			string_314_
			    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				  .readString(false);
		}
		String string_315_
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readString(false);
		if ((i_311_ ^ 0xffffffff) != -100) {
		    if (!string_314_.equals("")
			&& Class214.method2787(string_314_, -122)) {
			Class131_Sub35.anInt4583 = -1;
			return true;
		    }
		    Class131_Sub2_Sub10_Sub1.method1519(string_314_, i_311_,
							-110, string, i_312_,
							string_315_);
		} else
		    Class131_Sub2_Sub15.method1540(-54, string_315_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -237) {
		Class41.method512(2);
		Class131_Sub35.anInt4583 = -1;
		return false;
	    }
	    if (Class131_Sub35.anInt4583 == 121) {
		int i_316_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_317_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-95);
		int i_318_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-111);
		int i_319_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedShort(8104);
		int i_320_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-53);
		int i_321_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedByte(-118);
		if (Class23_Sub1_Sub1.method299(-25976, i_316_))
		    Class204.method2731(true, (byte) 90, i_320_, i_319_,
					i_317_, i_321_, i_318_);
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if ((Class131_Sub35.anInt4583 ^ 0xffffffff) == -114) {
		int i_322_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedInt(-2);
		int i_323_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		if ((i_323_ ^ 0xffffffff) == -65536)
		    i_323_ = -1;
		int i_324_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShort((byte) 79);
		if ((i_324_ ^ 0xffffffff) == -65536)
		    i_324_ = -1;
		int i_325_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEShortA(-1);
		int i_326_ = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
				 .readUnsignedLEInt(-16777216);
		if (Class23_Sub1_Sub1.method299(-25976, i_325_)) {
		    for (int i_327_ = i_324_; i_323_ >= i_327_; i_327_++) {
			long l = (long) i_327_ + ((long) i_326_ << 1435713952);
			Class131_Sub37 class131_sub37
			    = ((Class131_Sub37)
			       Class172.aClass180_2290.method2521(57, l));
			Class131_Sub37 class131_sub37_328_;
			if (class131_sub37 == null) {
			    if ((i_327_ ^ 0xffffffff) == 0)
				class131_sub37_328_
				    = new Class131_Sub37(i_322_,
							 (Class190.method2615
							  (i_326_, -87)
							  .aClass131_Sub37_2398
							  .anInt4602));
			    else
				class131_sub37_328_
				    = new Class131_Sub37(i_322_, -1);
			} else {
			    class131_sub37_328_
				= new Class131_Sub37(i_322_,
						     class131_sub37.anInt4602);
			    class131_sub37.method1355((byte) 119);
			}
			Class172.aClass180_2290
			    .method2523(false, l, class131_sub37_328_);
		    }
		}
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    if (Class131_Sub35.anInt4583 == 5) {
		Applet_Sub1.anInt18
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readUnsignedByte(61);
		Class131_Sub35.anInt4587 = Class23_Sub5.anInt3758;
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    int i_329_ = -41 % ((arg0 - 61) / 37);
	    if (Class131_Sub35.anInt4583 == 0) {
		Class131_Sub2_Sub38.method1645((byte) -67);
		Class131_Sub2_Sub10.anInt5703
		    = Class23_Sub3_Sub1.aClass131_Sub15_Sub2_5231
			  .readSignedShort(1625554944);
		Class131_Sub2_Sub39.anInt6079 = Class23_Sub5.anInt3758;
		Class131_Sub35.anInt4583 = -1;
		return true;
	    }
	    Class45.method563(("T1 - " + Class131_Sub35.anInt4583 + ","
			       + Class56.anInt738 + ","
			       + Class131_Sub41_Sub19.anInt6414 + " - "
			       + Class131_Sub8_Sub1.anInt6100),
			      null, 0);
	    Class41.method512(2);
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"nh.H(" + arg0 + ')');
	}
    }
    
    public static void method1583(int arg0, int arg1, Class130 arg2) {
	anInt5880++;
	Class160.method2382(arg2);
	if (arg0 > 1) {
	    for (int i = 0; i < Class131_Sub41_Sub11_Sub1.anInt6546; i++) {
		for (int i_330_ = 0;
		     ((Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff)
		      < (i_330_ ^ 0xffffffff));
		     i_330_++) {
		    if ((0x2 & (Class23_Sub2_Sub1.aByteArrayArrayArray4992[1]
				[i][i_330_]))
			== 2)
			Class128_Sub1.method1146(i, i_330_);
		}
	    }
	}
	for (int i = 0; (i ^ 0xffffffff) > (arg0 ^ 0xffffffff); i++) {
	    for (int i_331_ = 0; Class131_Sub2_Sub26.anInt5931 >= i_331_;
		 i_331_++) {
		for (int i_332_ = 0;
		     ((Class131_Sub41_Sub11_Sub1.anInt6546 ^ 0xffffffff)
		      <= (i_332_ ^ 0xffffffff));
		     i_332_++) {
		    if ((0x1 & (Class121.aByteArrayArrayArray1590[i][i_332_]
				[i_331_])
			 ^ 0xffffffff)
			!= -1) {
			int i_333_ = i_331_;
			int i_334_ = i_331_;
			int i_335_ = i;
			int i_336_ = i;
			for (/**/; Class131_Sub2_Sub26.anInt5931 > i_334_;
			     i_334_++) {
			    if (((Class121.aByteArrayArrayArray1590[i][i_332_]
				  [1 + i_334_]) & 0x1
				 ^ 0xffffffff)
				== -1)
				break;
			}
			for (/**/; i_333_ > 0; i_333_--) {
			    if ((0x1 & (Class121.aByteArrayArrayArray1590[i]
					[i_332_][i_333_ - 1])
				 ^ 0xffffffff)
				== -1)
				break;
			}
		    while_146_:
			for (/**/; i_335_ > 0; i_335_--) {
			    for (int i_337_ = i_333_;
				 ((i_337_ ^ 0xffffffff)
				  >= (i_334_ ^ 0xffffffff));
				 i_337_++) {
				if ((0x1 & (Class121.aByteArrayArrayArray1590
					    [i_335_ - 1][i_332_][i_337_]))
				    == 0)
				    break while_146_;
			    }
			}
		    while_147_:
			for (/**/; (i_336_ ^ 0xffffffff) > -4; i_336_++) {
			    for (int i_338_ = i_333_; i_338_ <= i_334_;
				 i_338_++) {
				if (((Class121.aByteArrayArrayArray1590
				      [i_336_ - -1][i_332_][i_338_]) & 0x1
				     ^ 0xffffffff)
				    == -1)
				    break while_147_;
			    }
			}
			int i_339_ = ((1 + (-i_333_ + i_334_))
				      * (-i_335_ + i_336_ + 1));
			if ((i_339_ ^ 0xffffffff) <= -3) {
			    int i_340_ = 240;
			    int i_341_
				= -i_340_ + (Cryption.anIntArrayArrayArray1828
					     [i_336_][i_332_][i_333_]);
			    int i_342_ = (Cryption.anIntArrayArrayArray1828
					  [i_335_][i_332_][i_333_]);
			    Class193.method2629(1, 128 * i_332_, 128 * i_332_,
						i_333_ * 128,
						128 + 128 * i_334_, i_341_,
						i_342_);
			    for (int i_343_ = i_335_; i_336_ >= i_343_;
				 i_343_++) {
				for (int i_344_ = i_333_;
				     ((i_344_ ^ 0xffffffff)
				      >= (i_334_ ^ 0xffffffff));
				     i_344_++)
				    Class121.aByteArrayArrayArray1590
					[i_343_][i_332_][i_344_]
					= (byte) (Class90.method841
						  ((Class121
						    .aByteArrayArrayArray1590
						    [i_343_][i_332_][i_344_]),
						   -2));
			    }
			}
		    }
		    if (((Class121.aByteArrayArrayArray1590[i][i_332_][i_331_]
			  & 0x2)
			 ^ 0xffffffff)
			!= -1) {
			int i_345_ = i_332_;
			int i_346_ = i_332_;
			int i_347_ = i;
			int i_348_ = i;
			for (/**/; (i_345_ ^ 0xffffffff) < -1; i_345_--) {
			    if (((Class121.aByteArrayArrayArray1590[i]
				  [-1 + i_345_][i_331_]) & 0x2
				 ^ 0xffffffff)
				== -1)
				break;
			}
			for (/**/;
			     Class131_Sub41_Sub11_Sub1.anInt6546 > i_346_;
			     i_346_++) {
			    if (((Class121.aByteArrayArrayArray1590[i]
				  [i_346_ + 1][i_331_]) & 0x2
				 ^ 0xffffffff)
				== -1)
				break;
			}
		    while_148_:
			for (/**/; i_347_ > 0; i_347_--) {
			    for (int i_349_ = i_345_;
				 ((i_346_ ^ 0xffffffff)
				  <= (i_349_ ^ 0xffffffff));
				 i_349_++) {
				if ((0x2 & (Class121.aByteArrayArrayArray1590
					    [-1 + i_347_][i_349_][i_331_]))
				    == 0)
				    break while_148_;
			    }
			}
		    while_149_:
			for (/**/; (i_348_ ^ 0xffffffff) > -4; i_348_++) {
			    for (int i_350_ = i_345_; i_350_ <= i_346_;
				 i_350_++) {
				if (((Class121.aByteArrayArrayArray1590
				      [1 + i_348_][i_350_][i_331_])
				     & 0x2)
				    == 0)
				    break while_149_;
			    }
			}
			int i_351_ = ((-i_347_ + (i_348_ + 1))
				      * (1 + (i_346_ - i_345_)));
			if ((i_351_ ^ 0xffffffff) <= -3) {
			    int i_352_ = 240;
			    int i_353_ = ((Cryption.anIntArrayArrayArray1828
					   [i_348_][i_345_][i_331_])
					  + -i_352_);
			    int i_354_ = (Cryption.anIntArrayArrayArray1828
					  [i_347_][i_345_][i_331_]);
			    Class193.method2629(2, 128 * i_345_,
						128 * i_346_ - -128,
						128 * i_331_, i_331_ * 128,
						i_353_, i_354_);
			    for (int i_355_ = i_347_; i_355_ <= i_348_;
				 i_355_++) {
				for (int i_356_ = i_345_; i_356_ <= i_346_;
				     i_356_++)
				    Class121.aByteArrayArrayArray1590
					[i_355_][i_356_][i_331_]
					= (byte) (Class90.method841
						  ((Class121
						    .aByteArrayArrayArray1590
						    [i_355_][i_356_][i_331_]),
						   -3));
			    }
			}
		    }
		    if (((Class121.aByteArrayArrayArray1590[i][i_332_][i_331_]
			  & 0x4)
			 ^ 0xffffffff)
			!= -1) {
			int i_357_ = i_332_;
			int i_358_ = i_332_;
			int i_359_;
			for (i_359_ = i_331_;
			     (i_359_ > 0
			      && (0x4 & (Class121.aByteArrayArrayArray1590[i]
					 [i_332_][-1 + i_359_])
				  ^ 0xffffffff) != -1);
			     i_359_--) {
			    /* empty */
			}
			int i_360_;
			for (i_360_ = i_331_;
			     ((Class131_Sub2_Sub26.anInt5931 ^ 0xffffffff)
			      < (i_360_ ^ 0xffffffff));
			     i_360_++) {
			    if ((0x4 & (Class121.aByteArrayArrayArray1590[i]
					[i_332_][1 + i_360_]))
				== 0)
				break;
			}
		    while_150_:
			for (/**/; i_357_ > 0; i_357_--) {
			    for (int i_361_ = i_359_; i_360_ >= i_361_;
				 i_361_++) {
				if ((0x4 & (Class121.aByteArrayArrayArray1590
					    [i][-1 + i_357_][i_361_])
				     ^ 0xffffffff)
				    == -1)
				    break while_150_;
			    }
			}
		    while_151_:
			for (/**/; ((Class131_Sub41_Sub11_Sub1.anInt6546
				     ^ 0xffffffff)
				    < (i_358_ ^ 0xffffffff)); i_358_++) {
			    for (int i_362_ = i_359_; i_362_ <= i_360_;
				 i_362_++) {
				if (((Class121.aByteArrayArrayArray1590[i]
				      [1 + i_358_][i_362_]) & 0x4
				     ^ 0xffffffff)
				    == -1)
				    break while_151_;
			    }
			}
			if (((1 + (-i_357_ + i_358_)) * (i_360_
							 + (-i_359_ + 1))
			     ^ 0xffffffff)
			    <= -5) {
			    int i_363_ = (Cryption.anIntArrayArrayArray1828[i]
					  [i_357_][i_359_]);
			    Class193.method2629(4, 128 * i_357_,
						128 + 128 * i_358_,
						i_359_ * 128,
						128 + 128 * i_360_, i_363_,
						i_363_);
			    for (int i_364_ = i_357_; i_358_ >= i_364_;
				 i_364_++) {
				for (int i_365_ = i_359_;
				     ((i_365_ ^ 0xffffffff)
				      >= (i_360_ ^ 0xffffffff));
				     i_365_++)
				    Class121.aByteArrayArrayArray1590[i]
					[i_364_][i_365_]
					= (byte) (Class90.method841
						  ((Class121
						    .aByteArrayArrayArray1590
						    [i][i_364_][i_365_]),
						   -5));
			    }
			}
		    }
		}
	    }
	}
	if (arg1 != -1)
	    aLong5871 = -2L;
    }
    
    static {
	aLong5871 = 0L;
    }
}
