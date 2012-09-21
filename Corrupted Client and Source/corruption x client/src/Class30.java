/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class30
{
    public static Object method432(Applet arg0, byte arg1, String arg2)
	throws Throwable {
	try {
	    if (arg1 != -100)
		return null;
	    return JSObject.getWindow(arg0).call(arg2, null);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public static void method433(int arg0, String arg1, Applet arg2)
	throws Throwable {
	try {
	    if (arg0 == 8358)
		JSObject.getWindow(arg2).eval(arg1);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public static Object method434(Applet arg0, Object[] arg1, boolean arg2,
				   String arg3) throws Throwable {
	try {
	    if (arg2 != true)
		return null;
	    return JSObject.getWindow(arg0).call(arg3, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
}
