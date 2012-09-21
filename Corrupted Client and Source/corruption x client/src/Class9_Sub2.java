/* Class9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class9_Sub2 extends Class9
{
    public int anInt3615;
    public int anInt3616;
    public int anInt3617;
    public int anInt3618;
    public int anInt3619;
    public int anInt3620;
    public int anInt3621;
    public int anInt3622;
    public int anInt3623;
    public int anInt3624;
    public int anInt3625;
    public int anInt3626;
    
    public Class9_Sub2 method198() {
	Class9_Sub2 class9_sub2 = new Class9_Sub2();
	class9_sub2.anInt3617 = anInt3617;
	class9_sub2.anInt3615 = anInt3615;
	class9_sub2.anInt3618 = anInt3618;
	class9_sub2.anInt3626 = anInt3626;
	class9_sub2.anInt3625 = anInt3625;
	class9_sub2.anInt3616 = anInt3616;
	class9_sub2.anInt3622 = anInt3622;
	class9_sub2.anInt3624 = anInt3624;
	class9_sub2.anInt3623 = anInt3623;
	class9_sub2.anInt3621 = anInt3621;
	class9_sub2.anInt3620 = anInt3620;
	class9_sub2.anInt3619 = anInt3619;
	return class9_sub2;
    }
    
    public void method186(int arg0, int arg1, int arg2, int[] arg3) {
	arg3[0] = (anInt3626
		   + (anInt3617 * arg0 + anInt3615 * arg1 + anInt3618 * arg2
		      >> 15));
	arg3[1] = (anInt3624
		   + (anInt3625 * arg0 + anInt3616 * arg1 + anInt3622 * arg2
		      >> 15));
	arg3[2] = (anInt3619
		   + (anInt3623 * arg0 + anInt3621 * arg1 + anInt3620 * arg2
		      >> 15));
    }
    
    public void method178(int arg0) {
	anInt3617 = 32768;
	anInt3616 = anInt3620 = Class31.anIntArray425[arg0 & 0x3fff];
	anInt3621 = Class31.anIntArray434[arg0 & 0x3fff];
	anInt3622 = -anInt3621;
	anInt3615 = anInt3618 = anInt3626 = anInt3625 = anInt3624
	    = anInt3623 = anInt3619 = 0;
    }
    
    public void method175(int arg0) {
	anInt3620 = 32768;
	anInt3617 = anInt3616 = Class31.anIntArray425[arg0 & 0x3fff];
	anInt3625 = Class31.anIntArray434[arg0 & 0x3fff];
	anInt3615 = -anInt3625;
	anInt3618 = anInt3626 = anInt3622 = anInt3624 = anInt3623
	    = anInt3621 = anInt3619 = 0;
    }
    
    public void method177(int arg0) {
	anInt3616 = 32768;
	anInt3617 = anInt3620 = Class31.anIntArray425[arg0 & 0x3fff];
	anInt3618 = Class31.anIntArray434[arg0 & 0x3fff];
	anInt3623 = -anInt3618;
	anInt3615 = anInt3626 = anInt3625 = anInt3622 = anInt3624
	    = anInt3621 = anInt3619 = 0;
    }
    
    public void method192(int arg0) {
	int i = Class31.anIntArray425[arg0 & 0x3fff];
	int i_0_ = Class31.anIntArray434[arg0 & 0x3fff];
	int i_1_ = anInt3617;
	int i_2_ = anInt3615;
	int i_3_ = anInt3618;
	int i_4_ = anInt3626;
	anInt3617 = i_1_ * i + anInt3623 * i_0_ >> 15;
	anInt3623 = anInt3623 * i - i_1_ * i_0_ >> 15;
	anInt3615 = i_2_ * i + anInt3621 * i_0_ >> 15;
	anInt3621 = anInt3621 * i - i_2_ * i_0_ >> 15;
	anInt3618 = i_3_ * i + anInt3620 * i_0_ >> 15;
	anInt3620 = anInt3620 * i - i_3_ * i_0_ >> 15;
	anInt3626 = i_4_ * i + anInt3619 * i_0_ >> 15;
	anInt3619 = anInt3619 * i - i_4_ * i_0_ >> 15;
    }
    
    public void method189() {
	anInt3625 = anInt3623 = anInt3615 = anInt3621 = anInt3618
	    = anInt3622 = anInt3626 = anInt3624 = anInt3619 = 0;
	anInt3617 = anInt3616 = anInt3620 = 32768;
    }
    
    public void method174(int arg0, int arg1, int arg2) {
	anInt3626 += arg0;
	anInt3624 += arg1;
	anInt3619 += arg2;
    }
    
    public void method188(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	int i = Class31.anIntArray425[arg3 & 0x3fff];
	int i_5_ = Class31.anIntArray434[arg3 & 0x3fff];
	int i_6_ = Class31.anIntArray425[arg4 & 0x3fff];
	int i_7_ = Class31.anIntArray434[arg4 & 0x3fff];
	int i_8_ = Class31.anIntArray425[arg5 & 0x3fff];
	int i_9_ = Class31.anIntArray434[arg5 & 0x3fff];
	int i_10_ = i_5_ * i_8_ >> 15;
	int i_11_ = i_5_ * i_9_ >> 15;
	anInt3617 = i_6_ * i_8_ + i_7_ * i_11_ >> 15;
	anInt3625 = -i_6_ * i_9_ + i_7_ * i_10_ >> 15;
	anInt3623 = i_7_ * i >> 15;
	anInt3615 = i * i_9_ >> 15;
	anInt3616 = i * i_8_ >> 15;
	anInt3621 = -i_5_;
	anInt3618 = -i_7_ * i_8_ + i_6_ * i_11_ >> 15;
	anInt3622 = i_7_ * i_9_ + i_6_ * i_10_ >> 15;
	anInt3620 = i_6_ * i >> 15;
	anInt3626
	    = -arg0 * anInt3617 - arg1 * anInt3615 - arg2 * anInt3618 >> 15;
	anInt3624
	    = -arg0 * anInt3625 - arg1 * anInt3616 - arg2 * anInt3622 >> 15;
	anInt3619
	    = -arg0 * anInt3623 - arg1 * anInt3621 - arg2 * anInt3620 >> 15;
    }
    
    public void method190(int[] arg0) {
	int i = arg0[0] - anInt3626;
	int i_12_ = arg0[1] - anInt3624;
	int i_13_ = arg0[2] - anInt3619;
	arg0[0] = anInt3617 * i + anInt3625 * i_12_ + anInt3623 * i_13_ >> 15;
	arg0[1] = anInt3615 * i + anInt3616 * i_12_ + anInt3621 * i_13_ >> 15;
	arg0[2] = anInt3618 * i + anInt3622 * i_12_ + anInt3620 * i_13_ >> 15;
    }
    
    public void method179(int arg0) {
	int i = Class31.anIntArray425[arg0 & 0x3fff];
	int i_14_ = Class31.anIntArray434[arg0 & 0x3fff];
	int i_15_ = anInt3625;
	int i_16_ = anInt3616;
	int i_17_ = anInt3622;
	int i_18_ = anInt3624;
	anInt3625 = i_15_ * i - anInt3623 * i_14_ >> 15;
	anInt3623 = i_15_ * i_14_ + anInt3623 * i >> 15;
	anInt3616 = i_16_ * i - anInt3621 * i_14_ >> 15;
	anInt3621 = i_16_ * i_14_ + anInt3621 * i >> 15;
	anInt3622 = i_17_ * i - anInt3620 * i_14_ >> 15;
	anInt3620 = i_17_ * i_14_ + anInt3620 * i >> 15;
	anInt3624 = i_18_ * i - anInt3619 * i_14_ >> 15;
	anInt3619 = i_18_ * i_14_ + anInt3619 * i >> 15;
    }
    
    public void method180(Class9 arg0) {
	Class9_Sub2 class9_sub2 = (Class9_Sub2) arg0;
	anInt3617 = class9_sub2.anInt3617;
	anInt3615 = class9_sub2.anInt3615;
	anInt3618 = class9_sub2.anInt3618;
	anInt3626 = class9_sub2.anInt3626;
	anInt3625 = class9_sub2.anInt3625;
	anInt3616 = class9_sub2.anInt3616;
	anInt3622 = class9_sub2.anInt3622;
	anInt3624 = class9_sub2.anInt3624;
	anInt3623 = class9_sub2.anInt3623;
	anInt3621 = class9_sub2.anInt3621;
	anInt3620 = class9_sub2.anInt3620;
	anInt3619 = class9_sub2.anInt3619;
    }
    
    public void method181(int arg0, int arg1, int arg2) {
	anInt3625 = anInt3623 = anInt3615 = anInt3621 = anInt3618
	    = anInt3622 = 0;
	anInt3617 = anInt3616 = anInt3620 = 32768;
	anInt3626 = arg0;
	anInt3624 = arg1;
	anInt3619 = arg2;
    }
    
    public Class9_Sub2() {
	method189();
    }
}
