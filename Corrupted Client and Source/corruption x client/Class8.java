/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class8
{
    public long aLong104;
    public RandomAccessFile aRandomAccessFile105;
    public File aFile106;
    public long aLong107;
    
    public void method168(byte[] arg0, int arg1, int arg2, int arg3)
	throws IOException {
	if (aLong107 < (long) arg3 + aLong104) {
	    aRandomAccessFile105.seek(aLong107);
	    aRandomAccessFile105.write(1);
	    throw new EOFException();
	}
	if (arg1 == 1) {
	    aRandomAccessFile105.write(arg0, arg2, arg3);
	    aLong104 += (long) arg3;
	}
    }
    
    public void method169(long arg0, int arg1) throws IOException {
	aRandomAccessFile105.seek(arg0);
	if (arg1 != -16156)
	    aLong104 = 36L;
	aLong104 = arg0;
    }
    
    public void finalize() throws Throwable {
	if (null != aRandomAccessFile105) {
	    System.out.println
		(new StringBuilder().append("Warning! fileondisk ").append
		     (aFile106).append
		     (" not closed correctly using close(). Auto-closing instead. ")
		     .toString());
	    method170(1);
	}
    }
    
    public void method170(int arg0) throws IOException {
	if (null != aRandomAccessFile105) {
	    aRandomAccessFile105.close();
	    aRandomAccessFile105 = null;
	}
	if (arg0 != 1)
	    method171((byte) 84);
    }
    
    public File method171(byte arg0) {
	if (arg0 != -114)
	    aLong107 = 119L;
	File file = aFile106;
	return file;
    }
    
    public long method172(int arg0) throws IOException {
	if (arg0 >= -91)
	    aFile106 = null;
	long l = aRandomAccessFile105.length();
	return l;
    }
    
    public Class8(File arg0, String arg1, long arg2) throws IOException {
	if (0L == (arg2 ^ 0xffffffffffffffffL))
	    arg2 = 9223372036854775807L;
	if ((arg0.length() ^ 0xffffffffffffffffL)
	    < (arg2 ^ 0xffffffffffffffffL))
	    arg0.delete();
	aRandomAccessFile105 = new RandomAccessFile(arg0, arg1);
	aFile106 = arg0;
	aLong107 = arg2;
	aLong104 = 0L;
	int i = aRandomAccessFile105.read();
	if (0 != (i ^ 0xffffffff) && !arg1.equals("r")) {
	    aRandomAccessFile105.seek(0L);
	    aRandomAccessFile105.write(i);
	}
	aRandomAccessFile105.seek(0L);
    }
    
    public int method173(int arg0, byte[] arg1, int arg2, int arg3)
	throws IOException {
	if (arg3 != 0)
	    aLong107 = -91L;
	int i = aRandomAccessFile105.read(arg1, arg2, arg0);
	if (-1 > (i ^ 0xffffffff))
	    aLong104 += (long) i;
	int i_0_ = i;
	return i_0_;
    }
}
