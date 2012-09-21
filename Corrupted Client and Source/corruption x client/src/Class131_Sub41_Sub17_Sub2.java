/* Class131_Sub41_Sub17_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class131_Sub41_Sub17_Sub2 extends Class131_Sub41_Sub17
{
    public SoftReference aSoftReference6574;
    
    public boolean method2047(int arg0) {
	boolean bool;
	try {
	    if (arg0 >= -92)
		return true;
	    bool = true;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public Class131_Sub41_Sub17_Sub2(Object arg0) {
	aSoftReference6574 = new SoftReference(arg0);
    }
    
    public Object method2044(int arg0) {
	Object object;
	try {
	    if (arg0 != 27816)
		return null;
	    object = aSoftReference6574.get();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return object;
    }
}
