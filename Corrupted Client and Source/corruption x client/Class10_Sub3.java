/* Class10_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import jaggl.opengl;

public class Class10_Sub3 extends Class10
{
    public Class26 aClass26_3634;
    public Class54 aClass54_3635;
    public static float[] aFloatArray3636 = new float[4];
    public int anInt3637;
    public Class170 aClass170_3638;
    public FloatBuffer aFloatBuffer3639;
    
    public Class10_Sub3(Class130_Sub2 arg0, Class170 arg1) {
	super(arg0);
	aClass170_3638 = arg1;
	if (aClass130_Sub2_121.aBoolean3403
	    && aClass130_Sub2_121.anInt3351 >= 2) {
	    aClass26_3634
		= (Class26.method406
		   (aClass130_Sub2_121, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND"));
	    if (aClass26_3634 != null) {
		int[][] is = Class121_Sub1.method1046(-11590, 8, 256, 0.4F, 3,
						      false, 64, 0, 4);
		int[][] is_0_ = Class121_Sub1.method1046(-11590, 8, 256, 0.4F,
							 3, false, 64, 8, 4);
		RawStream class131_sub15_sub1
		    = new RawStream(262144);
		for (int i = 0; i < 256; i++) {
		    int[] is_1_ = is[i];
		    int[] is_2_ = is_0_[i];
		    for (int i_3_ = 0; i_3_ < 64; i_3_++) {
			if (aClass130_Sub2_121.aBoolean3360) {
			    class131_sub15_sub1.method1783(((float) is_1_[i_3_]
							    / 4096.0F),
							   (byte) 126);
			    class131_sub15_sub1.method1783(((float) is_2_[i_3_]
							    / 4096.0F),
							   (byte) 126);
			    class131_sub15_sub1.method1783(1.0F, (byte) 126);
			    class131_sub15_sub1.method1783(1.0F, (byte) 126);
			} else {
			    class131_sub15_sub1.method1782(((float) is_1_[i_3_]
							    / 4096.0F),
							   (byte) -30);
			    class131_sub15_sub1.method1782(((float) is_2_[i_3_]
							    / 4096.0F),
							   (byte) -30);
			    class131_sub15_sub1.method1782(1.0F, (byte) -30);
			    class131_sub15_sub1.method1782(1.0F, (byte) -30);
			}
		    }
		}
		ByteBuffer bytebuffer
		    = ByteBuffer.allocateDirect
			  (class131_sub15_sub1.offset)
			  .order(ByteOrder.nativeOrder());
		bytebuffer.put(class131_sub15_sub1.data, 0,
			       class131_sub15_sub1.offset);
		bytebuffer.flip();
		aFloatBuffer3639
		    = bytebuffer.asFloatBuffer().asReadOnlyBuffer();
		method205();
	    }
	}
    }
    
    public void method204(boolean arg0) {
	if (aClass54_3635 != null) {
	    opengl var_opengl = aClass130_Sub2_121.anOpengl3304;
	    aClass54_3635.method609('\0');
	    aClass130_Sub2_121.method1280(1);
	    var_opengl.glMatrixMode(5890);
	    var_opengl.glLoadMatrixf(aClass130_Sub2_121.aClass9_Sub1_3373
					 .method195((byte) 107),
				     0);
	    var_opengl.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
	    var_opengl.glMatrixMode(5888);
	    aClass130_Sub2_121.method1280(0);
	    if (anInt3637 != aClass130_Sub2_121.anInt3324) {
		int i = aClass130_Sub2_121.anInt3324 % 5120 * 256 / 5120;
		i *= 256;
		for (int i_4_ = 0; i_4_ < 64; i_4_++) {
		    aFloatBuffer3639.position(i);
		    var_opengl.glProgramLocalParameter4fvARB(34336, i_4_,
							     aFloatBuffer3639);
		    i += 4;
		}
		if (aClass170_3638.aBoolean2276) {
		    float f = ((float) (aClass130_Sub2_121.anInt3324 % 4000)
			       / 4000.0F);
		    var_opengl.glProgramLocalParameter4fARB(34336, 65, f, 0.0F,
							    0.0F, 1.0F);
		} else
		    var_opengl.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		anInt3637 = aClass130_Sub2_121.anInt3324;
	    }
	}
    }
    
    public boolean method203() {
	return true;
    }
    
    public void method199() {
	if (aClass54_3635 != null) {
	    aClass54_3635.method609('\001');
	    aClass130_Sub2_121.method1280(1);
	    aClass130_Sub2_121.method1347(null);
	    aClass130_Sub2_121.method1280(0);
	}
    }
    
    public void method201(Class36 arg0) {
	aClass130_Sub2_121.method1347(arg0);
    }
    
    public void method200(int arg0) {
	if (aClass54_3635 != null) {
	    aClass130_Sub2_121.method1280(1);
	    if ((arg0 & 0x80) == 0) {
		if (!aClass170_3638.aBoolean2276) {
		    int i = aClass130_Sub2_121.anInt3324 % 4000 * 16 / 4000;
		    aClass130_Sub2_121
			.method1347(aClass170_3638.aClass36_Sub1Array2272[i]);
		} else
		    aClass130_Sub2_121
			.method1347(aClass170_3638.aClass36_Sub2_2271);
	    } else
		aClass130_Sub2_121.method1347(null);
	    aClass130_Sub2_121.method1280(0);
	    opengl var_opengl = aClass130_Sub2_121.anOpengl3304;
	    if ((arg0 & 0x40) == 0) {
		var_opengl.glGetFloatv(2899, aFloatArray3636, 0);
		var_opengl.glProgramLocalParameter4fvARB(34336, 66,
							 aFloatArray3636, 0);
	    } else
		var_opengl.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
							1.0F, 1.0F);
	    int i = arg0 & 0x3;
	    if (i == 2)
		var_opengl.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
							1.0F, 1.0F);
	    else if (i == 3)
		var_opengl.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
							1.0F, 1.0F);
	    else
		var_opengl.glProgramLocalParameter4fARB(34336, 64, 0.025F,
							1.0F, 1.0F, 1.0F);
	}
    }
    
    public void method202(boolean bool) {
	/* empty */
    }
    
    public void method205() {
	opengl var_opengl = aClass130_Sub2_121.anOpengl3304;
	aClass54_3635 = new Class54(aClass130_Sub2_121, 2);
	aClass54_3635.method607(0);
	aClass130_Sub2_121.method1280(1);
	aClass130_Sub2_121.method1314(260, 7681);
	aClass130_Sub2_121.method1277(0, 34168, 770);
	aClass130_Sub2_121.method1280(0);
	var_opengl.glBindProgramARB(34336, aClass26_3634.anInt266);
	var_opengl.glEnable(34336);
	aClass54_3635.method608();
	aClass54_3635.method607(1);
	aClass130_Sub2_121.method1280(1);
	var_opengl.glMatrixMode(5890);
	var_opengl.glLoadIdentity();
	var_opengl.glMatrixMode(5888);
	aClass130_Sub2_121.method1342(1);
	aClass130_Sub2_121.method1277(0, 5890, 770);
	aClass130_Sub2_121.method1280(0);
	var_opengl.glBindProgramARB(34336, 0);
	var_opengl.glDisable(34336);
	var_opengl.glDisable(34820);
	aClass54_3635.method608();
    }
}
