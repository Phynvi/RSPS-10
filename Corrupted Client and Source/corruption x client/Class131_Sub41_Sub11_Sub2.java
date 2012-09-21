/* Class131_Sub41_Sub11_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class131_Sub41_Sub11_Sub2 extends Class131_Sub41_Sub11
{
    public SoftReference aSoftReference6556;
    
    public boolean method2000(int arg0) {
	boolean bool;
	try {
	    if (arg0 <= 118)
		return false;
	    bool = true;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public Class131_Sub41_Sub11_Sub2(Interface1 arg0, Object arg1) {
	super(arg0);
	aSoftReference6556 = new SoftReference(arg1);
    }
    
    public Object method2001(byte arg0) {
	Object object;
	try {
	    if (arg0 > -111)
		aSoftReference6556 = null;
	    object = aSoftReference6556.get();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return object;
    }
}
