/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131
{
    public Class131 aClass131_1783;
    public static int anInt1784;
    public static int anInt1785;
    public Class131 aClass131_1786;
    public static int anInt1787;
    public static Class158 aClass158_1788;
    public static int anInt1789;
    public static int anInt1790;
    public long aLong1791;
    public static int anInt1792 = 0;
    public static int anInt1793;
    public static int anInt1794;
    
    public static void method1350(byte arg0) {
	aClass158_1788 = null;
	if (arg0 != 55)
	    anInt1792 = -101;
    }
    
    public static int method1351(int arg0) {
	try {
	    anInt1793++;
	    if (arg0 != -32251)
		return -48;
	    synchronized (OutputStream_Sub1.aClass214_66) {
		return OutputStream_Sub1.aClass214_66.method2778(-127);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"o.PC(" + arg0 + ')');
	}
    }
    
    public boolean method1352(boolean arg0) {
	try {
	    anInt1785++;
	    if (aClass131_1786 == null)
		return false;
	    if (arg0 != true)
		aClass131_1786 = null;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"o.KC(" + arg0 + ')');
	}
    }
    
    public static int method1353(int arg0, Class158 arg1) {
	try {
	    anInt1794++;
	    int i = arg0;
	    if (arg1.method2343(-120, Class199.anInt2909))
		i++;
	    if (arg1.method2343(-116, Class131_Sub41_Sub1.anInt6168))
		i++;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("o.OC(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1354(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt1790++;
	    if (Class131_Sub2_Sub29.aClass147ArrayArrayArray5972 != null) {
		long l
		    = (long) (arg0 << 165731982 | arg2 << -1853036452 | arg3);
		Class131_Sub10 class131_sub10
		    = ((Class131_Sub10)
		       Class131_Sub24.aClass180_4468.method2521(-95, l));
		if (class131_sub10 == null)
		    Class77.method773(arg2, arg3, arg0);
		else {
		    Class131_Sub18 class131_sub18
			= ((Class131_Sub18)
			   class131_sub10.aClass119_4226.method1007(0));
		    if (class131_sub18 == null)
			Class77.method773(arg2, arg3, arg0);
		    else {
			int i = -60 % ((-20 - arg1) / 38);
			Class23_Sub3_Sub1 class23_sub3_sub1
			    = ((Class23_Sub3_Sub1)
			       Class77.method773(arg2, arg3, arg0));
			if (class23_sub3_sub1 != null)
			    class23_sub3_sub1.anInt5223
				= class23_sub3_sub1.anInt5233 = -1;
			else
			    class23_sub3_sub1 = new Class23_Sub3_Sub1();
			class23_sub3_sub1.anInt5232 = class131_sub18.anInt4384;
			class23_sub3_sub1.anInt5225 = class131_sub18.anInt4379;
			for (;;) {
			    Class131_Sub18 class131_sub18_0_
				= ((Class131_Sub18)
				   class131_sub10.aClass119_4226
				       .method1014(0));
			    if (class131_sub18_0_ == null)
				break;
			    if (class131_sub18_0_.anInt4384
				!= class23_sub3_sub1.anInt5232) {
				class23_sub3_sub1.anInt5229
				    = class131_sub18_0_.anInt4379;
				class23_sub3_sub1.anInt5223
				    = class131_sub18_0_.anInt4384;
				for (;;) {
				    Class131_Sub18 class131_sub18_1_
					= ((Class131_Sub18)
					   class131_sub10.aClass119_4226
					       .method1014(0));
				    if (class131_sub18_1_ == null)
					break;
				    if ((class23_sub3_sub1.anInt5232
					 != class131_sub18_1_.anInt4384)
					&& (class131_sub18_1_.anInt4384
					    != class23_sub3_sub1.anInt5223)) {
					class23_sub3_sub1.anInt5224
					    = class131_sub18_1_.anInt4379;
					class23_sub3_sub1.anInt5233
					    = class131_sub18_1_.anInt4384;
				    }
				}
				break;
			    }
			}
			int i_2_ = (RuntimeException_Sub1.method2833
				    (64 + (arg0 << 1648653959), 114,
				     64 + (arg3 << 1521783271), arg2));
			Class131_Sub21.method1818(arg2, arg3, arg0, i_2_,
						  class23_sub3_sub1);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("o.MC(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ')'));
	}
    }
    
    public void method1355(byte arg0) {
	try {
	    anInt1784++;
	    if (aClass131_1786 != null) {
		aClass131_1786.aClass131_1783 = aClass131_1783;
		aClass131_1783.aClass131_1786 = aClass131_1786;
		if (arg0 < 113)
		    method1356(58, 20);
		aClass131_1786 = null;
		aClass131_1783 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"o.NC(" + arg0 + ')');
	}
    }
    
    public static Class143 method1356(int arg0, int arg1) {
	try {
	    anInt1789++;
	    Class143 class143
		= (Class143) Class219.aClass214_3204.method2780(arg1 + 118,
								(long) arg0);
	    if (class143 != null)
		return class143;
	    byte[] is
		= Class23_Sub3_Sub1.aClass158_5234.method2364(arg0, 33, arg1);
	    class143 = new Class143();
	    if (is != null)
		class143.method2144(arg0, true, new Stream(is));
	    Class219.aClass214_3204.method2773(true, class143, (long) arg0);
	    return class143;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("o.LC(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
}
