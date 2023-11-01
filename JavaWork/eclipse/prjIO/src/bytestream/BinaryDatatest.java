package bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryDatatest {

	public static void main(String[] args) throws IOException{
		// TODO DataInputStream, DataOutputStream
		FileOutputStream font = 
				new FileOutputStream("C:\\netsong7\\JavaWork\\test4.txt");
		
		DataOutputStream dont = 
				new DataOutputStream(font);
		dont.write('가');
		dont.writeInt(100);
		dont.writeDouble(3.14);
		dont.writeBoolean(true);
		
		font.close();
		dont.close();
		
		DataInputStream din =
				new DataInputStream(
						new FileInputStream("C:\\netsong7\\JavaWork\\test4.txt"));
		
		System.out.println(din.readChar());
		System.out.println(din.readInt());
		System.out.println(din.readDouble());
		System.out.println(din.readBoolean());
		
		din.close();
		
	}
	

}
