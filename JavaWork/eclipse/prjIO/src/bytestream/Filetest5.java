package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filetest5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fin =
				new FileInputStream("C:\\netsong7\\JavaWork\\test.txt");
		
		FileInputStream din =
				new FileInputStream("C:\\netsong7\\JavaWork\\test2.txt");
		
		int data1 = fin.read();
		int data2 = din.read();
		
		if ((char)data1 == (char)data2) {
			System.out.println("파일이 같습니다.");
		}
		else {
			System.out.println("파일이 다릅니다.");
		}
		
	}

}
