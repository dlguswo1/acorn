package bytestream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Bytetest2 {
	static void Streamtest(InputStream in, OutputStream out) throws IOException{
		
		int input = in.read();
		
		while(input != -1) {
			// -1 : Ctrl + z
			
			System.out.write((char)input);
			input = System.in.read();
		}
	}
	
	public static void main(String[] args) throws IOException{
		Streamtest(System.in, System.out);
	}

}