/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class15
{
    public int anInt164;
    public int anInt165;
    public int anInt166;
    public int[] anIntArray167;
    public int[] anIntArray168;
    public int anInt169 = 2;
    public int anInt170;
    public int anInt171;
    public int anInt172;
    public int anInt173;
    public int anInt174;
    
    public void method219(Stream arg0) {
	anInt169 = arg0.readUnsignedByte(120);
	anIntArray168 = new int[anInt169];
	anIntArray167 = new int[anInt169];
	for (int i = 0; i < anInt169; i++) {
	    anIntArray168[i] = arg0.readUnsignedShort(8104);
	    anIntArray167[i] = arg0.readUnsignedShort(8104);
	}
    }
    
    public void method220() {
	anInt173 = 0;
	anInt172 = 0;
	anInt174 = 0;
	anInt170 = 0;
	anInt171 = 0;
    }
    
    public void method221(Stream arg0) {
	anInt164 = arg0.readUnsignedByte(111);
	anInt165 = arg0.readUnsignedInt(-2);
	anInt166 = arg0.readUnsignedInt(-2);
	method219(arg0);
    }
    
    public int method222(int arg0) {
	if (anInt171 >= anInt173) {
	    anInt170 = anIntArray167[anInt172++] << 15;
	    if (anInt172 >= anInt169)
		anInt172 = anInt169 - 1;
	    anInt173 = (int) ((double) anIntArray168[anInt172] / 65536.0
			      * (double) arg0);
	    if (anInt173 > anInt171)
		anInt174 = (((anIntArray167[anInt172] << 15) - anInt170)
			    / (anInt173 - anInt171));
	}
	anInt170 += anInt174;
	anInt171++;
	return anInt170 - anInt174 >> 15;
    }
    
    public Class15() {
	anIntArray168 = new int[2];
	anIntArray167 = new int[2];
	anIntArray168[0] = 0;
	anIntArray168[1] = 65535;
	anIntArray167[0] = 0;
	anIntArray167[1] = 65535;
    }
}
