/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class208
{
    public static long aLong3035;
    public static long aLong3036;
    
    public static synchronized long method2749(int arg0) {
	if (arg0 != -3913)
	    aLong3036 = 104L;
	long l = System.currentTimeMillis();
	if (l < aLong3035)
	    aLong3036 += aLong3035 + -l;
	aLong3035 = l;
	long l_0_ = l + aLong3036;
	return l_0_;
    }
}
