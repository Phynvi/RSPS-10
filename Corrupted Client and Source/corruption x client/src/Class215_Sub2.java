/* Class215_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class Class215_Sub2 extends Class215
{
    public AudioFormat anAudioFormat4970;
    public SourceDataLine aSourceDataLine4971;
    public int anInt4972;
    public byte[] aByteArray4973;
    public boolean aBoolean4974 = false;
    public static Class aClass4975;
    
    public void method2797(int arg0) throws LineUnavailableException {
	try {
	    DataLine.Info info
		= (new DataLine.Info
		   ((aClass4975 == null
		     ? (aClass4975
			= method2809("javax.sound.sampled.SourceDataLine"))
		     : aClass4975),
		    anAudioFormat4970,
		    arg0 << (Class131_Sub2_Sub10_Sub1.aBoolean6534 ? 2 : 1)));
	    aSourceDataLine4971 = (SourceDataLine) AudioSystem.getLine(info);
	    aSourceDataLine4971.open();
	    aSourceDataLine4971.start();
	    anInt4972 = arg0;
	} catch (LineUnavailableException lineunavailableexception) {
	    if (1 != Class131_Sub20.method1817(28135, arg0))
		method2797(Class101.method887(1388313616, arg0));
	    else {
		aSourceDataLine4971 = null;
		throw lineunavailableexception;
	    }
	}
    }
    
    public int method2792() {
	int i;
	try {
	    i = anInt4972 - (aSourceDataLine4971.available()
			     >> (!Class131_Sub2_Sub10_Sub1.aBoolean6534 ? 1
				 : 2));
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public void method2804() throws LineUnavailableException {
	aSourceDataLine4971.flush();
	if (aBoolean4974) {
	    aSourceDataLine4971.close();
	    aSourceDataLine4971 = null;
	    DataLine.Info info
		= (new DataLine.Info
		   ((aClass4975 == null
		     ? (aClass4975
			= method2809("javax.sound.sampled.SourceDataLine"))
		     : aClass4975),
		    anAudioFormat4970,
		    anInt4972 << (!Class131_Sub2_Sub10_Sub1.aBoolean6534 ? 1
				  : 2)));
	    aSourceDataLine4971 = (SourceDataLine) AudioSystem.getLine(info);
	    aSourceDataLine4971.open();
	    aSourceDataLine4971.start();
	}
    }
    
    public void method2794() {
	if (aSourceDataLine4971 != null) {
	    aSourceDataLine4971.close();
	    aSourceDataLine4971 = null;
	}
    }
    
    public void method2796(Component arg0) {
	Mixer.Info[] infos = AudioSystem.getMixerInfo();
	if (null != infos) {
	    Mixer.Info[] infos_0_ = infos;
	    for (int i = 0; i < infos_0_.length; i++) {
		Mixer.Info info = infos_0_[i];
		if (null != info) {
		    String string = info.getName();
		    if (string != null
			&& 0 <= string.toLowerCase().indexOf("soundmax"))
			aBoolean4974 = true;
		}
	    }
	}
	anAudioFormat4970
	    = new AudioFormat((float) Class131_Sub2_Sub14.anInt5754, 16,
			      !Class131_Sub2_Sub10_Sub1.aBoolean6534 ? 1 : 2,
			      true, false);
	aByteArray4973
	    = new byte[256 << (!Class131_Sub2_Sub10_Sub1.aBoolean6534 ? 1
			       : 2)];
    }
    
    public void method2807() {
	int i = 256;
	if (Class131_Sub2_Sub10_Sub1.aBoolean6534)
	    i <<= 1;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    int i_2_ = anIntArray3169[i_1_];
	    if ((i_2_ + 8388608 & ~0xffffff) != 0)
		i_2_ = 0x7fffff ^ i_2_ >> 31;
	    aByteArray4973[i_1_ * 2] = (byte) (i_2_ >> 8);
	    aByteArray4973[i_1_ * 2 + 1] = (byte) (i_2_ >> 16);
	}
	aSourceDataLine4971.write(aByteArray4973, 0, i << 1);
    }
    
    public static Class method2809(String arg0) {
	Class var_class;
	try {
	    var_class = Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    return null;
	}
	return var_class;
    }
}
