/* Class131_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class131_Sub32 extends Class131
{
    public static int anInt4547;
    public static int anInt4548;
    public static String aString4549;
    public long aLong4550;
    public static String aString4551 = "flash2:";
    public static int anInt4552;
    public static boolean aBoolean4553;
    
    public static void method1865(int arg0) {
	aString4549 = null;
	aString4551 = null;
	if (arg0 != 6234)
	    aString4549 = null;
    }
    
    public static byte[] method1866(int arg0, boolean arg1, Object arg2) {
	try {
	    anInt4548++;
	    if (arg2 == null)
		return null;
	    if (arg0 != 0)
		method1867(77, null, -79);
	    if (arg2 instanceof byte[]) {
		byte[] is = (byte[]) arg2;
		if (arg1)
		    return Class131_Sub42.method2089(is, (byte) -128);
		return is;
	    }
	    if (arg2 instanceof Class197) {
		Class197 class197 = (Class197) arg2;
		return class197.method2678((byte) -45);
	    }
	    throw new IllegalArgumentException();
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sl.C(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1867(int arg0, PacketStream arg1,
				  int arg2) {
	try {
	    anInt4547++;
	    if (arg0 != -19)
		aString4549 = null;
	    for (;;) {
		Class131_Sub7 class131_sub7
		    = (Class131_Sub7) Class59.aClass119_772.method1007(0);
		if (class131_sub7 == null)
		    break;
		boolean bool = false;
		for (int i = 0; i < class131_sub7.anInt4174; i++) {
		    if (class131_sub7.aClass139Array4179[i] != null) {
			if (class131_sub7.aClass139Array4179[i].anInt1864 == 2)
			    class131_sub7.anIntArray4170[i] = -5;
			if (class131_sub7.aClass139Array4179[i].anInt1864 == 0)
			    bool = true;
		    }
		    if (class131_sub7.aClass139Array4177[i] != null) {
			if (class131_sub7.aClass139Array4177[i].anInt1864 == 2)
			    class131_sub7.anIntArray4170[i] = -6;
			if (class131_sub7.aClass139Array4177[i].anInt1864 == 0)
			    bool = true;
		    }
		}
		if (bool)
		    break;
		arg1.createPacket(arg2);
		arg1.writeByte(0);
		int i = arg1.offset;
		arg1.writeInt(class131_sub7.anInt4172);
		for (int i_0_ = 0; i_0_ < class131_sub7.anInt4174; i_0_++) {
		    if ((class131_sub7.anIntArray4170[i_0_] ^ 0xffffffff)
			!= -1)
			arg1.writeByte(class131_sub7.anIntArray4170[i_0_]);
		    else {
			try {
			    int i_1_ = class131_sub7.anIntArray4167[i_0_];
			    if ((i_1_ ^ 0xffffffff) != -1) {
				if ((i_1_ ^ 0xffffffff) == -2) {
				    Field field
					= ((Field)
					   (class131_sub7.aClass139Array4179
					    [i_0_].anObject1866));
				    field.setInt(null,
						 (class131_sub7.anIntArray4181
						  [i_0_]));
				    arg1.writeByte(0);
				} else if ((i_1_ ^ 0xffffffff) == -3) {
				    Field field
					= ((Field)
					   (class131_sub7.aClass139Array4179
					    [i_0_].anObject1866));
				    int i_2_ = field.getModifiers();
				    arg1.writeByte(0);
				    arg1.writeInt(i_2_);
				}
			    } else {
				Field field
				    = (Field) (class131_sub7.aClass139Array4179
					       [i_0_].anObject1866);
				int i_3_ = field.getInt(null);
				arg1.writeByte(0);
				arg1.writeInt(i_3_);
			    }
			    if ((i_1_ ^ 0xffffffff) != -4) {
				if (i_1_ == 4) {
				    Method method
					= ((Method)
					   (class131_sub7.aClass139Array4177
					    [i_0_].anObject1866));
				    int i_4_ = method.getModifiers();
				    arg1.writeByte(0);
				    arg1.writeInt(i_4_);
				}
			    } else {
				Method method = (Method) (class131_sub7
							  .aClass139Array4177
							  [i_0_].anObject1866);
				byte[][] is
				    = (class131_sub7.aByteArrayArrayArray4166
				       [i_0_]);
				Object[] objects = new Object[is.length];
				for (int i_5_ = 0;
				     ((is.length ^ 0xffffffff)
				      < (i_5_ ^ 0xffffffff));
				     i_5_++) {
				    ObjectInputStream objectinputstream
					= (new ObjectInputStream
					   (new ByteArrayInputStream(is
								     [i_5_])));
				    objects[i_5_]
					= objectinputstream.readObject();
				}
				Object object = method.invoke(null, objects);
				if (object == null)
				    arg1.writeByte(0);
				else if (!(object instanceof Number)) {
				    if (!(object instanceof String))
					arg1.writeByte(4);
				    else {
					arg1.writeByte(2);
					arg1.writeString((String) object,
							(byte) 35);
				    }
				} else {
				    arg1.writeByte(1);
				    arg1.method1747((byte) 120,
						    ((Number) object)
							.longValue());
				}
			    }
			} catch (ClassNotFoundException classnotfoundexception) {
			    arg1.writeByte(-10);
			} catch (java.io.InvalidClassException invalidclassexception) {
			    arg1.writeByte(-11);
			} catch (java.io.StreamCorruptedException streamcorruptedexception) {
			    arg1.writeByte(-12);
			} catch (java.io.OptionalDataException optionaldataexception) {
			    arg1.writeByte(-13);
			} catch (IllegalAccessException illegalaccessexception) {
			    arg1.writeByte(-14);
			} catch (IllegalArgumentException illegalargumentexception) {
			    arg1.writeByte(-15);
			} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
			    arg1.writeByte(-16);
			} catch (SecurityException securityexception) {
			    arg1.writeByte(-17);
			} catch (java.io.IOException ioexception) {
			    arg1.writeByte(-18);
			} catch (NullPointerException nullpointerexception) {
			    arg1.writeByte(-19);
			} catch (Exception exception) {
			    arg1.writeByte(-20);
			} catch (Throwable throwable) {
			    arg1.writeByte(-21);
			}
		    }
		}
		arg1.method1735(i, -104);
		arg1.method1727(-i + arg1.offset, (byte) -42);
		class131_sub7.method1355((byte) 125);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("sl.A(" + arg0 + ','
						 + (arg1 != null ? "{...}"
						    : "null")
						 + ',' + arg2 + ')'));
	}
    }
    
    public Class131_Sub32() {
	/* empty */
    }
    
    public Class131_Sub32(long arg0) {
	try {
	    aLong4550 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"sl.<init>(" + arg0 + ')');
	}
    }
    
    static {
	aString4549 = "purple:";
	aBoolean4553 = false;
    }
}
