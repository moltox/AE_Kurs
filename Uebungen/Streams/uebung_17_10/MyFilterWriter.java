package uebung_17_10;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFilterWriter extends FilterWriter {

	public MyFilterWriter(Writer out) {
		super(out);
	}

	@Override
	public void write(int c) {
		char ch = (char) c;
		if ((ch < '0' || ch > '9') && ( ch < 'A' || ch > 'Z') && ( ch < 'a' || ch > 'z')){
			ch = '*';
		}
			try {
				super.write(ch);
			} catch (IOException except) {
				// TODO Auto-generated catch block
				except.printStackTrace();
			}
	}
	
	@Override
	public void write(char[] cbuf, int off, int len){
		if(off > cbuf.length || len > cbuf.length){
			throw new ArrayIndexOutOfBoundsException("char[] buffer overflow");
		}

		for(int c = 0; c < len; c++){
			write(cbuf[c+off]);
		}
	}
	
	@Override
	public void write(String str, int off, int len){
		write(str.toCharArray(),off,len);
	}
}
