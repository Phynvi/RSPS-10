/* Class131_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub1_Sub3 extends Class131_Sub1
{
    public Class119 aClass119_5528 = new Class119();
    public Class119 aClass119_5529 = new Class119();
    public int anInt5530 = 0;
    public int anInt5531 = -1;
    
    public int method1362() {
	return 0;
    }
    
    public Class131_Sub1 method1357() {
	return (Class131_Sub1) aClass119_5528.method1014(0);
    }
    
    public synchronized void method1441(Class131_Sub1 arg0) {
	arg0.method1355((byte) 117);
    }
    
    public Class131_Sub1 method1359() {
	return (Class131_Sub1) aClass119_5528.method1007(0);
    }
    
    public void method1442() {
	if (anInt5530 > 0) {
	    for (Class131_Sub16 class131_sub16
		     = (Class131_Sub16) aClass119_5529.method1007(0);
		 class131_sub16 != null;
		 class131_sub16
		     = (Class131_Sub16) aClass119_5529.method1014(0))
		class131_sub16.anInt4365 -= anInt5530;
	    anInt5531 -= anInt5530;
	    anInt5530 = 0;
	}
    }
    
    public void method1443(Class131 arg0, Class131_Sub16 arg1) {
	for (/**/;
	     (arg0 != aClass119_5529.aClass131_1553
	      && ((Class131_Sub16) arg0).anInt4365 <= arg1.anInt4365);
	     arg0 = arg0.aClass131_1783) {
	    /* empty */
	}
	Class131_Sub41_Sub21.method2076(arg0, arg1, 2564);
	anInt5531 = ((Class131_Sub16)
		     aClass119_5529.aClass131_1553.aClass131_1783).anInt4365;
    }
    
    public synchronized void method1363(int[] arg0, int arg1, int arg2) {
	do {
	    if (anInt5531 < 0) {
		method1445(arg0, arg1, arg2);
		break;
	    }
	    if (anInt5530 + arg2 < anInt5531) {
		anInt5530 += arg2;
		method1445(arg0, arg1, arg2);
		break;
	    }
	    int i = anInt5531 - anInt5530;
	    method1445(arg0, arg1, i);
	    arg1 += i;
	    arg2 -= i;
	    anInt5530 += i;
	    method1442();
	    Class131_Sub16 class131_sub16
		= (Class131_Sub16) aClass119_5529.method1007(0);
	    synchronized (class131_sub16) {
		int i_0_ = class131_sub16.method1798(this);
		if (i_0_ < 0) {
		    class131_sub16.anInt4365 = 0;
		    method1447(class131_sub16);
		} else {
		    class131_sub16.anInt4365 = i_0_;
		    method1443(class131_sub16.aClass131_1783, class131_sub16);
		}
	    }
	} while (arg2 != 0);
    }
    
    public void method1444(int arg0) {
	for (Class131_Sub1 class131_sub1
		 = (Class131_Sub1) aClass119_5528.method1007(0);
	     class131_sub1 != null;
	     class131_sub1 = (Class131_Sub1) aClass119_5528.method1014(0))
	    class131_sub1.method1360(arg0);
    }
    
    public synchronized void method1360(int arg0) {
	do {
	    if (anInt5531 < 0) {
		method1444(arg0);
		break;
	    }
	    if (anInt5530 + arg0 < anInt5531) {
		anInt5530 += arg0;
		method1444(arg0);
		break;
	    }
	    int i = anInt5531 - anInt5530;
	    method1444(i);
	    arg0 -= i;
	    anInt5530 += i;
	    method1442();
	    Class131_Sub16 class131_sub16
		= (Class131_Sub16) aClass119_5529.method1007(0);
	    synchronized (class131_sub16) {
		int i_1_ = class131_sub16.method1798(this);
		if (i_1_ < 0) {
		    class131_sub16.anInt4365 = 0;
		    method1447(class131_sub16);
		} else {
		    class131_sub16.anInt4365 = i_1_;
		    method1443(class131_sub16.aClass131_1783, class131_sub16);
		}
	    }
	} while (arg0 != 0);
    }
    
    public void method1445(int[] arg0, int arg1, int arg2) {
	for (Class131_Sub1 class131_sub1
		 = (Class131_Sub1) aClass119_5528.method1007(0);
	     class131_sub1 != null;
	     class131_sub1 = (Class131_Sub1) aClass119_5528.method1014(0))
	    class131_sub1.method1358(arg0, arg1, arg2);
    }
    
    public synchronized void method1446(Class131_Sub1 arg0) {
	aClass119_5528.method1016(arg0, 0);
    }
    
    public void method1447(Class131_Sub16 arg0) {
	arg0.method1355((byte) 114);
	arg0.method1799();
	Class131 class131 = aClass119_5529.aClass131_1553.aClass131_1783;
	if (class131 == aClass119_5529.aClass131_1553)
	    anInt5531 = -1;
	else
	    anInt5531 = ((Class131_Sub16) class131).anInt4365;
    }
}
