/* SignLink - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;

public class SignLink implements Runnable
{
    public static String aString2882;
    public Applet anApplet2883;
    public Class8 aClass8_2884 = null;
    public Class8 aClass8_2885;
    public int anInt2886;
    public Display aDisplay2887;
    public Class8[] aClass8Array2888;
    public static Hashtable aHashtable2889;
    public static String aString2890;
    public boolean aBoolean2891;
    public Class8 aClass8_2892;
    public static String aString2893;
    public EventQueue anEventQueue2894;
    public String aString2895;
    public Class139 aClass139_2896;
    public static String aString2897;
    public Class139 aClass139_2898;
    public Interface8 anInterface8_2899;
    public Thread aThread2900;
    public static String aString2901;
    public static int anInt2902 = 1;
    public Sensor aSensor2903;
    public static String aString2904;
    public static String aString2905;
    public static Method aMethod2906;
    public static volatile long aLong2907;
    public static Method aMethod2908;

    public Class139 method2679(Frame arg0, int arg1) {
	if (arg1 <= 109)
	    anInterface8_2899 = null;
	Class139 class139 = method2706(7, 0, arg0, 0, true);
	return class139;
    }
    
    public Class139 method2680(int arg0, int arg1, Object arg2, int arg3,
			       int arg4) {
	Class139 class139 = new Class139();
	synchronized (class139) {
	    class139.anInt1862 = arg3;
	    class139.anObject1865 = arg2;
	    class139.anInt1867 = arg4;
	    class139.anInt1863 = arg1;
	    synchronized (this) {
		if (aClass139_2896 != null) {
		    aClass139_2896.aClass139_1861 = class139;
		    aClass139_2896 = class139;
		} else
		    aClass139_2896 = aClass139_2898 = class139;
		this.notify();
		if (arg0 >= -109)
		    method2706(127, -26, null, 10, false);
	    }
	    try {
		class139.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	Class139 class139_0_ = class139;
	return class139_0_;
    }
    
    public Class139 method2681(int arg0) {
	if (arg0 != -1)
	    return null;
	Class139 class139 = method2706(12, 0, null, 0, true);
	return class139;
    }
    
    public Class139 method2682(byte arg0, String arg1) {
	if (arg0 <= 59)
	    anApplet2883 = null;
	Class139 class139 = method2706(21, 0, arg1, 0, true);
	return class139;
    }
    
    public Class139 method2683(int arg0, Class arg1) {
	int i = -70 % ((arg0 - -13) / 51);
	Class139 class139 = method2706(20, 0, arg1, 0, true);
	return class139;
    }
    
    public Class139 method2684(int arg0) {
	if (arg0 != 16389)
	    aBoolean2891 = false;
	Class139 class139 = method2706(13, 0, null, 0, true);
	return class139;
    }
    
    public static File method2685(boolean arg0, int arg1, String arg2,
				  String arg3) {
	try {
	    if (arg0 != true)
		return null;
	    File file = (File) aHashtable2889.get(arg3);
	    if (null != file)
		return file;
	    String[] strings
		= { "./" };
	    String[] strings_1_
		= { new StringBuilder().append("cache").toString() };
	    for (int i = 0; (i ^ 0xffffffff) > -3; i++) {
		for (int i_2_ = 0;
		     (strings_1_.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		     i_2_++) {
		    for (int i_3_ = 0; strings.length > i_3_; i_3_++) {
			String string
			    = new StringBuilder().append(strings[i_3_]).append
				  (strings_1_[i_2_]).append
				  ("/").append(arg3).toString();
			RandomAccessFile randomaccessfile = null;
			File file_4_;
			try {
			    File file_5_ = new File(string);
			    if (0 == i && !file_5_.exists())
				continue;
			    String string_6_ = strings[i_3_];
			    if (1 == i
				&& (string_6_.length() ^ 0xffffffff) < -1
				&& !new File(string_6_).exists())
				continue;
			    new File
				(new StringBuilder().append(strings[i_3_])
				     .append
				     (strings_1_[i_2_]).toString())
				.mkdir();
			    if (arg2 != null)
				new File(new StringBuilder().append
					     (strings[i_3_]).append
					     (strings_1_[i_2_]).append
					     ("/").append
					     (arg2).toString()).mkdir();
			    randomaccessfile
				= new RandomAccessFile(file_5_, "rw");
			    int i_7_ = randomaccessfile.read();
			    randomaccessfile.seek(0L);
			    randomaccessfile.write(i_7_);
			    randomaccessfile.seek(0L);
			    randomaccessfile.close();
			    aHashtable2889.put(arg3, file_5_);
			    file_4_ = file_5_;
			} catch (Exception exception) {
			    try {
				if (randomaccessfile != null) {
				    randomaccessfile.close();
				    Object object = null;
				}
			    } catch (Exception exception_8_) {
				/* empty */
			    }
			    continue;
			}
			return file_4_;
		    }
		}
	    }
	    throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Interface8 method2686(int arg0) {
	if (arg0 != -2)
	    method2707(-51);
	Interface8 interface8 = anInterface8_2899;
	return interface8;
    }
    
    public Class139 method2687(int arg0, int arg1, byte arg2, int arg3,
			       int arg4) {
	if (arg2 != -37)
	    method2708((byte) 96, null, null);
	Class139 class139 = method2706(6, (arg3 << 1989355440) - -arg1, null,
				       arg4 + (arg0 << 842068016), true);
	return class139;
    }
    
    public static Class8 method2688(String arg0, int arg1, int arg2) {
	if (arg1 != 29905)
	    return null;
	String string;
	if ((arg2 ^ 0xffffffff) == -34)
	    string = new StringBuilder().append("jagex_").append(arg0).append
			 ("_preferences2_rc.dat").toString();
	else if (34 == arg2)
	    string = new StringBuilder().append("jagex_").append(arg0).append
			 ("_preferences2_wip.dat").toString();
	else
	    string = new StringBuilder().append("jagex_").append(arg0).append
			 ("_preferences2.dat").toString();
	String[] strings = { "./" };
	for (int i = 0; strings.length > i; i++) {
	    String string_9_ = strings[i];
	    if (string_9_.length() <= 0 || new File(string_9_).exists()) {
		Class8 class8;
		try {
		    Class8 class8_10_ = new Class8(new File(string_9_, string),
						   "rw", 10000L);
		    class8 = class8_10_;
		} catch (Exception exception) {
		    continue;
		}
		return class8;
	    }
	}
	Class8 class8 = null;
	return class8;
    }
    
    public Class139 method2689(int arg0) {
	if (arg0 != 5929)
	    method2699(null, -66, null, 11, null, 64);
	Class139 class139 = method2706(18, 0, null, 0, true);
	return class139;
    }
    
    public Class139 method2690(String arg0, Class[] arg1, int arg2,
			       Class arg3) {
	if (arg2 > -19)
	    method2687(43, 64, (byte) -80, 89, -8);
	Class139 class139
	    = method2706(8, 0, new Object[] { arg3, arg0, arg1 }, 0, true);
	return class139;
    }
    
    public Class139 method2691(byte arg0, URL arg1) {
	if (arg0 != 91)
	    return null;
	Class139 class139 = method2706(4, 0, arg1, 0, true);
	return class139;
    }
    
    public Class139 method2692(byte arg0, Runnable arg1, int arg2) {
	if (arg0 != 107)
	    aString2895 = null;
	Class139 class139 = method2706(2, 0, arg1, arg2, true);
	return class139;
    }
    
    public Class139 method2693(int arg0, int arg1, int arg2, Component arg3) {
	if (arg0 != 14)
	    anApplet2883 = null;
	Point point = arg3.getLocationOnScreen();
	Class139 class139
	    = method2706(14, arg1 + point.y, null, point.x + arg2, true);
	return class139;
    }
    
    public Class139 method2694(Class arg0, int arg1) {
	if (arg1 != 10)
	    aClass8_2885 = null;
	Class139 class139 = method2706(10, 0, arg0, 0, true);
	return class139;
    }
    
    public File method2695(byte arg0, String arg1) {
	int i = -46 % ((arg0 - 72) / 46);
	File file = method2685(true, anInt2886, aString2895, arg1);
	return file;
    }
    
    public void run() {
	try {
	    for (;;) {
		Class139 class139;
		synchronized (this) {
		    for (;;) {
			if (aBoolean2891)
			    return;
			if (aClass139_2898 != null) {
			    class139 = aClass139_2898;
			    aClass139_2898 = aClass139_2898.aClass139_1861;
			    if (aClass139_2898 == null)
				aClass139_2896 = null;
			    break;
			}
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		}
		try {
		    int i = class139.anInt1863;
		    if (i != 1) {
			if (-3 != (i ^ 0xffffffff)) {
			    if (i != 4) {
				if (-9 == (i ^ 0xffffffff)) {
				    Object[] objects
					= (Object[]) class139.anObject1865;
				    if (((Class) objects[0]).getClassLoader()
					== null)
					throw new SecurityException();
				    class139.anObject1866
					= (((Class) objects[0])
					       .getDeclaredMethod
					   ((String) objects[1],
					    (Class[]) objects[2]));
				} else if (-10 == (i ^ 0xffffffff)) {
				    Object[] objects
					= (Object[]) class139.anObject1865;
				    if (((Class) objects[0]).getClassLoader()
					== null)
					throw new SecurityException();
				    class139.anObject1866
					= (((Class) objects[0])
					       .getDeclaredField
					   ((String) objects[1]));
				} else if (i == 18) {
				    Clipboard clipboard
					= Toolkit.getDefaultToolkit()
					      .getSystemClipboard();
				    class139.anObject1866
					= clipboard.getContents(null);
				} else if ((i ^ 0xffffffff) == -20) {
				    Transferable transferable
					= (Transferable) class139.anObject1865;
				    Clipboard clipboard
					= Toolkit.getDefaultToolkit()
					      .getSystemClipboard();
				    clipboard.setContents(transferable, null);
				} else if (-4 == (i ^ 0xffffffff)) {
				    if ((aLong2907 ^ 0xffffffffffffffffL)
					< (Class208.method2749(-3913)
					   ^ 0xffffffffffffffffL))
					throw new IOException();
				    String string
					= new StringBuilder().append
					      (0xff & (class139.anInt1862
						       >> 520865848))
					      .append
					      (".").append
					      ((class139.anInt1862 & 0xff0097)
					       >> 1357841712)
					      .append
					      (".").append
					      (class139.anInt1862 >> 1120194632
					       & 0xff)
					      .append
					      (".").append
					      (class139.anInt1862 & 0xff)
					      .toString();
				    class139.anObject1866
					= InetAddress.getByName(string)
					      .getHostName();
				} else if (-22 != (i ^ 0xffffffff)) {
				    if (-6 != (i ^ 0xffffffff)) {
					if (-7 == (i ^ 0xffffffff)) {
					    Frame frame
						= (new Frame
						   ("Jagex Full Screen"));
					    class139.anObject1866 = frame;
					    frame.setResizable(false);
					    aDisplay2887.method499
						(0xffff & class139.anInt1867,
						 class139.anInt1862 & 0xffff,
						 frame, (byte) -113,
						 (class139.anInt1862
						  >>> -1734585008),
						 (class139.anInt1867
						  >> -438738736));
					} else if ((i ^ 0xffffffff) != -8) {
					    if (-11 != (i ^ 0xffffffff)) {
						if (-12 != (i ^ 0xffffffff)) {
						    if (-13
							!= (i ^ 0xffffffff)) {
							if (13 == i) {
							    Class8 class8
								= (method2688
								   (aString2895,
								    29905,
								    anInt2886));
							    class139
								.anObject1866
								= class8;
							} else if ((i
								    ^ 0xffffffff)
								   != -15) {
							    if (-16
								!= (i
								    ^ 0xffffffff)) {
								if ((i
								     ^ 0xffffffff)
								    != -18) {
								    if (-17
									== (i
									    ^ 0xffffffff)) {
									try {
									    if (!aString2901.startsWith("win"))
										throw new Exception();
									    String string = (String) class139.anObject1865;
									    if (!string.startsWith("http://") && !string.startsWith("https://"))
										throw new Exception();
									    String string_11_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									    for (int i_12_ = 0; i_12_ < string.length(); i_12_++) {
										if ((string_11_.indexOf(string.charAt(i_12_)) ^ 0xffffffff) == 0)
										    throw new Exception();
									    }
									    Runtime.getRuntime().exec(new StringBuilder().append("cmd /c start \"j\" \"").append(string).append("\"").toString());
									    class139.anObject1866 = null;
									} catch (Exception exception) {
									    class139.anObject1866 = exception;
									}
								    } else if ((i ^ 0xffffffff)
									       == -21) {
									try {
									    Class[] var_classes = { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									    Runtime runtime = Runtime.getRuntime();
									    Method method = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var_classes);
									    method.setAccessible(true);
									    if (aString2901.startsWith("win")) {
										if (aString2905.startsWith("amd64") || aString2905.startsWith("x86_64"))
										    method.invoke(runtime, new Object[] { class139.anObject1865, method2695((byte) 13, "jagmisc64.dll").getAbsoluteFile().toString() });
										else
										    method.invoke(runtime, new Object[] { class139.anObject1865, method2695((byte) 13, "jagmisc.dll").getAbsoluteFile().toString() });
									    }
									    method.setAccessible(false);
									} catch (Throwable throwable) {
									    class139.anObject1866 = throwable;
									}
								    } else
									throw new Exception("");
								} else {
								    Object[] objects
									= ((Object[])
									   (class139
									    .anObject1865));
								    aSensor2903
									.method2515
									(((Point)
									  (objects
									   [2])),
									 (byte) 105,
									 ((int[])
									  (objects
									   [1])),
									 (class139
									  .anInt1862),
									 ((Component)
									  (objects
									   [0])),
									 (class139
									  .anInt1867));
								}
							    } else {
								boolean bool
								    = (((class139
									 .anInt1862)
									^ 0xffffffff)
								       != -1);
								Component component
								    = ((Component)
								       (class139
									.anObject1865));
								aSensor2903
								    .method2513
								    (-57, bool,
								     component);
							    }
							} else {
							    int i_13_
								= (class139
								   .anInt1862);
							    int i_14_
								= (class139
								   .anInt1867);
							    aSensor2903
								.method2514
								(i_13_, i_14_,
								 0);
							}
						    } else {
							Class8 class8
							    = (method2700
							       (-17, anInt2886,
								aString2895));
							class139.anObject1866
							    = class8;
						    }
						} else {
						    Field field
							= (Class.forName
							       ("java.lang.ClassLoader")
							       .getDeclaredField
							   ("nativeLibraries"));
						    field.setAccessible(true);
						    Vector vector
							= ((Vector)
							   (field.get
							    (((Class)
							      (class139
							       .anObject1865))
								 .getClassLoader
							     ())));
						    for (int i_15_ = 0;
							 ((vector.size()
							   ^ 0xffffffff)
							  < (i_15_
							     ^ 0xffffffff));
							 i_15_++) {
							Object object
							    = (vector.elementAt
							       (i_15_));
							Method method
							    = (object.getClass
								   ()
								   .getDeclaredMethod
							       ("finalize",
								new Class[0]));
							method.setAccessible
							    (true);
							method.invoke
							    (object,
							     new Object[0]);
							method.setAccessible
							    (false);
							Field field_16_
							    = (object.getClass
								   ()
								   .getDeclaredField
							       ("handle"));
							field_16_.setAccessible
							    (true);
							field_16_.set
							    (object,
							     new Integer(0));
							field_16_.setAccessible
							    (false);
						    }
						    field.setAccessible(false);
						}
					    } else {
						Class[] var_classes
						    = { (Class.forName
							 ("java.lang.Class")),
							(Class.forName
							 ("java.lang.String")) };
						Runtime runtime
						    = Runtime.getRuntime();
						if (!aString2901
							 .startsWith("mac")) {
						    Method method
							= (Class.forName
							       ("java.lang.Runtime")
							       .getDeclaredMethod
							   ("loadLibrary0",
							    var_classes));
						    method.setAccessible(true);
						    method.invoke
							(runtime,
							 (new Object[]
							  { (class139
							     .anObject1865),
							    "jawt" }));
						    method
							.setAccessible(false);
						}
						Method method
						    = (Class.forName
							   ("java.lang.Runtime")
							   .getDeclaredMethod
						       ("load0", var_classes));
						method.setAccessible(true);
						if (!aString2901
							 .startsWith("linux")
						    && !(aString2901.startsWith
							 ("sunos"))) {
						    if (!aString2901.startsWith
							 ("mac")) {
							if (!aString2901
								 .startsWith
							     ("win"))
							    throw new Exception
								      ();
							method.invoke
							    (runtime,
							     (new Object[]
							      { (class139
								 .anObject1865),
								(method2695
								     ((byte) -90,
								      "jaggl.dll").getAbsoluteFile()
								     .toString
								 ()) }));
						    } else
							method.invoke
							    (runtime,
							     (new Object[]
							      { (class139
								 .anObject1865),
								(method2695
								     ((byte) 121,
								      "libjaggl.jnilib")
								     .toString
								 ()) }));
						} else {
						    method.invoke
							(runtime,
							 (new Object[]
							  { (class139
							     .anObject1865),
							    method2695
								((byte) -67,
								 "libjaggl_dri.so")
								.toString() }));
						    Class var_class
							= (((Class)
							    (class139
							     .anObject1865))
							       .getClassLoader
							       ().loadClass
							   ("jaggl.X11.dri"));
						    var_class.getMethod
							("bind", new Class[0])
							.invoke
							(null, new Object[0]);
						    method.invoke
							(runtime,
							 (new Object[]
							  { (class139
							     .anObject1865),
							    method2695
								((byte) 126,
								 "libjaggl.so")
								.toString() }));
						    var_class.getMethod
							("close", new Class[0])
							.invoke
							(null, new Object[0]);
						}
						method.setAccessible(false);
					    }
					} else
					    aDisplay2887
						.method496((byte) -127);
				    } else
					class139.anObject1866
					    = aDisplay2887.method498(true);
				} else {
				    if ((aLong2907 ^ 0xffffffffffffffffL)
					< (Class208.method2749(-3913)
					   ^ 0xffffffffffffffffL))
					throw new IOException();
				    class139.anObject1866
					= InetAddress.getByName
					      ((String) class139.anObject1865)
					      .getAddress();
				}
			    } else {
				if (aLong2907 > Class208.method2749(-3913))
				    throw new IOException();
				class139.anObject1866
				    = new DataInputStream(((URL)
							   (class139
							    .anObject1865))
							      .openStream());
			    }
			} else {
			    Thread thread
				= new Thread((Runnable) class139.anObject1865);
			    thread.setDaemon(true);
			    thread.start();
			    thread.setPriority(class139.anInt1862);
			    class139.anObject1866 = thread;
			}
		    } else {
			if ((Class208.method2749(-3913) ^ 0xffffffffffffffffL)
			    > (aLong2907 ^ 0xffffffffffffffffL))
			    throw new IOException();
			class139.anObject1866
			    = new Socket((InetAddress.getByName
					  ((String) class139.anObject1865)),
					 class139.anInt1862);
		    }
		    class139.anInt1864 = 1;
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    class139.anInt1864 = 2;
		}
		synchronized (class139) {
		    class139.notify();
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class139 method2696(byte arg0, int arg1) {
	if (arg0 != -26)
	    aClass8Array2888 = null;
	Class139 class139 = method2706(3, 0, null, arg1, true);
	return class139;
    }
    
    public void method2697(int arg0) {
	if (arg0 != 10)
	    method2688(null, 103, -55);
	aLong2907 = 5000L + Class208.method2749(-3913);
    }
    
    public Class139 method2698(int arg0, Transferable arg1) {
	if (arg0 > -94)
	    method2697(-33);
	Class139 class139 = method2706(19, 0, arg1, 0, true);
	return class139;
    }
    
    public Class139 method2699(int[] arg0, int arg1, Point arg2, int arg3,
			       Component arg4, int arg5) {
	if (arg5 > -121)
	    aString2904 = null;
	Class139 class139
	    = method2706(17, arg3, new Object[] { arg4, arg0, arg2 }, arg1,
			 true);
	return class139;
    }
    
    public static Class8 method2700(int arg0, int arg1, String arg2) {
	String string;
	if ((arg1 ^ 0xffffffff) == -34)
	    string = new StringBuilder().append("jagex_").append(arg2).append
			 ("_preferences_rc.dat").toString();
	else if (-35 == (arg1 ^ 0xffffffff))
	    string = new StringBuilder().append("jagex_").append(arg2).append
			 ("_preferences_wip.dat").toString();
	else
	    string = new StringBuilder().append("jagex_").append(arg2).append
			 ("_preferences.dat").toString();
	String[] strings = { "c:/cache562/", "/cache562/", aString2890,
			     "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
	int i = 0;
	if (arg0 != -17)
	    aString2893 = null;
	for (/**/; (strings.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    String string_17_ = strings[i];
	    if (-1 <= (string_17_.length() ^ 0xffffffff)
		|| new File(string_17_).exists()) {
		Class8 class8;
		try {
		    Class8 class8_18_
			= new Class8(new File(string_17_, string), "rw",
				     10000L);
		    class8 = class8_18_;
		} catch (Exception exception) {
		    continue;
		}
		return class8;
	    }
	}
	Class8 class8 = null;
	return class8;
    }
    
    public Class139 method2701(boolean arg0, Component arg1, int arg2) {
	if (arg2 != 0)
	    method2682((byte) 47, null);
	Class139 class139 = method2706(15, 0, arg1, arg0 ? 1 : 0, true);
	return class139;
    }
    
    public byte[] method2702(String arg0, boolean arg1) {
	Class139 class139 = method2680(-121, 21, arg0, 0, 0);
	if (arg1)
	    return null;
	byte[] is = (byte[]) class139.anObject1866;
	return is;
    }
    
    public Class139 method2703(String arg0, byte arg1, int arg2) {
	if (arg1 <= 113)
	    return null;
	Class139 class139 = method2706(1, 0, arg0, arg2, true);
	return class139;
    }
    
    public Class139 method2704(String arg0, int arg1) {
	if (arg1 <= 80)
	    aString2890 = null;
	Class139 class139 = method2706(16, 0, arg0, 0, true);
	return class139;
    }
    
    public Class139 method2705(Class arg0, int arg1) {
	if (arg1 < 56)
	    aHashtable2889 = null;
	Class139 class139 = method2706(11, 0, arg0, 0, true);
	return class139;
    }
    
    public Class139 method2706(int arg0, int arg1, Object arg2, int arg3,
			       boolean arg4) {
	Class139 class139 = new Class139();
	class139.anInt1863 = arg0;
	class139.anInt1867 = arg1;
	class139.anObject1865 = arg2;
	class139.anInt1862 = arg3;
	synchronized (this) {
	    if (null != aClass139_2896) {
		aClass139_2896.aClass139_1861 = class139;
		aClass139_2896 = class139;
	    } else
		aClass139_2896 = aClass139_2898 = class139;
	    if (arg4 != true)
		aClass8_2884 = null;
	    this.notify();
	}
	Class139 class139_19_ = class139;
	return class139_19_;
    }
    
    public Class139 method2707(int arg0) {
	if (arg0 != 14)
	    return null;
	Class139 class139 = method2706(5, 0, null, 0, true);
	return class139;
    }
    
    public Class139 method2708(byte arg0, String arg1, Class arg2) {
	if (arg0 <= 70)
	    return null;
	Class139 class139
	    = method2706(9, 0, new Object[] { arg2, arg1 }, 0, true);
	return class139;
    }
    
    public boolean method2709(int arg0) {
	if (arg0 != 1774773648)
	    method2692((byte) 70, null, -54);
	boolean bool = null != aDisplay2887;
	return bool;
    }
    
    public void method2710(int arg0) {
	synchronized (this) {
	    aBoolean2891 = true;
	    this.notifyAll();
	}
	try {
	    aThread2900.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	if (null != aClass8_2892) {
	    try {
		aClass8_2892.method170(arg0 + 1);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (null != aClass8_2885) {
	    try {
		aClass8_2885.method170(1);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (arg0 == 0) {
	    if (aClass8Array2888 != null) {
		for (int i = 0; aClass8Array2888.length > i; i++) {
		    if (null != aClass8Array2888[i]) {
			try {
			    aClass8Array2888[i].method170(1);
			} catch (IOException ioexception) {
			    /* empty */
			}
		    }
		}
	    }
	    if (aClass8_2884 != null) {
		try {
		    aClass8_2884.method170(1);
		} catch (IOException ioexception) {
		    /* empty */
		}
	    }
	}
    }
    
    public SignLink(Applet arg0, int arg1, String arg2, int arg3)
	throws Exception {
	anApplet2883 = null;
	aClass8_2892 = null;
	aClass139_2898 = null;
	aClass8_2885 = null;
	aBoolean2891 = false;
	aClass139_2896 = null;
	aString2895 = arg2;
	aString2893 = "1.1";
	anInt2886 = arg1;
	anApplet2883 = arg0;
	aString2904 = "Unknown";
	try {
	    aString2904 = System.getProperty("java.vendor");
	    aString2893 = System.getProperty("java.version");
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    aString2882 = System.getProperty("os.name");
	} catch (Exception exception) {
	    aString2882 = "Unknown";
	}
	aString2901 = aString2882.toLowerCase();
	try {
	    aString2905 = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    aString2905 = "";
	}
	try {
	    aString2897 = System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    aString2897 = "";
	}
	try {
	    aString2890 = System.getProperty("user.home");
	    if (aString2890 != null)
		aString2890 = new StringBuilder().append(aString2890).append
				  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	if (aString2890 == null)
	    aString2890 = "~/";
	try {
	    anEventQueue2894
		= Toolkit.getDefaultToolkit().getSystemEventQueue();
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    if (arg0 != null)
		aMethod2906
		    = arg0.getClass().getMethod("setFocusTraversalKeysEnabled",
						new Class[] { Boolean.TYPE });
	    else
		aMethod2906
		    = (Class.forName("java.awt.Component").getDeclaredMethod
		       ("setFocusTraversalKeysEnabled",
			new Class[] { Boolean.TYPE }));
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (arg0 != null)
		aMethod2908
		    = arg0.getClass().getMethod("setFocusCycleRoot",
						new Class[] { Boolean.TYPE });
	    else
		aMethod2908
		    = (Class.forName("java.awt.Container").getDeclaredMethod
		       ("setFocusCycleRoot", new Class[] { Boolean.TYPE }));
	} catch (Exception exception) {
	    /* empty */
	}
	aClass8_2884
	    = new Class8(method2685(true, anInt2886, null, "random.dat"), "rw",
			 25L);
	aClass8_2892
	    = new Class8(method2695((byte) 123, "main_file_cache.dat2"), "rw",
			 209715200L);
	aClass8_2885
	    = new Class8(method2695((byte) -38, "main_file_cache.idx255"),
			 "rw", 1048576L);
	aClass8Array2888 = new Class8[arg3];
	for (int i = 0; i < arg3; i++)
	    aClass8Array2888[i]
		= new Class8(method2695((byte) 119,
					new StringBuilder().append
					    ("main_file_cache.idx").append
					    (i).toString()),
			     "rw", 1048576L);
	try {
	    aDisplay2887 = new Display();
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    aSensor2903 = new Sensor();
	} catch (Throwable throwable) {
	    /* empty */
	}
	ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
	for (ThreadGroup threadgroup_20_ = threadgroup.getParent();
	     null != threadgroup_20_;
	     threadgroup_20_ = threadgroup.getParent())
	    threadgroup = threadgroup_20_;
	Thread[] threads = new Thread[1000];
	threadgroup.enumerate(threads);
	for (int i = 0; threads.length > i; i++) {
	    if (null != threads[i] && threads[i].getName().startsWith("AWT"))
		threads[i].setPriority(1);
	}
	aBoolean2891 = false;
	aThread2900 = new Thread(this);
	aThread2900.setPriority(10);
	aThread2900.setDaemon(true);
	aThread2900.start();
    }
    
    static {
	aHashtable2889 = new Hashtable(16);
	aLong2907 = 0L;
    }
}
