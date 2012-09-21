/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class86
{
    public int anInt1120 = 0;
    public int anInt1121 = 0;
    public Class36 aClass36_1122 = null;
    public Class10[] aClass10Array1123;
    public Class130_Sub2 aClass130_Sub2_1124;
    public Class170 aClass170_1125;
    
    public void method813(boolean arg0, int arg1, boolean arg2, int arg3) {
	if (arg3 != 0)
	    method816(false, -77, true);
	arg2 &= aClass130_Sub2_1124.method1255();
	if (!arg2 && (4 == arg1 || 8 == arg1))
	    arg1 = 2;
	if (-1 != (arg1 ^ 0xffffffff) && arg0)
	    arg1 |= ~0x7fffffff;
	if (anInt1120 != arg1) {
	    if ((anInt1120 ^ 0xffffffff) != -1)
		aClass10Array1123[0x7fffffff & anInt1120].method199();
	    if (-1 != (arg1 ^ 0xffffffff)) {
		aClass10Array1123[0x7fffffff & arg1].method204(arg0);
		aClass10Array1123[0x7fffffff & arg1].method202(arg0);
	    }
	    anInt1121 = -2147483648;
	    anInt1120 = arg1;
	    aClass36_1122 = null;
	} else if ((anInt1120 ^ 0xffffffff) != -1)
	    aClass10Array1123[0x7fffffff & anInt1120].method202(arg0);
    }
    
    public boolean method814(byte arg0, int arg1) {
	boolean bool;
	try {
	    if (arg0 != 126)
		return true;
	    bool = aClass10Array1123[arg1].method203();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public boolean method815(int arg0, Class36 arg1) {
	boolean bool;
	try {
	    if (arg0 == anInt1120)
		return false;
	    if (aClass36_1122 != arg1) {
		aClass10Array1123[anInt1120 & 0x7fffffff].method201(arg1);
		aClass36_1122 = arg1;
	    }
	    bool = true;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public void method816(boolean arg0, int arg1, boolean arg2) {
	if (arg2)
	    aClass130_Sub2_1124 = null;
	if (0 != anInt1120
	    & ((anInt1121 ^ 0xffffffff) != (arg1 ^ 0xffffffff) | arg0)) {
	    aClass10Array1123[0x7fffffff & anInt1120].method200(arg1);
	    anInt1121 = arg1;
	}
    }
    
    public Class86(Class130_Sub2 arg0) {
	aClass130_Sub2_1124 = arg0;
	aClass170_1125 = new Class170(arg0);
	aClass10Array1123 = new Class10[9];
	aClass10Array1123[1] = new Class10_Sub5(arg0);
	aClass10Array1123[2] = new Class10_Sub3(arg0, aClass170_1125);
	aClass10Array1123[4] = new Class10_Sub7(arg0, aClass170_1125);
	aClass10Array1123[5] = new Class10_Sub6(arg0, aClass170_1125);
	aClass10Array1123[6] = new Class10_Sub1(arg0);
	aClass10Array1123[7] = new Class10_Sub4(arg0);
	aClass10Array1123[3] = new Class10_Sub2(arg0);
	aClass10Array1123[8] = aClass10Array1123[4];
    }
}
