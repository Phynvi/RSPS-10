/* Class215_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class215_Sub1 extends Class215
{
    public static Interface8 anInterface8_4968;
    public int anInt4969;
    
    public void method2797(int arg0) throws Exception {
	if (arg0 > 32768)
	    throw new IllegalArgumentException();
	anInterface8_4968.method30(arg0, anInt4969, true);
    }
    
    public void method2796(Component arg0) throws Exception {
	anInterface8_4968.method32(Class131_Sub2_Sub10_Sub1.aBoolean6534, 91,
				   arg0, Class131_Sub2_Sub14.anInt5754);
    }
    
    public static void method2808() {
	anInterface8_4968 = null;
    }
    
    public void method2794() {
	anInterface8_4968.method31(anInt4969, 26853);
    }
    
    public int method2792() {
	return anInterface8_4968.method28(anInt4969, (byte) 60);
    }
    
    public void method2807() {
	anInterface8_4968.method33(anInt4969, anIntArray3169);
    }
    
    public void method2804() {
	anInterface8_4968.method29(93, anInt4969);
    }
    
    public Class215_Sub1(SignLink arg0, int arg1) {
	anInterface8_4968 = arg0.method2686(-2);
	anInt4969 = arg1;
    }
}
